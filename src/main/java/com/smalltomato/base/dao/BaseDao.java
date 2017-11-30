package com.smalltomato.base.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 公共 Dao 接口.泛型类型：第一个是实体，第二个是查询实体，第三个是主键
 * Created by feiL on 2017/11/30.
 */
public interface BaseDao<T, E, K> {

    /**
     * 查询记录数
     *
     * @param example 查询条件
     * @return 记录数
     */
    int countByExample(E example);

    /**
     * 根据自定义条件删除记录
     *
     * @param example 删除条件
     * @return 删除的记录数
     */
    int deleteByExample(E example);

    /**
     * 根据主键删除记录
     *
     * @param primaryKey 主键
     * @return 删除的记录数
     */
    int deleteByPrimaryKey(K primaryKey);

    /**
     * 根据主键查询
     *
     * @param primaryKey 主键
     * @return 查询到的记录
     */
    T selectByPrimaryKey(K primaryKey);

    /**
     * 根据自定义条件查询
     *
     * @param example 查询条件
     * @return 查询到的记录
     */
    List<T> selectByExample(E example);

    /**
     * 根据条件更新数据，只更新record中非空的字段
     *
     * @param record  实体Bean
     * @param example 查询条件
     * @return 更新的记录数
     */
    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    /**
     * 根据主键更新数据，只更新record中非空的字段
     *
     * @param record 实体Bean
     * @return 更新的记录数
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 根据条件更新数据，record中的空字段也会更新到数据库对应字段
     *
     * @param record  实体Bean
     * @param example 查询条件
     * @return 更新的记录数
     */
    int updateByExample(@Param("record") T record, @Param("example") E example);

    /**
     * 根据主键更新数据，record中的空字段也会更新到数据库对应字段
     *
     * @param record 实体Bean
     * @return 更新的记录数
     */
    int updateByPrimaryKey(T record);

    /**
     * 插入一条记录，record中的空字段也会插入到数据库中
     *
     * @param record 实体Bean
     * @return 插入的记录数
     */
    int insert(T record);

    /**
     * 插入一条记录，只插入record中非空的字段
     *
     * @param record 实体Bean
     * @return 插入的记录数
     */
    int insertSelective(T record);
}
