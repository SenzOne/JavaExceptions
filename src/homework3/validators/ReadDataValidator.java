package homework3.validators;


public class ReadDataValidator {
    private String data;


    public static boolean checkData(String data){
        if (data.isEmpty()){
            throw new NullPointerException("Строка не может быть пустой");
        }
        return true;
    }
}
