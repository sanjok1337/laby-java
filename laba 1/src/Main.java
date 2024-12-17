//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 2.5.1
        final int decimal = 11;
        final int octal = 027;
        final int hex = 0xff0a;
        final long long_decimal = 25L;

        // 2.5.2
        // Керуючі символи
        System.out.println('\n'); // Символ переведення рядка
        System.out.println('\r'); // Символ повернення каретки
        System.out.println('\f'); // Символ переведення сторінки
        System.out.println('\b'); // Символ повернення на крок
        // Символи у кодуванні Unicode
        System.out.println('\u0053'); // Символ S (Unicode)
        System.out.println('\u0416'); // Символ Ж (Unicode)

        //2.5.4
        String part1 = "test";
        String part2 = "test2";
        System.out.println(part1 + part2);

        //2.6
        int variable = 13;
        boolean isCompleted = false;
        String meeting = "Hello";

        //2.7.2
        int number1 = 7;
        int number2 = 10;
        System.out.println(number1 > number2);

        int number3 = 11;
        int number4 = 11;
        System.out.println(number3 == number4);

        //2.7.3
        if (11 > 3 && 3 > 0) {
            System.out.println("Correct both");
        }
        if (3 < 0 || 0 == 0) {
            System.out.println("Correct one");
        }

        //2.7.4
        // short: від -32768 до 32767
        short minShort = -32768;
        short maxShort = 32767;

        // int: від -2147483648 до 2147483647
        int minInt = -2147483648;
        int maxInt = 2147483647;

        // long: від -9223372036854775808 до 9223372036854775807
        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;

        //2.7.5.1
        int num13 = (3 * 2 + 4 - 2) / 2;
        System.out.println(num13);
        int num14 = 7%3;
        System.out.println(num14);

        //2.7.5.2
        byte b1 = 50, b2 = -99;
        short k = (short) (b1 + b2); // Вірно!
        System.out.println("Результат після явного приведення типів: k = " + k);

        //2.7.5.3
        boolean num15 = 5 == 3;
        boolean num16 = 3 > 0;
        boolean num17 = 1 != 0;

        //2.7.5.4
        byte b3 = 50;
        byte b4 = -99;

        int notB3 = ~b4;
        int andResult = b3 & b4;
        int orResult = b3 | b4;
        int xorResult = b3 ^ b4;

        System.out.println("~b4 = " + notB3);
        System.out.println("b3 & b4 = " + andResult);
        System.out.println("b3 | b4 = " + orResult);
        System.out.println("b3 ^ b4 = " + xorResult);

        //2.7.5.5
        byte b6 = 50;
        byte b7 = -99;

        int intB6 = b6;
        int intB7 = b7;

        // Зсув вліво <<
        int shiftLeftB6 = intB6 << 2;
        int shiftLeftB7 = intB7 << 2;

        // Зсув вправо >>
        int shiftRightB6 = intB6 >> 2;
        int shiftRightB7 = intB7 >> 2;

        // Беззнаковий зсув вправо >>>
        int unsignedShiftRightB6 = intB6 >>> 2;
        int unsignedShiftRightB7 = intB7 >>> 2;

        System.out.println("b6 << 2 = " + shiftLeftB6);
        System.out.println("b7 << 2 = " + shiftLeftB7);
        System.out.println("b6 >> 2 = " + shiftRightB6);
        System.out.println("b7 >> 2 = " + shiftRightB7);
        System.out.println("b6 >>> 2 = " + unsignedShiftRightB6);
        System.out.println("b7 >>> 2 = " + unsignedShiftRightB7);

        //2.7.6
        float x = 0.001f;
        double y = -34.789;
        double z = 21;

        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;
        double notANum = Double.NaN;

        System.out.println("Positive Infinity = " + posInf);
        System.out.println("Negative Infinity = " + negInf);
        System.out.println("Not a Number = " + notANum);
        System.out.println("0.0 == -0.0? " + (0.0 == -0.0));

        //2.7.7
        double h = 3.5;
        double g = 2 * (x - 0.567) / (x + 2);
        boolean b = h < g;
        boolean bb = h >= g && b;

        //2.7.8
        int f = -5;
        int result = f < 0 ? 0 : f; // result буде 0, оскільки x < 0

        int a = 7;
        int j = 3;
        int max = a > j ? a : j; // max буде 7, оскільки a > b

        int n = 0;
        int safeDivision = n == 0 ? 0 : 10 / n; // safeDivision буде 0, оскільки n == 0
    }
}