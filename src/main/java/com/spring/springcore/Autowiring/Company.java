package com.spring.springcore.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {


    @Autowired
    @Qualifier("it")
    Dept  dept;


//    public Company(HrDept dept)
//    {
//        this.dept = dept;
//    }
//
//    public void setDept(HrDept dept) {
//        this.dept = dept;
//    }


    public void companyWork()
    {
        if(dept==null)
        {
            System.out.println("Some System Error Occurred");
        }
        else
        {
            dept.work();
        }
    }
}
