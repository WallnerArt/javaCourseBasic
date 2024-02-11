package lesson19.code.lessoncode.incapsulation.companyVar2;

import lesson6.code.lessoncode.scanner.UserInput;

public class CompanyUtil {

    public void fillDepartments(Department[] departments){
        UserInput userInput = new UserInput();

        for (int i = 0; i < departments.length; i++) {
            int quantityEmployees = userInput.inputInteger("Количество сотрудников в " + (i + 1) + " департаменте?: ");
        }

    }
}
