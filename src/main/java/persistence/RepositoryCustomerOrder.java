package persistence;

import model.BartenderData;
import model.CustomerOrder;
import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryCustomerOrder {

    private EntityManager entityManager;


    public RepositoryCustomerOrder(){
        this.entityManager = DbUtil.getEntityManager();
    }

    public void saveData(CustomerOrder customerOrder){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(customerOrder);
            this.entityManager.getTransaction().commit();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            this.entityManager.getTransaction().rollback();
        }

    }
}
