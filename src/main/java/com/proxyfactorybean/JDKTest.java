package com.proxyfactorybean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class JDKTest {
    public static void main(String[] args) {
        String xmlPath = "file:/Users/agnesa/Downloads/demo/src/main/java/com/proxyfactorybean/bean.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
        userDao.addUser();

        userDao.deleteUser();
    }

}