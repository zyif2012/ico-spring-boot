package com.mastering.spring.context;

import com.mastering.spring.beans.User;
import com.mastering.spring.business.BusinessService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = "com.mastering.spring")
class SpringConfig{

}

public class MyContext {
    private final static User ME = new User("Dummy");
    public static Logger logger = Logger.getLogger(MyContext.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BusinessService business = context.getBean(BusinessService.class);
        logger.debug(business.calculateSum(ME));
    }
}
