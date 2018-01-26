package ru.almaz.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ru.almaz.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoHibernate implements UserDao {

    public static final String SQL_SELECT_ALL_USERS = "SELECT *FROM users";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void save(User model) {
        entityManager.persist(model);
    }

    @Override
    @Transactional
    public User find(Long id) {
        TypedQuery<User> userQuery = entityManager.createQuery("from User where id = ?", User.class);
        userQuery.setParameter(0, id);
        return userQuery.getSingleResult();
    }

    @Override
    @Transactional
    public void update(User model) {

        entityManager.refresh(model);

    }

    @Override
    @Transactional
    public void delete(User model) {

        entityManager.remove(model);

    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL_USERS,(row,rowNumber) ->
                User.builder()
                        .id(row.getLong("id"))
                        .userLogin(row.getString("userLogin"))
                        .userPassword(row.getString("userPassword"))
                        .name(row.getString("name"))
                        .email(row.getString("email"))
                        .build());
   }
//    @Override
//    @Transactional
//    public List<User> findAll() {
//        TypedQuery<User> userQuery = entityManager.createQuery("from User", User.class);
//        return userQuery.getResultList();
//
//    }
}
