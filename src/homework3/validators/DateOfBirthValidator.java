package homework3.validators;

public class DateOfBirthValidator {


    public static boolean isValidDateFormat(String dateStr) throws Exception{
        // Проверка длины строки на соответствие формату "dd.mm.yyyy"
        if (dateStr.length() != 10 || dateStr.charAt(2) != '.' || dateStr.charAt(5) != '.') {
            throw new IllegalArgumentException("Дата не соответствует формату dd.mm.yyyy");
        }

        // Разделение строки на компоненты даты
        String[] dateComponents = dateStr.split("\\.");

        // Проверка, состоят ли компоненты из цифр
        for (String component : dateComponents) {
            if (!component.matches("\\d+")) {
                throw new IllegalArgumentException("Дата может состоять только из цифр");
            }
        }

        // Извлечение дня, месяца и года
        int day = Integer.parseInt(dateComponents[0]);
        int month = Integer.parseInt(dateComponents[1]);
        int year = Integer.parseInt(dateComponents[2]);

        // Проверка дня, месяца и года на корректные значения
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1943 || year > 2023) {
            throw new IllegalArgumentException("Ошибка в данных dd.mm.yyyy");
        }

        // Проверка корректности даты с учетом количества дней в месяце
        boolean isValidDate;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                isValidDate = (day <= 30);
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    isValidDate = (day <= 29);
                } else {
                    isValidDate = (day <= 28);
                }
                break;
            default:
                isValidDate = true;
        }

        return isValidDate;
    }
}
