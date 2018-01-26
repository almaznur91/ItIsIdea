package ru.almaz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import ru.almaz.repository.UserDao;
import ru.almaz.repository.UserDaoHibernate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Controller {

    @Autowired
    UserDao userDao;


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {
        ModelAndView modelAndView = new ModelAndView("users_page");
        modelAndView.addObject("users", userDao.findAll());
        return modelAndView;
    }
}