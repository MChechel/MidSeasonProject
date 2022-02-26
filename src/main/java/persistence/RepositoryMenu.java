package persistence;

import model.Menu;
import org.hibernate.criterion.Order;
import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryMenu {
    private EntityManager entityManager;

    public RepositoryMenu(){
        this.entityManager = DbUtil.getEntityManager();
    }
    public void saveMenuItem(Menu menu){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(menu);
            this.entityManager.getTransaction().commit();
        }catch(Exception ex){
            this.entityManager.getTransaction().rollback();
        }
    }
}
