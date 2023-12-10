package homework2;

/**
 * Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
 * При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
 * Если b равен нулю, программа должна вывести сообщение о невозможности выполнения операции и вернуть результат равный нулю.
 * После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
 * Если аргументы не переданы через командную строку, используйте значения по умолчанию.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(expr(12, 5) + "\n"); // -> 17 2.4
        System.out.println(expr(5, 0)+ "\n"); // -> 5 0.0
        System.out.println(expr(4, 2)+ "\n"); // -> 6 2.0
        System.out.println(expr(7, 0)+ "\n"); // -> 7 0.0


    }

    public static double expr(int a, int b) {
        printSum(a, b);
        // Введите свое решение ниже
        if (b == 0){
            return 0.0;
        } else
            return (double) a / b;
    }


    public static void printSum(int a, int b) {
        // Введите свое решение ниже
        int sum = a + b;
        System.out.println(sum);
    }
}
