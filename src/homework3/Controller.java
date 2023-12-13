package homework3;

import homework3.service.*;
import homework3.validators.ConsoleReaderValidator;
import homework3.validators.GetDataValidator;

import java.io.IOException;
import java.util.Arrays;

public class Controller {

    private final Person person = new Person();
    private final ConsoleReader consoleReader = new ConsoleReader();
    private final ConsoleReaderValidator consoleReaderValidator = new ConsoleReaderValidator();
    private final DataHandler handler = new DataHandler(person, consoleReaderValidator);
    private final Saver saver = new Saver();
    private final MyFileReader myReader = new MyFileReader();
    private final GetDataValidator getDataValidator = new GetDataValidator();

    public void addPerson() {
        try {
            consoleReader.setData();
            String stringData = consoleReader.getData();
            if (getDataValidator.checkConsoleData(stringData)){
                ParseData parseData = new ParseData(stringData);
                handler.setData(parseData);
                if (myReader.searchInSurnameAndHashcode(person))
                    saver.saveToFile(person);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом" + e.getMessage() + Arrays.toString(e.getStackTrace()));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка ввода в консоль" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage() + Arrays.toString(e.getStackTrace()));
        }
    }
}
