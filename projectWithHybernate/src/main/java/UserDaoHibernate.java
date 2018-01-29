import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class UserDaoHibernate implements UserDao {
    SessionFactory sessionFactory;

    public UserDaoHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(User model) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(model);
        session.getTransaction().commit();
    }

    @Override
    public User find(Long id) {
        Session session = sessionFactory.openSession();
        Query<User> userQuery = session.createQuery("from User where id = ?", User.class);
        userQuery.setParameter(0, id);
        return userQuery.getSingleResult();
    }

    @Override
    public void update(User model) {

        Session session = sessionFactory.openSession();
        session.update(model);
        session.getTransaction().commit();

    }

    @Override
    public void delete(User model) {
        Session session = sessionFactory.openSession();
        session.delete(model);


    }

    @Override
    public List<User> findAll() {


        return null;
    }
}
