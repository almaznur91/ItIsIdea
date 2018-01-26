package rut.almaz.servlets;

import rut.almaz.models.User;
import rut.almaz.repository.UserDao;
import rut.almaz.repository.UserDaoHibernate;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WelcomeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


       // resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        String href = "https://i.ytimg.com/vi/EE9ibCx_3nM/maxresdefault.jpg";
        String href1 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTekAjMy2QfUI6qLuaytJEGDzmiaC5OgDrRspmZ1w2Bolvg9mmC";
        String href2 = "http://art-lunch.ru/wp-content/uploads/2015/04/Pizza_Margherita_01.jpg";
        String pizza1 = "http://localhost:8080/good1";

        int a = 100;
        out.write("<!DOCTYPE html>\n" +
        "<html>\n" +
                "<head><title>" + "hi" + "</title></head>\n"+
                "<body bgcolor=\"#fdf5e6\">\n" +
                "<h1>Welcome to the site</h1>\n" +
                "<p>What do you want to eat?</p>\n" +
                "<p><a href = " + href2 +">Pizza</a></p> \n"+
                "<a href =" +pizza1+"><img width="+200+" src = "+href+">   </a> \n"+
                "<img width="+190+" src = "+href1+"\n"+


                "<img width="+100+" src = "+href2+"\n"+

                "</body></html>");

    }
}


