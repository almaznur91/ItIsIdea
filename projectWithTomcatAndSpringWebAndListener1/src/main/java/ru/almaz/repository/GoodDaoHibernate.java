package ru.almaz.repository;

import ru.almaz.models.Good;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class GoodDaoHibernate implements GoodDao {


    EntityManager entityManager;

    public GoodDaoHibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public void save(Good model) {
    entityManager.persist(model);
    entityManager.getTransaction().commit();
    }

    @Override
    public Good find(Long id) {
        TypedQuery<Good>goodQuery =entityManager.createQuery("from Good where id = ?", Good.class);
        goodQuery.setParameter(0,id);
        return goodQuery.getSingleResult();
    }

    @Override
    public void update(Good model) {

    }

    @Override
    public void delete(Good model) {

    }

    @Override
    public List<Good> findAll() {
        return null;
    }
}
