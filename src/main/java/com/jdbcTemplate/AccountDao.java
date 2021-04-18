package com.jdbcTemplate;

import java.util.List;

public interface AccountDao {
    public int addAccount(Account account);
    public int update(Account account);
    public int delete(int id);
    public List<Account> findAllAccount();
    public int updateMoney(Account account,Double money);
    public Account findAccountById(int id);
}
