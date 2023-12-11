package homework3.validators;


import javax.imageio.IIOException;

public class ReadDataValidator {


//    public boolean checkData(){
//        if (parsedInformation.length != 3) {
//            throw new IllegalCallerException("Введено недостаточно данных");
//        }
//        return true;
//    }

    //TODO: реализация методов Check name, surname, ...., и вызов их в checkData
    public boolean checkName(String name){
        if (name.isEmpty())
            throw new IllegalArgumentException("пустое Имя не допустимо");
        else if (!name.matches("^[А-Яа-я]+$"))
            throw new IllegalArgumentException("Имя может содержать только латинсике буквы");
        return true;
    }

    public boolean checkDateOfBirth(String dateOfBirth) throws Exception {
        if (dateOfBirth.isEmpty())
            throw new IllegalArgumentException("Дата рождения не может быть пустой");
        // DateOfBirthValidator data =  new DateOfBirthValidator();
        else if (!DateOfBirthValidator.isValidDateFormat(dateOfBirth))
            throw new IllegalArgumentException("Ошибка в дате");
        return true;
    }
}
