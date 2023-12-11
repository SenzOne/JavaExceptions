package homework3.validators;

public class ReadDataValidator {

    public boolean checkName(String name){
        if (name.isEmpty())
            throw new IllegalArgumentException("Пустое имя не допустимо");
        else if (!name.matches("^[А-Яа-яA-Za-z]+$"))
            throw new IllegalArgumentException("Имя может содержать только буквы кириллицы и латиницы");
        return true;
    }


    public boolean checkDateOfBirth(String dateOfBirth) throws Exception {
        if (dateOfBirth.isEmpty())
            throw new IllegalArgumentException("Дата рождения не может быть пустой");
        else if (!DateOfBirthValidator.isValidDateFormat(dateOfBirth))
            throw new IllegalArgumentException("Ошибка в дате");
        return true;
    }

    public boolean checkPhoneNumber(long phoneNumber){
        if (!PhoneNumberValidator.isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Ошибка в номере телефона");
        }
        return true;
    }

    public boolean checkGender(char gender){
        if (gender != 'f' && gender != 'm')
            throw new IllegalArgumentException("Некорректное значение пола. Допустимые значения: 'f' или 'm'");
        return true;
    }

}
