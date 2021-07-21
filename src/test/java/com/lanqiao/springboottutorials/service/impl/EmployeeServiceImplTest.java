package com.lanqiao.springboottutorials.service.impl;

import com.lanqiao.springboottutorials.model.Employee;
import com.lanqiao.springboottutorials.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 张建平 on 2021/7/16.
 */
@SpringBootTest
class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeService;

    @Test
    void selectEmployee() {
        this.employeeService.selectEmployee().forEach(e -> System.out.println(e));
    }
    @Test
    void select() {
        Employee employee = new Employee();
        //employee.setEname("");
        //employee.setJob("");
        //employee.setDeptno(30);
        employeeService.select(employee,2,5).forEach(e ->{
            System.out.println(e.toString());
        });
    }
}