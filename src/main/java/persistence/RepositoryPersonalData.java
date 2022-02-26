package persistence;

import model.Bartender;
import model.PersonalData;
import util.DbUtil;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

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

    public void updatePersonalData(int id, PersonalData personalData){
        String sql = "UPDATE PersonalData Set Address=:address, email=:email, phoneNumber=:pNum where personal_data_id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .setParameter("address",personalData.getAddress())
                .setParameter("email", personalData.getEmail())
                .setParameter("pNum",personalData.getPhoneNumber())
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }

    public void deletePersonalData(int id){
        String sql = "delete from PersonalData where personal_data_id = :id";
        this.entityManager.getTransaction().begin();
        int result = this.entityManager.createQuery(sql)
                .setParameter("id",id)
                .executeUpdate();
        this.entityManager.getTransaction().commit();
    }

    public PersonalData checkIfTableContains(int id){
        try{
            return this.entityManager.find(PersonalData.class, id);
        } catch(NoResultException e) {
            return null;
        }
    }

}
