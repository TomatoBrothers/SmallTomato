package com.smalltomato.dao;

import com.smalltomato.bean.StockList;
import com.smalltomato.bean.StockListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockListMapper {
    long countByExample(StockListExample example);

    int deleteByExample(StockListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockList record);

    int insertSelective(StockList record);

    List<StockList> selectByExample(StockListExample example);

    StockList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockList record, @Param("example") StockListExample example);

    int updateByExample(@Param("record") StockList record, @Param("example") StockListExample example);

    int updateByPrimaryKeySelective(StockList record);

    int updateByPrimaryKey(StockList record);
}