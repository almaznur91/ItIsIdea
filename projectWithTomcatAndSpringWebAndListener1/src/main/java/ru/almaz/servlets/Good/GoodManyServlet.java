package ru.almaz.servlets.Good;

import ru.almaz.repository.GoodDao;
import ru.almaz.repository.GoodDaoHibernate;

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
