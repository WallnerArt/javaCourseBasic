package lesson19.code.lessoncode.incapsulation.hr.repositories;

import lesson19.code.lessoncode.incapsulation.hr.entity.Applicant;
import lesson19.code.lessoncode.incapsulation.hr.entity.Department;
import lesson19.code.lessoncode.incapsulation.hr.entity.Employee;

import java.util.Arrays;

public class EmployeeRepository {

    Employee[] employees;

    public EmployeeRepository(int quantity) {
        this.employees = new Employee[quantity];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void add(Employee employee){}

    public Employee findByName(String name){
        return null;
    }


    @Override
    public String toString() {
        return "EmployeeRepository{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }


}
