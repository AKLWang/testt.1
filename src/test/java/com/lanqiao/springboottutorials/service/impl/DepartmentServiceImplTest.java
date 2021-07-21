package com.lanqiao.springboottutorials.service.impl;

import com.lanqiao.springboottutorials.service.DepartmentService;
import com.lanqiao.springboottutorials.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: 王宏玮    Date: 2021/07/16/16:25
 */
@SpringBootTest
class DepartmentServiceImplTest {

    @Autowired
    DepartmentService departmentService;

    @Test
    void selectEmployee() {
        this.departmentService.selectDepartment().forEach(d -> System.out.println(d));
    }
}