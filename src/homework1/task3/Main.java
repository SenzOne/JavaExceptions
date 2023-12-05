package homework1.task3;

import java.util.Arrays;

/*
Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий
новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны - верните нулевой массив длины 1.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{12, 8, 16};
        int[] b = new int[]{4, 2, 5};
        Answer2 answer = new Answer2();
        System.out.println(Arrays.toString(answer.divArrays(a, b)));
    }

    static class Answer2 {
        public int[] divArrays(int[] a, int[] b) {
            // Введите свое решение ниже
            if (a.length != b.length)
                return new int[]{0};
            else {
                int[] res = new int[a.length];
                for (int i = 0; i < a.length; i++) {
                    if (b[i] == 0){
                        throw new RuntimeException();
                    }
                    else {
                        res [i] = a[i] / b[i];
                    }

                }
                return res;
            }
        }
    }
}

