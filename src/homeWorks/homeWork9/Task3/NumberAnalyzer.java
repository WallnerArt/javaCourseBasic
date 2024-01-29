package homeWorks.homeWork9.Task3;

public class NumberAnalyzer {
        public static int findMax(int[] numbers) {
            int max = numbers[0];
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }
    }




