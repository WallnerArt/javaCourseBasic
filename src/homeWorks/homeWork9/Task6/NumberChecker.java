package homeWorks.homeWork9.Task6;
    public class NumberChecker {
        public static boolean isLuckyTicket(String number) {
            if (number.length() != 4) {
                System.out.println("Ошибка: Не четырехзначное число!");
                return false;
            }

            int sumFirstTwoDigits = Character.getNumericValue(number.charAt(0)) + Character.getNumericValue(number.charAt(1));
            int sumLastTwoDigits = Character.getNumericValue(number.charAt(2)) + Character.getNumericValue(number.charAt(3));

            return sumFirstTwoDigits == sumLastTwoDigits;
        }
    }


