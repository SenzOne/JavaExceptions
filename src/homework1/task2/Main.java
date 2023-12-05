package homework1.task2;

import java.util.Arrays;

// Если длины массивов не равны - верните нулевой массив длины 1.
// Напишите свой код в методе subArrays класса Answer.
// Метод subArrays принимает на вход два параметра:
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, 2, 3, 6};
        Answer answer = new Answer();
        System.out.println(Arrays.toString(answer.subArrays(a, b)));
    }

    static class Answer {
        public int[] subArrays(int[] a, int[] b) {
            // Введите свое решение ниже
            if (a.length != b.length)
                return new int[]{0};
            else {
                int[] res = new int[a.length];
                for (int i = 0; i < a.length; i++) {
                    res[i] = a[i] - b[i];
                }
                return res;
            }
        }
    }
}
