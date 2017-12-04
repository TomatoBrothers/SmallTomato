package com.smalltomato.service.impl;

import com.smalltomato.base.dao.BaseDao;
import com.smalltomato.base.service.impl.BaseServiceImpl;
import com.smalltomato.bean.StockList;
import com.smalltomato.bean.StockListExample;
import com.smalltomato.dao.StockListMapper;
import com.smalltomato.service.StockListService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author WangShiChong
 * @ Create Time: 2017/12/4/0004 22:50
 */

public class StockListServiceImpl extends BaseServiceImpl<StockList, StockListExample, String>
        implements StockListService {

    @Autowired
    private StockListMapper stockListMapper;

    public BaseDao<StockList, StockListExample, String> getDao() {
        return stockListMapper;
    }
}
