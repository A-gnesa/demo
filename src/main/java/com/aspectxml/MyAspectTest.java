package com.aspectxml;

import com.proxyfactorybean.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class MyAspectTest {
    public static void main(String[] args) {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.addUser();
        userDao.deleteUser();
    }

}