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
    public void updateBartender(int id, String newName){
        String sql = "UPDATE Bartender Set name=:newName where bartender_id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("newName",newName)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }
    public void deleteBartender(int id){
        String sql = "delete from Bartender where bartender_id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }




}
