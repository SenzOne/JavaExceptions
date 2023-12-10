package homework2;

/**
 * Напишите программу, которая вычисляет значение выражения intArray[8] / d, где intArray- массив целых чисел, а d - делитель.
 * Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
 * Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.
 */
public class Task2 {
    public static void main(String[] args) {
         int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 6,4, 4,5};
         int d = 1;
        System.out.println(expr(intArray, d));
    }

    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        double res;
        try {
            res = intArray[8] / d;
            System.out.printf("intArray[8] / d = %s / %s = %s\n", intArray[8], d, res);
            return res;
        } catch (ArithmeticException e){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0");
            return Double.NaN;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        }
    }
}
