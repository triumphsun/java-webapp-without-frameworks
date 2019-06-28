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
 * Date: 2019/6/26
 */

@WebServlet(urlPatterns = {"/board/*"})
public class BoardController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI();
        String boardname = url.substring(url.lastIndexOf('/')+1, url.length());
        req.setAttribute("boardname", boardname);
        req.setAttribute("fragment-main", "/WEB-INF/fragment/board.jsp");
        RequestDispatcher dispatcher = req.getRequestDispatcher((String)req.getAttribute("layout-root"));
        dispatcher.forward(req, resp);
    }
}