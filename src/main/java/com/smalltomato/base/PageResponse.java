package com.smalltomato.base;

import java.util.List;

/**
 * 分页返回对象
 * Created by feiL on 2017/11/30.
 */
public class PageResponse<T> {

    private Page page;

    private List<T> list;

    private int totalNum;

    public PageResponse() {
    }

    public PageResponse(Page page, List<T> list, int totalNum) {
        super();
        this.page = page;
        this.list = list;
        this.totalNum = totalNum;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }
}
