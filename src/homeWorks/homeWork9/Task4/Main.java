package homeWorks.homeWork9.Task4;

public class Main {
        public static void main(String[] args) {
            int number = UserInput.getUserNumber();
            String dayOfWeek = DayOfWeek.getDay(number);
            System.out.println("День недели: " + dayOfWeek);
        }
    }


