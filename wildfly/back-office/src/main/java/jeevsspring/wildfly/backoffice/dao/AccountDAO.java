package jeevsspring.wildfly.backoffice.dao;

import jeevsspring.wildfly.backoffice.entity.AccountEntity;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Marco Romagnolo
 */
@Singleton
public class AccountDAO {

    @PersistenceContext
    EntityManager em;

    public AccountEntity getByPlayerId(String playerId) {
        return null;
    }
}
