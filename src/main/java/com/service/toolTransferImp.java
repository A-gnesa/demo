package com.service;

import com.jdbcTemplate.Account;
import com.jdbcTemplate.AccountDao;
import com.jdbcTemplate.AccountDaoImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class toolTransferImp implements toolTransfer{
    @Override
    public void transfer(String outUser, String inUser, Double money) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        Account a1 = accountDao.findAccountById(1);
        Account a2 = accountDao.findAccountById(2);
        accountDao.updateMoney(a1,money);
        int i = 1/0;
        accountDao.updateMoney(a2,(money*(-1)));
    }
}
