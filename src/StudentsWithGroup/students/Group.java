package StudentsWithGroup.students;

public class Group {
    private final String name;
    private final String startDate;
    private final int studentCount;

    public Group(String name, String startDate, int studentCount) {
        this.name = name;
        this.startDate = startDate;
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "Группа: " + name + ", начало обучения: " + startDate + ", количество студентов: " + studentCount;
    }
}
