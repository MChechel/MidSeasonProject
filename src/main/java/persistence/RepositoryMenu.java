package persistence;

import model.Menu;
import model.OrderDetails;
import org.hibernate.criterion.Order;
import util.DbUtil;

import javax.persistence.EntityManager;
import java.awt.*;

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
    public void deleteMenuItem(int id){
        String sql = "delete from Menu where menuId = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
        if(result>0){
            System.out.println("Menu item #"+id+" was successfully deleted");
        }
    }
    public void updateMenuItem(Menu menu){
        String sql = "UPDATE Menu as m Set m.price =:price where m.cocktail.name =:name";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("name",menu.getCocktail().getName())
                .setParameter("price",menu.getPrice())
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }
}
