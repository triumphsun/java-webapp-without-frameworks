package com.suntri.portal.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Author: Chia-Yang, Sun
 * Email: triumph.sun@gmail.com
 * Date: 2019/6/24
 */


@WebFilter(urlPatterns = {"/", "/login"})
public class GuestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute("layout-root", "/WEB-INF/layout/layout-html-basic.jsp");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
