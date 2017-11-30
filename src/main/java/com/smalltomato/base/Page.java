package com.smalltomato.base;

/**
 * 分页
 * Created by feiL on 2017/11/30.
 */
public class Page {

    /**
     * 分页查询开始位置
     */
    private int begin;
    /**
     * 分页查询结束位置
     */
    private int end;
    /**
     * 每页显示记录数
     */
    private int pageSize;
    /**
     * 当前页数
     */
    private int currentPage;
    /**
     * 数据总条数
     */
    private int totalNum;
    /**
     * 数据总页数
     */
    private int totalPage;

    public Page() {

    }

    public Page(int currentPage, int pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.begin = (currentPage - 1) * pageSize;
        this.end = currentPage * pageSize;
    }

    public int getBegin() {
        return this.begin;
    }

    public int getEnd() {
        return this.end;
    }

    public void setBeginEnd(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public int getTotalNum() {
        return this.totalNum;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public void setTotalPage() {
        this.totalPage = (this.totalNum + this.pageSize - 1) / this.pageSize;
    }

}
