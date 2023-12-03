package homework1.task1;

public class Main {
    public static void main(String[] args) {
        // arrayOutOfBoundsException();
        // divisionByZero();
        numberFormatException();
    }
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = new int[4];
        for (int i = 0; i < 5; i++){
            System.out.print(arr[7]);
        }
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        double a = 5/0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        int a = Integer.parseInt("Java");
    }


}
