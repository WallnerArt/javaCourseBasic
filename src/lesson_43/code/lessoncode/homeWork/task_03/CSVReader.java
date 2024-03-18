package lesson_43.code.lessoncode.homeWork.task_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Создаем класс для чтения данных из CSV файла
public class CSVReader {
    // Метод для чтения данных из CSV файла и выполнения операций над ними
    public void readCSV(String filePath) {
        try {
            // Создаем объект FileReader для чтения файла
            FileReader fileReader = new FileReader(filePath);

            // Создаем объект BufferedReader для буферизации чтения данных из файла
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Читаем первую строку, предполагая, что она содержит заголовки столбцов
            String line = bufferedReader.readLine();
            if (line != null) {
                // Разделяем строку по запятым, чтобы получить массив значений столбцов
                String[] headers = line.split(",");

                // Выводим заголовки столбцов
                System.out.println("Headers: ");
                for (String header : headers) {
                    System.out.print(header + "\t");
                }
                System.out.println("\n");

                // Читаем остальные строки данных из файла
                while ((line = bufferedReader.readLine()) != null) {
                    // Разделяем строку по запятым, чтобы получить массив значений текущей строки
                    String[] data = line.split(",");

                    // Обработка данных, например, можно вычислить сумму числовых значений в строке
                    double sum = 0;
                    for (int i = 0; i < data.length; i++) {
                        try {
                            double value = Double.parseDouble(data[i]);
                            sum += value;
                        } catch (NumberFormatException e) {
                            // Если значение не является числом, игнорируем его
                        }
                    }
                    System.out.println("Sum of values in current line: " + sum);
                }
            }

            // Закрываем BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Создаем объект класса CSVReader
        CSVReader csvReader = new CSVReader();

        // Указываем путь к CSV файлу для чтения данных
        String filePath = "data.csv";

        // Вызываем метод для чтения данных из CSV файла
        csvReader.readCSV(filePath);
    }
}
