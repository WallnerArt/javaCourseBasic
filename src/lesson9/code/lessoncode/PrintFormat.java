package lesson9.code.lessoncode;

import lesson6.code.lessoncode.scanner.UserInput;

public class PrintFormat {
    public static void main(String[] args) {

        UserInput ui = new UserInput();

        double pi = ui.inputDouble("Enter double: ");

//        System.out.println(pi);
//
//        System.out.printf("%.1f", pi);
//        System.out.println();
//
//        String piLikaString = String.format("%.2f", pi);
//
//        System.out.println(piLikaString);


        if ((pi - (int) pi) == 0) {
            System.out.println((int) pi);
        } else {
            System.out.printf("%.2f", pi);
        }

    }
}