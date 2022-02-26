package persistence;

import model.Cocktail;
import org.hibernate.criterion.Order;
import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryCocktail {
    private EntityManager entityManager;

    public RepositoryCocktail(){
        this.entityManager = DbUtil.getEntityManager();
    }
    public void saveCocktail(Cocktail cocktail){
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(cocktail);
            this.entityManager.getTransaction().commit();
        }catch(Exception ex){
            this.entityManager.getTransaction().rollback();
        }
    }
}
