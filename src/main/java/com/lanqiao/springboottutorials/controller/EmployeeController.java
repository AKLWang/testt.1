package com.lanqiao.springboottutorials.controller;

import com.github.pagehelper.Page;
import com.lanqiao.springboottutorials.model.Employee;

import com.lanqiao.springboottutorials.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @Auther: 王宏玮    Date: 2021/07/16/18:05
 */

@Controller
@RequestMapping("/emps")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public String selectForPage(Model model) {
        List<Employee> employeeList = this.employeeService.selectEmployee();
        model.addAttribute("employeeList", employeeList);
        return "employee/list";
    }

    @GetMapping("/one")
    public String select(HttpSession session,Model model, Employee employee, @RequestParam(value = "pageNum",required = false) Integer pageNum) {
        if(pageNum==null){
            pageNum=1;
            session.setAttribute("empCondition",employee);//保留当前的查询条件
        }else {
            //点击分页连接取回查询条件
            if(session.getAttribute("empCondition") !=null) {
                employee = (Employee) session.getAttribute("empCondition");
            }
        }
        Page<Employee> employeeList = employeeService.select(employee,pageNum,5);
        model.addAttribute("employeeList", employeeList);
        return "employee/list";
    }

    // 同步
    @GetMapping("/{empno}")
    public String selectById(Model model,
                             @PathVariable Integer empno) {
        final Employee employee = this.employeeService.selectById(empno);
        model.addAttribute("emp", employee);
        return "employee/emp_update";
    }

    // 异步
    @GetMapping("/async/{empno}")
    public String selectByIdForAsync(Model model,
                                     @PathVariable Integer empno) {
        final Employee employee = this.employeeService.selectById(empno);
        model.addAttribute("emp", employee);
        return "employee/emp_update-content";
    }


    @PostMapping
    public String update(Model model, Employee employee) {
        // 后面操作数据库代码省略
        return "redirect:/emps";
    }

    @PostMapping("/update")
    public String updateSave(Employee employee){
        int i = employeeService.updateEmployeeById(employee);
        return "redirect:/emps/one";
    }


    @GetMapping("/delete/{empno}")
    public String delete(@PathVariable Integer empno){
        int i = employeeService.deleteEmployeeById(empno);
        return "redirect:/emps/one";
    }

    // 异步
    @PostMapping("/addEmployee")
    public String insertByIdForAsync(Employee employee) {
        employeeService.insertEmployee(employee);
        return "redirect:/emps/one";
    }

}