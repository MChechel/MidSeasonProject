package persistence;

import model.Customer;
import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryCustomer {

    private EntityManager entityManager;

    public RepositoryCustomer(){
        this.entityManager = DbUtil.getEntityManager();
    }
    public void saveCustomer(Customer customer){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(customer);
            this.entityManager.getTransaction().commit();
        }catch(Exception ex){
            this.entityManager.getTransaction().rollback();
        }
    }
    public void updateCustomer(int id, String newName){
        String sql = "UPDATE Customer Set name=:newName where customer_id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("newName",newName)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }
    public void deleteCustomer(int id){
        String sql = "delete from Customer where customer_id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }




}
