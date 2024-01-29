package homeWorks.homeWork9.Task4;

    import java.util.Scanner;

    public class UserInput {
        public static int getUserNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число от 1 до 7:");
            int number = scanner.nextInt();
            scanner.close();
            return number;
        }
    }


