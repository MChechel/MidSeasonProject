package persistence;

import model.BartenderData;
import model.CustomerOrder;
import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryCustomerOrder {

    private EntityManager entityManager;
    private RepositoryOrderDetails repositoryOrderDetails;

    public RepositoryCustomerOrder(){
        this.entityManager = DbUtil.getEntityManager();
        this.repositoryOrderDetails = new RepositoryOrderDetails();
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

    public void updateCustomerOrder(int id, int customerId){
        String sql = "UPDATE CustomerOrder Set customer.id=:customerId where id=:id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("customerId",customerId)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }


    public void deleteCustomerOrder(int id){
        this.repositoryOrderDetails.deleteOrderDetailsByCustomerOrderId(id);
        String sql = "delete from CustomerOrder where id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }
}
