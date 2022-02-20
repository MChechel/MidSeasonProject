package persistence;

import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryBarInventory {
    private EntityManager entityManager;

    public RepositoryBarInventory(){
        this.entityManager = DbUtil.getEntityManager();
    }


}
