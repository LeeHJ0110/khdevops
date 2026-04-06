package com.kh.app10.filter;


import jakarta.servlet.*;

import java.io.IOException;

public class KHFilter implements Filter
{

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("필터 동작함");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
