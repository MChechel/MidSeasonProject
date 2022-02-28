package persistence;

import model.Customer;
import model.CustomerOrder;
import model.OrderDetails;
import model.Orders;
import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryOrderDetails {
    private EntityManager entityManager;


    public RepositoryOrderDetails(){
        this.entityManager = DbUtil.getEntityManager();
    }

    public void saveData(OrderDetails orderDetails) {
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(orderDetails);
            this.entityManager.getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            this.entityManager.getTransaction().rollback();
        }
    }
    public void deleteOrderDetailsByOrderId(int id){
        String sql = "delete from OrderDetails where orders.id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
        if(result>0){
            System.out.println("OrderDetails #"+id+" was successfully deleted(it was child)");
        }
    }
    public void deleteOrderDetailsByCustomerOrderId(int id){
        String sql = "delete from OrderDetails where customerOrder.id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
        if(result>0){
            System.out.println("OrderDetails #"+id+" was successfully deleted(it was child)");
        }
    }

    public void updateOrderDetails(int id, OrderDetails orderDetails){
        String sql = "UPDATE OrderDetails as od Set od.orders.orderId = :orderId, od.customerOrder.id=:customerId where od.id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .setParameter("orderId",orderDetails.getOrders().getOrderId())
                .setParameter("customerId", orderDetails.getCustomerOrder().getId())
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }

}
