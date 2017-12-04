package com.smalltomato.service.impl;

import com.smalltomato.base.dao.BaseDao;
import com.smalltomato.base.service.impl.BaseServiceImpl;
import com.smalltomato.bean.Stock;
import com.smalltomato.bean.StockExample;
import com.smalltomato.bean.StockKey;
import com.smalltomato.dao.StockMapper;
import com.smalltomato.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WangShiChong
 * @ Create Time: 2017/12/4/0004 22:47
 */
@Service("stockService")
public class StockServiceImpl extends BaseServiceImpl<Stock, StockExample, StockKey>
        implements StockService {

    @Autowired
    private StockMapper stockMapper;

    public BaseDao<Stock, StockExample, StockKey> getDao() {
        return stockMapper;
    }
}
