package com.smalltomato.service.impl;

import com.smalltomato.base.dao.BaseDao;
import com.smalltomato.base.service.impl.BaseServiceImpl;
import com.smalltomato.bean.StockList;
import com.smalltomato.bean.StockListExample;
import com.smalltomato.dao.StockListMapper;
import com.smalltomato.service.StockListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author WangShiChong
 * @ Create Time: 2017/12/4/0004 23:43
 */
@Service("stockListService")
public class StockListServiceImpl extends BaseServiceImpl<StockList, StockListExample, Integer>
        implements StockListService {

    @Autowired
    private StockListMapper stockListMapper;

    public BaseDao<StockList, StockListExample, Integer> getDao() {
        return this.stockListMapper;
    }


    public Set<String> getAllStockCode() {
        Set<String> allStockCode = stockListMapper.getAllStockCode();
        return allStockCode == null ? new HashSet<String>() : allStockCode;
    }
}
