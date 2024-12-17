
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть значення A: ");
        double A = scanner.nextDouble();


        System.out.print("Введіть кількість елементів n: ");
        int n = scanner.nextInt();


        double sumB = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Введіть значення b_" + i + ": ");
            double bi = scanner.nextDouble();
            sumB += bi;
        }


        double C = A - sumB;


        System.out.println("Результат обчислення C: " + C);
        scanner.close();
        // 2
        // public class FormulaCalculation {
        //
        //    public static long factorial(int k) {
        //        long result = 1;
        //        for (int i = 1; i <= k; i++) {
        //            result *= i;
        //        }
        //        return result;
        //    }
        //
        //
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //
        //
        //        System.out.print("Введіть натуральне число n: ");
        //        int n = scanner.nextInt();
        //
        //        System.out.print("Введіть дійсне число x: ");
        //        double x = scanner.nextDouble();
        //
        //        double y = 0; // Ініціалізація суми
        //
        //
        //        for (int k = 1; k <= n; k++) {
        //            double sinValue = Math.sin(k * x); // sin(kx)
        //            long factorialK = factorial(k);    // k!
        //            y += 1 + (sinValue / factorialK);  // Додавання до суми
        //        }
        //
        //        
        //        System.out.printf("Результат обчислення y: %.6f\n", y);
        //        scanner.close();
    }
}