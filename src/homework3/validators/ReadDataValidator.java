package homework3.validators;


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
        else if (!name.matches("^[A-Za-z]+$"))
            throw new IllegalArgumentException("Имя может содержать только латинсике буквы");
        return true;
    }
}
