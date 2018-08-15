package com.xuzhu.fmsfinanceproductservice.service;

import com.xuzhu.fmsfinanceproductservice.DAO.AccountDAO;
import com.xuzhu.fmsfinanceproductservice.domain.Account;
import com.xuzhu.fmsfinanceproductservice.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class FinanceProductServiceImpl implements FinanceProductService {

    @Autowired
    AccountDAO accountDAO;

    @Override
    public Map<String, List<Item>> loadFinanceProduct(String username) {
        Account account = accountDAO.findOne(username);

        if (account != null) {
            return account.getItems();
        }
        else {
            account = new Account();
            account.setUsername(username);
            account.setCreateTime(new Date());
            account.setUpdateTime(new Date());
            account.setItems(new HashMap<String, List<Item>>());
            accountDAO.save(account);
            return account.getItems();
        }
    }

    @Override
    public Map<String, List<Item>> addFinanceProductItem(String username, Item item) {
        Account account = accountDAO.findOne(username);

        if (account != null) {
            account.addFinanceProductItem(item);
            account.setUpdateTime(new Date());
            accountDAO.save(account);
        }
        else return null;

        return account.getItems();
    }

    @Override
    public Map<String, List<Item>> deleteFinanceProductItem(String username, String financeItemName, String financeItemTimePoint) {
        Account account = accountDAO.findOne(username);
        int index = 0;
        if (account != null) {
            Map<String, List<Item>> items = account.getItems();
            List<Item> oneList = items.get(financeItemName);
            for (; index != oneList.size() && !oneList.get(index).getFinanceItemTimePoint().equals(financeItemTimePoint); ++index);
            oneList.remove(index);
            if (oneList.size() == 0) {
                items.remove(financeItemName);
            }
            else {
                items.put(financeItemName, oneList);
            }
            account.setItems(items);
            account.setUpdateTime(new Date());

            accountDAO.save(account);
        }
        else return null;

        return account.getItems();
    }

    @Override
    public Map<String, List<Item>> editFinanceProductItem(String username, Item item, int i) {
        Account account = accountDAO.findOne(username);
        int index = 0;

        if (account != null) {
            Map<String, List<Item>> items = account.getItems();
            List<Item> oneList = items.get(item.getFinanceItemName());
            for (; index != oneList.size() && !oneList.get(index).getFinanceItemTimePoint().equals(item.getFinanceItemTimePoint()); ++index);
            oneList.set(index, item);
            items.put(item.getFinanceItemName(), oneList);
            account.setItems(items);
            account.setUpdateTime(new Date());
            accountDAO.save(account);
        }
        else return null;

        return account.getItems();
    }
}
