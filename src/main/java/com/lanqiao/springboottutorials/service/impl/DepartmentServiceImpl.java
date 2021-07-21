package com.lanqiao.springboottutorials.service.impl;

import com.lanqiao.springboottutorials.mapper.DepartmentMapper;
import com.lanqiao.springboottutorials.model.Department;
import com.lanqiao.springboottutorials.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service("departmentService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentMapper departmentMapper;


    @Override
    public List<Department> selectDepartment() {
        return this.departmentMapper.selectDepartment();
    }
}




