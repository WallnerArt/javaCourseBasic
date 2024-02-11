package lesson19.code.lessoncode.incapsulation.hr.service;

import lesson6.code.lessoncode.scanner.UserInput;
import lesson19.code.lessoncode.incapsulation.hr.entity.Applicant;
import lesson19.code.lessoncode.incapsulation.hr.entity.Department;
import lesson19.code.lessoncode.incapsulation.hr.entity.Employee;
import lesson19.code.lessoncode.incapsulation.hr.repositories.ApplicantRepository;
import lesson19.code.lessoncode.incapsulation.hr.repositories.DepartmentRepository;
import lesson19.code.lessoncode.incapsulation.hr.repositories.EmployeeRepository;

public class DepartmentService {

    DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public void createDepartments(){

        Department[] ourDepartments = departmentRepository.getDepartments();

        ourDepartments[0] = new Department("Marketing",2);
        ourDepartments[1] = new Department("IT",1);
        ourDepartments[2] = new Department("Accounting",1);
        ourDepartments[3] = new Department("Management",2);


    }



}
