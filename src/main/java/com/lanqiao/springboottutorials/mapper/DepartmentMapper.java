package com.lanqiao.springboottutorials.mapper;


import com.lanqiao.springboottutorials.model.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Entity com.lanqiao.springboottutorials.model.Department
 */
@Mapper
public interface DepartmentMapper{

    public List<Department> selectDepartment();

}




