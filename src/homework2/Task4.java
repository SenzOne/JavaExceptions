package homework2;

/**
 * Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
 * если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
 * "Пустая строка введена.".
 * В противном случае программа должна возвращать сообщение
 * "Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.
 */
public class Task4 {
    public static void main(String[] args) throws Exception {
        System.out.println(expr('0'));
    }

    public static String expr(char a) throws Exception {
    // Введите свое решение ниже
        if (a == ' ')
            throw new Exception("Empty string has been input.");
        else
            return String.format("Result: Your input was - %s", a);

    }
}
