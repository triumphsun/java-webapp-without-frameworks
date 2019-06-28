package com.suntri.portal.web;

import com.suntri.portal.AuthenticatorImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Author: Chia-Yang, Sun
 * Email: triumph.sun@gmail.com
 * Date: 2019/6/26
 */

@WebListener
public class MyContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        if(context.getAttribute("authenticator")==null){
            context.setAttribute("authenticator", new AuthenticatorImpl());
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
