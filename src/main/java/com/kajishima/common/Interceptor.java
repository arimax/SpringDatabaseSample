package com.kajishima.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter{

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

		String url = request.getRequestURI();

		if (url.contains("/secondary/")) {
			 SchemaContextHolder.setSchemaType("Secondary");
		} else {
			SchemaContextHolder.setSchemaType("FieldManager");
		}
        return true;
    }

}
