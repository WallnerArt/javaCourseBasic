package homeWorks.homeWork9.Task5;

public class TVTimeChecker {
    public static int calculateRemainingTime(int testScore, int remainingTimeToday) {
        int maxTVTime;
        switch (testScore) {
            case 0:
                maxTVTime = 0;
                break;
            case 1:
            case 2:
                maxTVTime = 15;
                break;
            case 3:
            case 4:
                maxTVTime = 30;
                break;
            case 5:
            case 6:
                maxTVTime = 45;
                break;
            case 7:
            case 8:
                maxTVTime = 60;
                break;
            case 9:
            case 10:
                maxTVTime = 75;
                break;
            case 11:
            case 12:
                maxTVTime = 90;
                break;
            default:
                maxTVTime = 0;
                break;
        }
        return Math.min(maxTVTime, remainingTimeToday);
    }
}

