package com.smalltomato.service.impl;

import com.smalltomato.base.dao.BaseDao;
import com.smalltomato.base.service.impl.BaseServiceImpl;
import com.smalltomato.bean.Employee;
import com.smalltomato.bean.EmployeeExample;
import com.smalltomato.dao.EmployeeMapper;
import com.smalltomato.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by feiL on 2017/11/30.
 */
@Service("employeeService")
public class EmployeeServiceImpl extends BaseServiceImpl<Employee, EmployeeExample, Integer>
        implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public BaseDao<Employee, EmployeeExample, Integer> getDao() {
        return employeeMapper;
    }
}
