package homeWorks.homeWork9.Task3;

public class NumberAnalyzer {
    public String analyze(int number) {
        String day;
        switch (number) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
            case 7:
                day = "Выходной";
                break;
            default:
                day = "Некорректное число";
                break;
        }
        return day;
    }
}






