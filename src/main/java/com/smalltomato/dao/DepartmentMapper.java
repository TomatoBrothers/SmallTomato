package com.smalltomato.dao;

import com.smalltomato.base.dao.BaseDao;
import com.smalltomato.bean.Department;
import com.smalltomato.bean.DepartmentExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper extends BaseDao<Department, DepartmentExample, Integer> {

}