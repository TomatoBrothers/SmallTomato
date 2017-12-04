package com.smalltomato.dao;

import com.smalltomato.base.dao.BaseDao;
import com.smalltomato.bean.Stock;
import com.smalltomato.bean.StockExample;
import com.smalltomato.bean.StockKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StockMapper extends BaseDao<Stock, StockExample, Integer> {
}