package persistence;

import model.PersonalData;
import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryPersonalData {

    private EntityManager entityManager;

    public RepositoryPersonalData(){
        this.entityManager = DbUtil.getEntityManager();
    }

    public void savePersonalData(PersonalData personalData){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(personalData);
            this.entityManager.getTransaction().commit();
        }catch(Exception ex){
            this.entityManager.getTransaction().rollback();
        }
    }
}
