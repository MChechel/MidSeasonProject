package persistence;

import model.Customer;
import model.Orders;
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

    public List<ReportOnOrders> getOrderReport(){
        //i had next line to add each column one by one
//        String mySQL = "SELECT concat('Order id is ',o.orderId,', ',c.customer.name,' ordered ',m.cocktail.name,' for ',m.price)" +
                String mySQL = "SELECT new model.ReportOnOrders(o.orderId,c.customer.name,m.cocktail.name,m.price)" +
                " FROM Orders as o " +
                "JOIN CustomerOrder as c on c.orders.orderId=o.orderId " +
                "join Menu as m on m.menuId=o.menu.menuId";
        return entityManager.createQuery(mySQL, ReportOnOrders.class)
                .getResultList();

    }

}
