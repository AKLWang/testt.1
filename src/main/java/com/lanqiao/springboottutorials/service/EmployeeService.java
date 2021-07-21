package com.lanqiao.springboottutorials.service;


import com.github.pagehelper.Page;
import com.lanqiao.springboottutorials.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
public interface EmployeeService {
    public List<Employee> selectEmployee();

    public Employee selectById(Integer emono);

    public Page<Employee> select(@Param("emp") Employee employee,
                                 @Param("pageNum") int pageNum,
                                 @Param("pageSize") int pageSize);

    public int updateEmployeeById(Employee employee);

    public int deleteEmployeeById(Integer empno);

    public int insertEmployee(Employee employee);
}
