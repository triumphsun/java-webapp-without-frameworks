package com.suntri.portal.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author: Chia-Yang, Sun
 * Email: triumph.sun@gmail.com
 * Date: 2019/6/24
 */

@WebServlet(urlPatterns = {"/home"} )
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("fragment-main", "/WEB-INF/fragment/home.jsp");
        RequestDispatcher dispatcher = req.getRequestDispatcher((String)req.getAttribute("layout-root"));
        dispatcher.forward(req, resp);
    }
}
