package com.jdbcTemplate;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class AccountDaoImp implements AccountDao{
    private JdbcTemplate jdbcTemplate ;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    @Override
    public int addAccount(Account account) {
        String sql = "insert into account (username,balance) value (?,?)";
        Object []objects = new Object[]{
                account.getUsername(),
                account.getBalance()
        };
        int num = this.jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public int update(Account account) {
        String sql = "update account  set username = ?,balance = ? where id = ?";
        Object []objects = new Object[]{
                account.getId(),
                account.getUsername(),
                account.getBalance()
        };
        int num = this.jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public int delete(int id) {
        String sql = "delete from account where id = ?";
        int num = this.jdbcTemplate.update(sql,id);
        return num;
    }

    @Override
    public List<Account> findAllAccount() {
        String sql = "select * from account ";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        return this.jdbcTemplate.query(sql,rowMapper);
    }

    @Override
    public int updateMoney(Account account, Double money) {
        String sql = "update account  set banlance = banlance + ? where username = ?";
        Object []objects = new Object[]{
                money,
                account.getUsername(),
        };
        int num = this.jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id = ?";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        return this.jdbcTemplate.queryForObject(sql,rowMapper,id);
    }
}
