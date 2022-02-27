package persistence;

import model.Customer;
import model.Orders;
import model.ReportOnCustomerOrderCocktailList;
import model.ReportOnOrders;
import org.hibernate.criterion.Order;
import util.DbUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryOrders {

    private EntityManager entityManager;

    public RepositoryOrders(){
        this.entityManager = DbUtil.getEntityManager();
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

    public List<ReportOnOrders> getOrderReport() {
        //i had next line to add each column one by one
//        String mySQL = "SELECT concat('Order id is ',o.orderId,', ',c.customer.name,' ordered ',m.cocktail.name,' for ',m.price)" +
        String mySQL = "SELECT new model.ReportOnOrders(o.orderId,co.customer.name,m.cocktail.name,m.price)" +
                " FROM Orders as o " +
                "JOIN OrderDetails as od on od.orders.id=o.orderId " +
                "JOIN CustomerOrder as co on co.id=od.customerOrder.id" +
                " JOIN Menu as m on m.menuId=o.menu.menuId ";
        return entityManager.createQuery(mySQL, ReportOnOrders.class)
                .getResultList();
    }
        public List<ReportOnCustomerOrderCocktailList> getCocktailsGroupedByCustomerOrder(int id) {
            //String mySQL = "SELECT concat('Cocktail name is ',m.cocktail.name,' - ',m.price, ' - ', od.customerOrder.customer.name) " +
            String mySQL = "SELECT new model.ReportOnCustomerOrderCocktailList(m.cocktail.name,m.price,od.customerOrder.customer.name)" +
                    "FROM OrderDetails as od " +
                    "JOIN Orders as o on o.orderId=od.orders.orderId " +
                    "JOIN Menu as m  on o.menu.id=m.menuId  " +
                   "Where od.customerOrder.id =:customerOrderId " +
                  "group by m.id";
//
            return entityManager.createQuery(mySQL, ReportOnCustomerOrderCocktailList.class).setParameter("customerOrderId",id).getResultList();
        }

        }


