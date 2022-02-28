package persistence;

import model.OrderDetails;
import model.Orders;
import model.Reports.ReportOnCustomerOrderCocktailList;
import model.Reports.ReportOnOrders;
import util.DbUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryOrders {

    private EntityManager entityManager;
    private RepositoryOrderDetails repositoryOrderDetails;
    public RepositoryOrders(){
        this.entityManager = DbUtil.getEntityManager();
        this.repositoryOrderDetails = new RepositoryOrderDetails();
    }

    public void saveOrder(Orders order){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(order);
            this.entityManager.getTransaction().commit();
        }catch(Exception ex){
            this.entityManager.getTransaction().rollback();
        }
    }
    public void updateOrder(int id, Orders orders){
        String sql = "UPDATE Orders as o Set o.menu.id=:menuId, o.amount=:amount where o.id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .setParameter("menuId",orders.getMenuId())
                .setParameter("amount", orders.getAmount())
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }
    public void deleteOrder(int id){
        this.repositoryOrderDetails.deleteOrderDetailsByOrderId(id);
        String sql = "delete from Orders where orderId = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
        if(result>0){
            System.out.println("Order #"+id+" was succesfully deleted");
        }
    }
    public List<ReportOnOrders> getOrderReport() {
        //i had next line to add each column one by one
//        String mySQL = "SELECT concat('Order id is ',o.orderId,', ',c.customer.name,' ordered ',m.cocktail.name,' for ',m.price)" +
        String mySQL = "SELECT new model.Reports.ReportOnOrders(o.orderId,co.customer.name,m.cocktail.name,m.price)" +
                " FROM Orders as o " +
                "JOIN OrderDetails as od on od.orders.id=o.orderId " +
                "JOIN CustomerOrder as co on co.id=od.customerOrder.id" +
                " JOIN Menu as m on m.menuId=o.menu.menuId ";
        return entityManager.createQuery(mySQL, ReportOnOrders.class)
                .getResultList();
    }
    public List<ReportOnCustomerOrderCocktailList> getCocktailsGroupedByCustomerOrder(int id) {
            //String mySQL = "SELECT concat('Cocktail name is ',m.cocktail.name,' - ',m.price, ' - ', od.customerOrder.customer.name) " +
            String mySQL = "SELECT new model.Reports.ReportOnCustomerOrderCocktailList(m.cocktail.name,m.price,od.customerOrder.customer.name)" +
                    "FROM OrderDetails as od " +
                    "JOIN Orders as o on o.orderId=od.orders.orderId " +
                    "JOIN Menu as m  on o.menu.id=m.menuId  " +
                   "Where od.customerOrder.id =:customerOrderId " +
                  "group by m.id";
//
            return entityManager.createQuery(mySQL, ReportOnCustomerOrderCocktailList.class).setParameter("customerOrderId",id).getResultList();
        }

        }


