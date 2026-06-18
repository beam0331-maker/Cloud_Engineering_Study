package com.exam.filter;

import jakarta.servlet.*;

import java.io.IOException;
import java.sql.SQLSyntaxErrorException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Request Filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Response Filter");
    }
}
