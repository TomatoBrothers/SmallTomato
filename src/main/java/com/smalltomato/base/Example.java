package com.smalltomato.base;

/**
 * 查询类扩展
 * Created by feiL on 2017/11/30.
 */
public interface Example {

    /**
     * 设置分页
     * @param page
     */
    void setPage(Page page);

    /**
     * 获取分页
     * @return
     */
    Page getPage();
}
