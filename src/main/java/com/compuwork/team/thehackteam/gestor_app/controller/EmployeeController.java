package com.compuwork.team.thehackteam.gestor_app.controller;

import com.compuwork.team.thehackteam.gestor_app.model.entity.Department;
import com.compuwork.team.thehackteam.gestor_app.model.entity.Employee;
import com.compuwork.team.thehackteam.gestor_app.model.entity.PermanentEmployee;
import com.compuwork.team.thehackteam.gestor_app.repository.PermanentEmployeeRepository;
import com.compuwork.team.thehackteam.gestor_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.sql.Date;
import java.util.List;

@Controller
public class EmployeeController {

	@Autowired
	private PermanentEmployeeRepository permanentRepository;
	
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

    @GetMapping("/report-employee/{id}")
    public String performanceReportEmployee(Model model, @PathVariable Long id) {
        // model.addAttribute("employee",
        //             employeeService.getEmployeeById(id));

        return "perfomance_report_employee";
    }

    @PostMapping("/add")
    public String saveEmployee(@ModelAttribute("employee") Employee employee, Long idDepartment){
    	PermanentEmployee permanentEmployee = new PermanentEmployee();
		permanentEmployee.setRole("Gerente");
		permanentEmployee.setFirstName("Juan");
		permanentEmployee.setLastName("Perez");
		permanentEmployee.setIdNumber("1234567849");
		permanentEmployee.setDateOfBirth("01/01/1990");
		permanentEmployee.setSex("M");
		permanentEmployee.setEmail("adsfkj@jkds-do.com");
		permanentEmployee.setHealthInsurance("Fonasa");
		permanentEmployee.setSalary(3000000d);	
		permanentEmployee.setEntryDate(Date.valueOf("2021-01-01"));
		permanentEmployee.setPhoneNumber("123456789");
		permanentEmployee.setContractType("Largo Plazo");
		permanentEmployee.setSeniority("Senior");
		permanentEmployee.setBenefits("Seguro de vida");
		permanentRepository.save(permanentEmployee);
		System.out.println("permanentEmployee--> "+permanentEmployee.getFirstName());
        //employeeService.saveEmployee(employee, idDepartment);
        return "redirect:/index";
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
