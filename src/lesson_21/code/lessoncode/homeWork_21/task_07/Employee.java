package lesson_21.code.lessoncode.homeWork_21.task_07;

public class Employee {
    // Свойства сотрудника
    protected String name;
    protected String department;

    // Конструктор для инициализации свойств сотрудника
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Метод для получения имени сотрудника
    public String getName() {
        return name;
    }

    // Метод для получения отдела, в котором работает сотрудник
    public String getDepartment() {
        return department;
    }
}
