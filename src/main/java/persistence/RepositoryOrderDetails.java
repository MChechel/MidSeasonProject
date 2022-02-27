package persistence;

import model.Customer;
import model.CustomerOrder;
import model.OrderDetails;
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

}
