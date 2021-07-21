package com.lanqiao.springboottutorials.service.impl;


import com.github.pagehelper.Page;
import com.lanqiao.springboottutorials.mapper.EmployeeMapper;
import com.lanqiao.springboottutorials.model.Employee;
import com.lanqiao.springboottutorials.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service("employeeService")
// 支持事务，增加、删除、更新操作单独使用 propagation = Propagation.REQUIRED
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    @Override
    public List<Employee> selectEmployee() {
        return employeeMapper.selectEmployee();
    }

    @Override
    public Employee selectById(Integer emono) {
        return employeeMapper.selectById(emono);
    }

    @Override
    public Page<Employee> select(Employee employee, int pageNum, int pageSize) {
        return employeeMapper.select(employee,pageNum,pageSize);
    }

    @Override
    public int updateEmployeeById(Employee employee) {
        return employeeMapper.updateEmployeeById(employee);
    }

    @Override
    public int deleteEmployeeById(Integer empno) {
        return employeeMapper.deleteEmployeeById(empno);
    }

    @Override
    public int insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }


}




