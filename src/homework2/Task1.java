package homework2;

/**
 * Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
 * Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
 * Если преобразование не удалось, программа выдаёт сообщение об ошибке и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(isFloat("2.4"));
    }

    public static float isFloat(String input) {
// Введите свое решение ниже
        try {
            return Float.parseFloat(input);
        } catch (Exception e) {
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }
    }


}
