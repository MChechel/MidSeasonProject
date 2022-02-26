package persistence;

import model.BartenderData;
import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryBartenderData {

    private EntityManager entityManager;


    public RepositoryBartenderData(){
        this.entityManager = DbUtil.getEntityManager();
    }

    public void saveData(BartenderData bartenderData){
        try {
            System.out.println("Commiting here!");
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(bartenderData);
            this.entityManager.getTransaction().commit();
            System.out.println("DONE!!!!");
        }catch(Exception ex){
            System.out.println("ERROR");
            System.out.println(ex.getMessage());
            this.entityManager.getTransaction().rollback();
        }

    }

}
