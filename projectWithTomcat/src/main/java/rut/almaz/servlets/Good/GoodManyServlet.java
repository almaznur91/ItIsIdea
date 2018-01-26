package rut.almaz.servlets.Good;

import rut.almaz.repository.GoodDao;
import rut.almaz.repository.GoodDaoHibernate;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class GoodManyServlet extends HttpServlet{
    private GoodDao goodRepositiry;


    @Override
    public void init() throws ServletException {
        EntityManager entityManager = Persistence.createEntityManagerFactory("ru.itpark.persistence")
                .createEntityManager();


        goodRepositiry = new GoodDaoHibernate(entityManager);

    }



}
