package persistence;

import model.Bartender;
import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryBarTender {

    private EntityManager entityManager;

    public RepositoryBarTender(){
        this.entityManager = DbUtil.getEntityManager();
    }
    public void saveBartender(Bartender barT){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(barT);
            this.entityManager.getTransaction().commit();
        }catch(Exception ex){
            this.entityManager.getTransaction().rollback();
        }
    }


}
