package lesson19.code.lessoncode.incapsulation.hr.service;

import lesson6.code.lessoncode.scanner.UserInput;
import lesson19.code.lessoncode.incapsulation.hr.entity.Applicant;
import lesson19.code.lessoncode.incapsulation.hr.entity.Department;
import lesson19.code.lessoncode.incapsulation.hr.entity.Employee;
import lesson19.code.lessoncode.incapsulation.hr.entity.Person;
import lesson19.code.lessoncode.incapsulation.hr.repositories.ApplicantRepository;
import lesson19.code.lessoncode.incapsulation.hr.repositories.EmployeeRepository;

public class EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addNewEmployee(String applicantName){

        ApplicantRepository applicantRepository = new ApplicantRepository();

        Applicant applicant = applicantRepository.findByName(applicantName);

        UserInput userInput = new UserInput();
        int newEmployeeId = userInput.inputInteger("Введите номер нового сотрудника: ");
        String newEmployeePosition = userInput.inputText("Введите должность нового сотрудника: ");
        int newEmployeeSalary = userInput.inputInteger("Введите зарплату нового сотрудника: ");

        Employee newEmployee = new Employee(
                newEmployeeId,
                applicant.getPerson(),
                applicant.getDepartment(),
                newEmployeePosition,
                newEmployeeSalary
        );

        employeeRepository.add(newEmployee);

    }



}
