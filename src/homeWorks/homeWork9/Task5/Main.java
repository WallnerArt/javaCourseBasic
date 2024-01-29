package homeWorks.homeWork9.Task5;

    public class Main {
        public static void main(String[] args) {
            int testScore = MathTestScore.generateTestScore();
            int remainingTimeToday = 45;
            int maxTVTime = TVTimeChecker.calculateRemainingTime(testScore, remainingTimeToday);

            System.out.println("Оценка за контрольную работу: " + testScore);
            System.out.println("Максимальное время просмотра телевизора: " + maxTVTime + " минут");
        }
    }

