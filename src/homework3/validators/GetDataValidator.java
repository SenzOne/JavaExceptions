package homework3.validators;

public class GetDataValidator {
    public boolean checkConsoleData(String consoleData){
        if (consoleData == null){
            throw new NullPointerException(" введен null");
        } else if (consoleData.isEmpty() || consoleData.equals(" ")) {
            throw new IllegalArgumentException(" введена пустая строка null");
        } else if (consoleData.split(" ").length != 6 ) {
            throw new IndexOutOfBoundsException(" введено недостаточно аргументов");
        } else return true;
    }
}
