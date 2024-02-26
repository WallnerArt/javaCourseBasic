package homeWorks.homeWork_21.task_07;

public class Developer extends Employee {
    // Список проектов
    private String[] projects;

    // Конструктор для инициализации свойств разработчика
    public Developer(String name, String department, String[] projects) {
        super(name, department);
        this.projects = projects;
    }

    // Метод для получения списка проектов
    public String[] getProjects() {
        return projects;
    }
}
