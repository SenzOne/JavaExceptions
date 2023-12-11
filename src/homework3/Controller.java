package homework3;

import homework3.service.DataHandler;
import homework3.service.ParseData;
import homework3.service.Person;
import homework3.service.ReadData;
import homework3.validators.ReadDataValidator;

public class Controller {

    private final Person person = new Person();
    private final ReadData readData = new ReadData();
    private final ReadDataValidator readDataValidator = new ReadDataValidator();
    private final DataHandler handler = new DataHandler(person, readDataValidator);

    public void addPerson() {
        try {
            readData.setData();  // Ввод из консоли или другого источника

            String stringData = readData.getData();
            ParseData parseData = new ParseData(stringData);

            handler.setData(parseData);

            System.out.println(person.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }
}
