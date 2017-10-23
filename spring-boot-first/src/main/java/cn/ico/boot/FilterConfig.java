package cn.ico.boot;

import cn.ico.boot.filter.MyFilter;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/*@Configuration*/
public class FilterConfig {
   /* @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean testFilterRegistraction(){
        FilterRegistrationBean registraction=new FilterRegistrationBean();
        registraction.setFilter(new MyFilter());
        registraction.addUrlPatterns("/*");
        registraction.addInitParameter("paramName","paramValue");
        registraction.setName("MyFilter");
        registraction.setOrder(1);
        return registraction;
    }*/
}

