package com.smalltomato.service.impl;

import com.smalltomato.base.dao.BaseDao;
import com.smalltomato.base.service.impl.BaseServiceImpl;
import com.smalltomato.bean.StockKey;
import com.smalltomato.bean.StockList;
import com.smalltomato.bean.StockListExample;
import com.smalltomato.bean.StockListKey;
import com.smalltomato.dao.StockListMapper;
import com.smalltomato.service.StockListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WangShiChong
 * @ Create Time: 2017/12/4/0004 23:43
 */
@Service("stockListService")
public class StockListServiceImpl extends BaseServiceImpl<StockList, StockListExample, StockListKey>
        implements StockListService {

    @Autowired
    private StockListMapper stockListMapper;

    public BaseDao<StockList, StockListExample, StockListKey> getDao() {
        return stockListMapper;
    }
}
