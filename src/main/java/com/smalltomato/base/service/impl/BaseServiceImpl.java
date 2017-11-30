package com.smalltomato.base.service.impl;

import com.smalltomato.base.dao.BaseDao;
import com.smalltomato.base.service.BaseService;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.util.List;

/**
 * 公用的 Service 实现类
 * Created by feiL on 2017/11/30.
 */
public abstract class BaseServiceImpl<T, E, K> implements BaseService<T, E, K> {

    private BaseDao<T, E, K> baseDao;

    @PostConstruct
    public void setBaseDao() throws Exception {
        try {
            this.baseDao = getDao();
            if (null != this.baseDao) {
                return;
            }
            Field[] fields = getClass().getDeclaredFields();
            for (Field f : fields) {
                f.setAccessible(true);
                Object obj = f.get(this);
                if (obj instanceof BaseDao) {
                    this.baseDao = (BaseDao<T, E, K>) obj;
                    if ("dao".equals(f.getName())) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public abstract BaseDao<T, E, K> getDao();

    public int countByExample(E example) throws Exception {
        return this.baseDao.countByExample(example);
    }

    public int deleteByExample(E example) throws Exception {
        return this.baseDao.deleteByExample(example);
    }

    public int deleteByPrimaryKey(K primaryKey) throws Exception {
        return this.baseDao.deleteByPrimaryKey(primaryKey);
    }

    public T selectByPrimaryKey(K primaryKey) throws Exception {
        return this.baseDao.selectByPrimaryKey(primaryKey);
    }

    public List<T> selectByExample(E example) throws Exception {
        return this.baseDao.selectByExample(example);
    }

    public int updateByExampleSelective(T record, E example) throws Exception {
        return this.baseDao.updateByExampleSelective(record, example);
    }

    public int updateByPrimaryKeySelective(T record) throws Exception {
        return this.baseDao.updateByPrimaryKeySelective(record);
    }

    public int updateByExample(T record, E example) throws Exception {
        return this.baseDao.updateByExample(record, example);
    }

    public int updateByPrimaryKey(T record) throws Exception {
        return this.baseDao.updateByPrimaryKey(record);
    }

    public int insert(T record) throws Exception {
        return this.baseDao.insert(record);
    }

    public int insertSelective(T record) throws Exception {
        return this.baseDao.insertSelective(record);
    }
}
