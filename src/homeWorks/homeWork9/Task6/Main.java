package homeWorks.homeWork9.Task6;
    public class Main {
        public static void main(String[] args) {
            String inputNumber = UserInput.getUserString();
            boolean isLucky = NumberChecker.isLuckyTicket(inputNumber);

            if (isLucky) {
                System.out.println("Число является счастливым билетом!");
            } else {
                System.out.println("Число не является счастливым билетом.");
            }
        }
    }


