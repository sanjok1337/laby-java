import java.io.*;
import java.util.Scanner;


class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Перевірка CustomException: ");
            System.out.print("Введіть число більше за 0: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                throw new CustomException("Число повинно бути більше за 0!");
            }
            System.out.println("Ви ввели коректне число: " + number);
        } catch (CustomException e) {
            System.out.println("Виняток CustomException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Інший виняток: " + e.getMessage());
        }

        // NullPointerException
        try {
            System.out.println("\nПеревірка NullPointerException: ");
            String text = null;
            System.out.println("Довжина рядка: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Виняток NullPointerException: Спроба звернення до null!");
        }

        // IOException
        try {
            System.out.println("\nПеревірка IOException: ");
            System.out.print("Введіть шлях до файлу: ");
            scanner.nextLine(); // Очистка буфера
            String filePath = scanner.nextLine();
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Виняток IOException: Файл не знайдено!");
        } catch (IOException e) {
            System.out.println("Виняток IOException: Помилка вводу-виводу!");
        }

        scanner.close();
    }
}
