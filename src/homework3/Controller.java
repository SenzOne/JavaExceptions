package homework3;

import homework3.service.*;
import homework3.validators.ReadDataValidator;

import java.io.IOException;
import java.util.Arrays;

public class Controller {

    private final Person person = new Person();
    private final ReadData readData = new ReadData();
    private final ReadDataValidator readDataValidator = new ReadDataValidator();
    private final DataHandler handler = new DataHandler(person, readDataValidator);
    private final Saver saver = new Saver();

    public void addPerson() {
        try {
            readData.setData();  // Ввод из консоли или другого источника

            String stringData = readData.getData();
            ParseData parseData = new ParseData(stringData);
            System.out.println(Arrays.toString(parseData.getParsedInformation()));
            handler.setData(parseData);
            saver.saveToFile(person);

//            System.out.println(person.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }
}
