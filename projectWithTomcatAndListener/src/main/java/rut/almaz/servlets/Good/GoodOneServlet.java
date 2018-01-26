package rut.almaz.servlets.Good;

import rut.almaz.models.Good;
import rut.almaz.models.User;
import rut.almaz.repository.GoodDao;
import rut.almaz.repository.GoodDaoHibernate;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GoodOneServlet extends HttpServlet {

    private GoodDao goodRepository;


    @Override
    public void init() throws ServletException {

        EntityManager entityManager = Persistence.createEntityManagerFactory("ru.itpark.persistence")
                .createEntityManager();
        goodRepository = new GoodDaoHibernate(entityManager);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        Good good1 = goodRepository.find(1L);
        String href = "https://i.ytimg.com/vi/EE9ibCx_3nM/maxresdefault.jpg";

        writer.write("<table>");
        writer.write("<td>" + good1.getName() + "</td>");
        writer.write("<td>" + good1.getPrice() + " рублей" + "</td>");
        writer.write("<td>" + good1.getCcal() + " ссal" + "</td>");
        writer.write("<td>" + good1.getWeight() + " г" + "</td>");
        writer.write("</table>");
        writer.write("<img width="+190+" src = "+href+">");

    }
}
