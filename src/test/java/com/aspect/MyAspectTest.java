package com.aspect;

import com.proxyfactorybean.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MyAspectTest {
    public static void main(String[] args) {
        String xmlPath = "aspectConfig.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
        userDao.addUser();
        userDao.deleteUser();
    }
}