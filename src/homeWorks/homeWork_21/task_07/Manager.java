package homeWorks.homeWork_21.task_07;

public class Manager extends Employee {
    // Список подчиненных
    private Employee[] subordinates;

    // Конструктор для инициализации свойств менеджера
    public Manager(String name, String department, Employee[] subordinates) {
        super(name, department);
        this.subordinates = subordinates;
    }

    // Метод для получения списка подчиненных
    public Employee[] getSubordinates() {
        return subordinates;
    }
}
