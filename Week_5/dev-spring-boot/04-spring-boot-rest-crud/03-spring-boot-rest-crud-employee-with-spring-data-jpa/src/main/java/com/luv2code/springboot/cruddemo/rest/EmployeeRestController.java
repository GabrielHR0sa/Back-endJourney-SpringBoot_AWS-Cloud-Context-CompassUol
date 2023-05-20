package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // quick and dirty: inject employee dao
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // expose "/employee" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> finAll() {
        return employeeService.findAll();
    }

    // buscando por id
    @GetMapping("employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {

        Employee theEmployee = employeeService.findById(employeeId);

        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        return theEmployee;

    }

    // add mapping for Post / employees - add new employee

    //adicionando 1 funcionario
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {

        // also just in case they pass an id in JSON... set id to 0
        // this is to force a save of new item ... instead of update

        theEmployee.setId(0);

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;

        /*
         * Código executado no PostMan
         * Método POST
         * URL:http://localhost:8080/api/employees
         * 
         * {
         * "firstName" : "Hector",
         * "lastName" : "Perez",
         * "email" : "hector@gmail.com"
         * }
         */

    }

    // add mapping for PUT /employees - update existing employee

    // alterando a informação da tabela
    @PutMapping("/employees")
    public Employee updatEmployee(@RequestBody Employee theEmployee) {

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;

        /*
         * Código executado no PostMan
         * Método PUT
         * URL: http://localhost:8080/api/employees
         * 
         * {
         * "id" : 1,
         * "firstName" : "Timothy",
         * "lastName" : "Patterson",
         * "email" : "timo@gmail.com"
         * }
         */

    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    //deletando um funcionario
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){

        Employee theEmployee = employeeService.findById(employeeId);

        // throw exception if null
        if(theEmployee == null){
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        employeeService.deleteById(employeeId);

        return "Deleted employee id - " + employeeId;
    }


}
