package com.smalltomato.base.service;

import com.smalltomato.base.dao.BaseDao;

import java.util.List;

/**
 * 公共 service 接口.泛型类型：第一个是实体，第二个是查询实体，第三个是主键
 * Created by feiL on 2017/11/30.
 */
public interface BaseService<T, E, K> {

    /**
     * 返回 service 主要数据操作的 BaseDao,需要在实现类重写
     *
     * @return
     */
    BaseDao<T, E, K> getDao();

    /**
     * 查询记录数
     *
     * @param example 查询条件
     * @return 记录数
     * @throws Exception
     */
    int countByExample(E example) throws Exception;

    /**
     * 根据自定义条件删除记录
     *
     * @param example 删除条件
     * @return 删除的记录数
     * @throws Exception
     */
    int deleteByExample(E example) throws Exception;

    /**
     * 根据主键删除记录
     *
     * @param primaryKey 主键
     * @return 删除的记录数
     * @throws Exception
     */
    int deleteByPrimaryKey(K primaryKey) throws Exception;

    /**
     * 根据主键查询
     *
     * @param primaryKey 主键
     * @return 查询到的记录
     * @throws Exception
     */
    T selectByPrimaryKey(K primaryKey) throws Exception;

    /**
     * 根据自定义条件查询
     *
     * @param example 查询条件
     * @return 查询到的记录
     * @throws Exception
     */
    List<T> selectByExample(E example) throws Exception;

    /**
     * 根据条件更新数据，只更新record中非空的字段
     *
     * @param record  实体Bean
     * @param example 查询条件
     * @return 更新的记录数
     * @throws Exception
     */
    int updateByExampleSelective(T record, E example) throws Exception;

    /**
     * 根据主键更新数据，只更新record中非空的字段
     *
     * @param record 实体Bean
     * @return 更新的记录数
     * @throws Exception
     */
    int updateByPrimaryKeySelective(T record) throws Exception;

    /**
     * 根据条件更新数据，record中的空字段也会更新到数据库对应字段
     *
     * @param record  实体Bean
     * @param example 查询条件
     * @return 更新的记录数
     * @throws Exception
     */
    int updateByExample(T record, E example) throws Exception;

    /**
     * 根据主键更新数据，record中的空字段也会更新到数据库对应字段
     *
     * @param record 实体Bean
     * @return 更新的记录数
     * @throws Exception
     */
    int updateByPrimaryKey(T record) throws Exception;

    /**
     * 插入一条记录，record中的空字段也会插入到数据库中
     *
     * @param record 实体Bean
     * @return 插入的记录数
     * @throws Exception
     */
    int insert(T record) throws Exception;

    /**
     * 插入一条记录，只插入record中非空的字段
     *
     * @param record 实体Bean
     * @return 插入的记录数
     * @throws Exception
     */
    int insertSelective(T record) throws Exception;
}
