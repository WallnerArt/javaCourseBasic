package homeWorks.homeWork14.task4;

public class Main {
    // Класс Main содержит метод main
        public static void main(String[] args) {
            // 1. Создаем массив типа String с размером 7.
            StringArray stringArray = new StringArray(7);

            // 2. Записываем в него значения дней недели.
            stringArray.setDayOfWeek(0, "Понедельник");
            stringArray.setDayOfWeek(1, "Вторник");
            stringArray.setDayOfWeek(2, "Среда");
            stringArray.setDayOfWeek(3, "Четверг");
            stringArray.setDayOfWeek(4, "Пятница");
            stringArray.setDayOfWeek(5, "Суббота");
            stringArray.setDayOfWeek(6, "Воскресенье");

            // 3. Выводим на консоль значение последнего элемента.
            System.out.println("Последний день недели: " + stringArray.getLastDayOfWeek());
        }
    }

    // Класс StringArray для работы с массивом строк
    class StringArray {
        private String[] array;

        // Конструктор класса
        public StringArray(int size) {
            array = new String[size]; // Создаем массив строк заданного размера
        }

        // Метод для установки значения дня недели по индексу
        public void setDayOfWeek(int index, String dayOfWeek) {
            array[index] = dayOfWeek;
        }

        // Метод для получения значения последнего дня недели
        public String getLastDayOfWeek() {
            return array[array.length - 1];
        }
    }


