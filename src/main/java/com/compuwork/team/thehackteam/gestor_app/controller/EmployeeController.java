package com.compuwork.team.thehackteam.gestor_app.controller;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Employee;
import com.compuwork.team.thehackteam.gestor_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping({"/", "/index", ""})
	public String index(ModelMap model) {
    	List<Employee> employees = employeeService.getEmployees();
    	model.put("employees", employees);
    	return "index";
    }
    
    @GetMapping("/add")
    public String addEmployee(){
        return "add_employee";
    }


    @PostMapping("/add")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }


    @GetMapping("/employees_by_department/{departmentId}")
    public String getEmployeesByDepartment(Model model, @PathVariable Long departmentId){
        System.out.println("departmentId--> *****************************************************");
        System.out.println("departmentId--> "+departmentId);
        model.addAttribute("employees",
                employeeService.getEmployeesByDepartment(departmentId));
        List<Employee> employees = employeeService.getEmployeesByDepartment(departmentId);
        System.out.println("lista--> "+employees);
        return "employees_by_department";
    }

    @GetMapping("/employee/{id}")
    public String getEmployee(Model model, @PathVariable Long id){
        model.addAttribute("employee",
                employeeService.getEmployeeById(id));
        return "employee_detail";
    }


}
