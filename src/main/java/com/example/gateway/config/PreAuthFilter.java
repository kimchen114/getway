package com.example.gateway.config;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreAuthFilter extends ZuulFilter {
    final static Logger logger = LoggerFactory.getLogger(PreAuthFilter.class);

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext ctx = RequestContext.getCurrentContext();  
        HttpServletRequest request = ctx.getRequest();  
        logger.info(String.format("Method is %s; request to %s", request.getMethod(), request.getRequestURL().toString()));  
        Object accessToken = request.getParameter("accessToken");  
        if(accessToken == null) {  
            logger.warn("access token is empty");  
            ctx.setSendZuulResponse(false);  
            ctx.setResponseStatusCode(401);  
            ctx.setResponseBody("access token is empty");
            return null;  
        }  
//        logger.info("access token ok");  
        return null;  
        
    }
}
