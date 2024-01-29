package homeWorks.homeWork9.Task6;

    import java.util.Scanner;

    public class UserInput {
        public static String getUserString() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите четырехзначное число:");
            String input = scanner.nextLine();
            scanner.close();
            return input;
        }
    }


