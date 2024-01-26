package StudentsWithGroup.students;

public class Student {

    private final String lastName;
    private final String firstName;
    private final String studentCardNumber;
    private final Group group;

    public Student(String lastName, String firstName, String studentCardNumber, Group group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentCardNumber = studentCardNumber;
        this.group = group;
    }

    public void printStudentInfo(){
        System.out.println("Имя студента: " + firstName);
        System.out.println("Фамилия студента: " + lastName);
        System.out.println("Номер билета студента: " + studentCardNumber);
        System.out.println("Группа студента: " + group);
    }
}
