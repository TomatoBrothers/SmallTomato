package com.smalltomato.dao;

import com.smalltomato.base.dao.BaseDao;
import com.smalltomato.bean.StockList;
import com.smalltomato.bean.StockListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockListMapper  extends BaseDao<StockList, StockListExample, String> {

}