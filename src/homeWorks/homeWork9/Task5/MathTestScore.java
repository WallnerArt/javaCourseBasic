package homeWorks.homeWork9.Task5;

    import java.util.Random;

    public class MathTestScore {
        public static int generateTestScore() {
            Random random = new Random();
            return random.nextInt(13); // Генерация случайного числа от 0 до 12
        }
    }


