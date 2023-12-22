package mirea.javalabs.lab13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceInFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите новую информацию для записи в файл: ");
            String input = scanner.nextLine();

            FileWriter fileWriter = new FileWriter("myfile.txt");
            fileWriter.write(input);
            fileWriter.close();

            System.out.println("Информация успешно заменена в файле.");
        } catch (IOException e) {
            System.err.println("Произошла ошибка при замене информации в файле: " + e.getMessage());
        }
    }
}
