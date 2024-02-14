package lesson_19.code.lessoncode.incapsulation.hr.service;

import lesson_19.code.lessoncode.incapsulation.hr.entity.Department;
import lesson_19.code.lessoncode.incapsulation.hr.repositories.DepartmentRepository;

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
