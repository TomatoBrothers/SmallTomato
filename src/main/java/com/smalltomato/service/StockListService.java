package com.smalltomato.service;

import com.smalltomato.base.service.BaseService;
import com.smalltomato.bean.StockList;
import com.smalltomato.bean.StockListExample;

import java.util.Set;

/**
 * @author WangShiChong
 * @ Create Time: 2017/12/4/0004 23:42
 */

public interface StockListService extends BaseService<StockList, StockListExample, Integer> {
    /**
     * 获取所有的股票代码
     *
     * @return 股票代码的集合
     */
    Set<String> getAllStockCode();
}
