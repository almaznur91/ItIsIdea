package rut.almaz.repository;

import rut.almaz.models.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDaoHibernate implements UserDao {
    EntityManager entityManager;

    public UserDaoHibernate(EntityManager entityManager) {
        this.entityManager=entityManager;
    }

    @Override
    public void save(User model) {
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public User find(Long id) {
        entityManager.getTransaction().begin();
        TypedQuery<User> userQuery = entityManager.createQuery("from User where id = ?", User.class);
        userQuery.setParameter(0, id);
        return userQuery.getSingleResult();
    }

    @Override
    public void update(User model) {

        entityManager.getTransaction().begin();
        entityManager.refresh(model);
        entityManager.getTransaction().commit();

    }

    @Override
    public void delete(User model) {

        entityManager.getTransaction().begin();
        entityManager.remove(model);
        entityManager.getTransaction().commit();

    }

    @Override
    public List<User> findAll() {
        entityManager.getTransaction().begin();
        TypedQuery<User> userQuery = entityManager.createQuery("from User", User.class);
        return userQuery.getResultList();

    }
}
