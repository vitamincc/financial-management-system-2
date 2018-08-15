package com.xuzhu.fmsfinanceproductservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document(collection = "FinanceProductAccount")
public class Account {
    @Id
    private String username;
    private Map<String, List<Item>> items;
    private Date createTime;
    private Date updateTime;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setItems(Map<String, List<Item>> items) {
        this.items = items;
    }

    public Map<String, List<Item>> getItems() {
        return items;
    }

    public void addFinanceProductItem(Item item) {
        if (items != null) {
            if (items.containsKey(item.getFinanceItemName())) {
                List<Item> oneList = items.get(item.getFinanceItemName());
                oneList.add(item);
                Collections.sort(oneList);
                items.put(item.getFinanceItemName(), oneList);
            }
            else {
                List<Item> oneList = new ArrayList<>();
                oneList.add(item);
                items.put(item.getFinanceItemName(), oneList);
            }
        }
        else {
            items = new HashMap<String, List<Item>>();
            List<Item> oneList = new ArrayList<>();
            oneList.add(item);
            items.put(item.getFinanceItemName(), oneList);
        }
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
