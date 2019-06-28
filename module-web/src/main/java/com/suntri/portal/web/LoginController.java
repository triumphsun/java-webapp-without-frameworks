package com.suntri.portal.web;

import com.suntri.portal.member.Authenticator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns="/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("fragment-main", "/WEB-INF/fragment/login.jsp");
        RequestDispatcher dispatcher = req.getRequestDispatcher((String)req.getAttribute("layout-root"));
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Authenticator authenticator = (Authenticator) getServletContext().getAttribute("authenticator");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(authenticator.authenticate(username, password)){
            req.getSession().setAttribute("username", username);
            resp.sendRedirect(req.getContextPath() + "/home");
        } else {
            req.setAttribute("fragment-main", "/WEB-INF/fragment/login.jsp");
            RequestDispatcher dispatcher = req.getRequestDispatcher((String)req.getAttribute("layout-root"));
            dispatcher.forward(req, resp);
        }
    }
}