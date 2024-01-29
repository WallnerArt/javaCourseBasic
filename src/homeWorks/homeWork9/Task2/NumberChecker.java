package homeWorks.homeWork9.Task2;

public class NumberChecker {
        public static void checkNumber(int number) {
            switch (number) {
                case 1:
                    System.out.println("Вы ввели число 1");
                    break;
                case 2:
                    System.out.println("Вы ввели число 2");
                    break;
                case 3:
                    System.out.println("Вы ввели число 3");
                    break;
                default:
                    System.out.println("Вы ввели некорректное число");
                    break;
            }
        }
    }


