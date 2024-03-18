package lesson_43.code.lessoncode.homeWork.task_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Необходимо указать исходный и целевой файлы в качестве аргументов программы.");
            return;
        }

        String sourceFile = args[0]; // Исходный файл
        String targetFile = args[1]; // Целевой файл

        try {
            FileReader fileReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(targetFile);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileWriter.write(line);
                fileWriter.write(System.lineSeparator()); // Добавляем перевод строки между строками
            }

            bufferedReader.close();
            fileWriter.close();

            System.out.println("Содержимое файла успешно скопировано.");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}