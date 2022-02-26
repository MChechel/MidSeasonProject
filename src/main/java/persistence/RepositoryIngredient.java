package persistence;

import model.Customer;
import model.Ingredient;
import util.DbUtil;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class RepositoryIngredient {
    private EntityManager entityManager;

    public RepositoryIngredient(){
        this.entityManager = DbUtil.getEntityManager();
    }
    public void saveIngredient(Ingredient ingredient){
        try {

                this.entityManager.getTransaction().begin();
                this.entityManager.persist(ingredient);
                this.entityManager.getTransaction().commit();

        }catch(Exception ex){
            this.entityManager.getTransaction().rollback();
        }
    }

    public void updateIngredient(Ingredient ingredient){
        String sql = "UPDATE Ingredient Set price=:price where name = :name";

        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("name",ingredient.getName())
                //- should not change/update the name as it has to be unique value(and it does not let me)...so I update only price
                .setParameter("price",ingredient.getPrice())
                .executeUpdate();

        this.entityManager.getTransaction().commit();
    }
    public void deleteIngredient(int id){
        String sql = "delete from Ingredient where ingredient_id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }

    public Ingredient checkIfitemExistst(String name){
        String mySQL = "FROM Ingredient where name = :name";
     try{
        return entityManager.createQuery(mySQL,Ingredient.class)
                .setParameter("name",name)
                .getSingleResult();
    } catch(NoResultException e) {
        return null;
    }
    }


}
