package homework3.validators;

public class PhoneNumberValidator {

    public static boolean isValidPhoneNumber(long phoneNumber) {
        String phoneNumberStr = String.valueOf(phoneNumber);

        // Проверка длины номера телефона
        if (phoneNumberStr.length() != 11) {
            return false;
        }

        // Проверка, что номер не начинается с нуля
        return !phoneNumberStr.startsWith("0");
    }
}
