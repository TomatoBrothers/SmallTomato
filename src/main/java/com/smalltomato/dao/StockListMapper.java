package com.smalltomato.dao;

import com.smalltomato.base.dao.BaseDao;
import com.smalltomato.bean.StockList;
import com.smalltomato.bean.StockListExample;

import java.util.Set;

public interface StockListMapper extends BaseDao<StockList, StockListExample, Integer> {
    /**
     * 获取所有的股票代码
     *
     * @return 股票代码的集合
     */
    Set<String> getAllStockCode();
}