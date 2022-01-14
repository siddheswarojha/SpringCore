package com.spring.springcore.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


        ApplicationContext ap = new ClassPathXmlApplicationContext("bean.xml");
        Company c = (Company) ap.getBean("dept");
        c.companyWork();

    }
}
