package persistence;

import model.Bartender;
import model.Customer;
import model.ReportOnOrders;
import util.DbUtil;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

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

    public Customer checkIfTableContains(int id){
        String mySQL = "FROM Ingredient where name = :name";
        try{
            return this.entityManager.find(Customer.class, id);
        } catch(NoResultException e) {
            return null;
        }
    }

    public List<Customer> getListOfAllCustomers(){
        String mySQL = "SELECT new model.Customer(C.customerId, C.name, C.dateOfRegister) " +
                "FROM Customer as C";
        return entityManager.createQuery(mySQL,Customer.class)
                .getResultList();
    }

    public Long getAmountOfCustomersByDate(){
        String mySQL = "SELECT count(C.customerId) " +
                "FROM Customer as C";
        return entityManager.createQuery(mySQL, Long.class)
                .getSingleResult();
    }
    public String getAmountOfCustomersByDate1(){
        String mySQL = "SELECT CONCAT( count(C.customerId),' - amount of customers registered on  ',C.dateOfRegister )" +
                "FROM Customer as C " +
                "GROUP BY C.dateOfRegister";
        return entityManager.createQuery(mySQL, String.class)
                .getSingleResult();
    }

}
