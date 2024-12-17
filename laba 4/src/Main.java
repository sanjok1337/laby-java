import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення початкового рядка
        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        // Знаходимо індекси першої та останньої крапок
        int firstDot = input.indexOf('.');
        int lastDot = input.lastIndexOf('.');

        // Перевірка наявності крапок і коректності індексів
        if (firstDot != -1 && lastDot != -1 && firstDot < lastDot) {
            String result = input.substring(firstDot + 1, lastDot);
            System.out.println("Рядок між першою і останньою крапками: " + result);
        } else {
            System.out.println("У рядку недостатньо крапок або вони розташовані некоректно.");
        }

        scanner.close();
    }
}


//import java.util.Scanner;
//
//public class CharacterCounter {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String text;
//
//
//        String predefinedText = "Це приклад статичного тексту.";
//        System.out.println("Статичний текст: " + predefinedText);
//        System.out.println("Кількість символів у статичному тексті: " + predefinedText.length());
//
//
//        System.out.print("Введіть текст: ");
//        text = scanner.nextLine();
//        System.out.println("Введений текст: " + text);
//        System.out.println("Кількість символів у введеному тексті: " + text.length());
//
//        scanner.close();
//    }
//}