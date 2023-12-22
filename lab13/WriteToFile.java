package mirea.javalabs.lab13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите информацию для записи в файл: ");
            String input = scanner.nextLine();

            writer.write(input);
            writer.close();

            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
