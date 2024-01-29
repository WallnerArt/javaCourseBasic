package homeWorks.homeWork9.Task2;

    import java.util.Scanner;

    public class UserInput {
        public static int getUserNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число (1, 2 или 3):");
            int number = scanner.nextInt();
            scanner.close();
            return number;
        }
    }


