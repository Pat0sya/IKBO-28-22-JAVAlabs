package mirea.javalabs.lab13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите текст для добавления в файл: ");
            String input = scanner.nextLine();

            FileWriter fileWriter = new FileWriter("myfile.txt", true);
            fileWriter.write(input);
            fileWriter.close();

            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            System.err.println("Произошла ошибка при добавлении текста в файл: " + e.getMessage());
        }
    }
}
