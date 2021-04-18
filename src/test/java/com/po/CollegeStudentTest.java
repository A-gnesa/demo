package com.po;

import com.proxyfactorybean.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CollegeStudentTest {
    @Test
    void test(){
        String xmlPath = "stuAspectConfig";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Student collegeStudent = (Student) applicationContext.getBean("CollegeStudent");
        collegeStudent.selectStu();
        collegeStudent.insertStu();
    }

}