package com.xuzhu.fmsfinanceproductservice.service;

import com.xuzhu.fmsfinanceproductservice.domain.Item;

import java.util.List;
import java.util.Map;

public interface FinanceProductService {
    Map<String, List<Item>> loadFinanceProduct(String username);
    Map<String, List<Item>> addFinanceProductItem(String username, Item item);
    Map<String, List<Item>> deleteFinanceProductItem(String username, String financeProductItemName, String financeProductItemTimePoint);
    Map<String, List<Item>> editFinanceProductItem(String username, Item item, int i);
}
