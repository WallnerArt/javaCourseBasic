package homeWorks.homeWork9.Task4;

public class DayOfWeek {
        public static String getDay(int number) {
            String dayOfWeek;
            switch (number) {
                case 1:
                    dayOfWeek = "Понедельник";
                    break;
                case 2:
                    dayOfWeek = "Вторник";
                    break;
                case 3:
                    dayOfWeek = "Среда";
                    break;
                case 4:
                    dayOfWeek = "Четверг";
                    break;
                case 5:
                    dayOfWeek = "Пятница";
                    break;
                case 6:
                    dayOfWeek = "Суббота";
                    break;
                case 7:
                    dayOfWeek = "Воскресенье";
                    break;
                default:
                    dayOfWeek = "Некорректное число! Введите число от 1 до 7.";
                    break;
            }
            return dayOfWeek;
        }
    }


