package homework3;


import homework3.service.ParseData;
import homework3.service.Person;
import homework3.service.ReadData;
import homework3.validators.ReadDataValidator;

public class Controller {

    private String data;
    private Person person = new Person();
    private String resData;
    private final ReadData readData = new ReadData();
    private final ReadDataValidator readDataValidator = new ReadDataValidator();

    public void addPerson(){
        int dataCount = 1;
        while (dataCount <= 6){
            try {
//                readData.setData();  // ввод из cmd
//                String stringData = readData.getData();  //
                String stringData = "Карпов Анатолий Владимирович 89276475473 04.12.2002 f"; //
                ParseData parseData = new ParseData(stringData);

                String name = parseData.getName();
                if (readDataValidator.checkName(name)) {
                    person.setName(name);
                    dataCount++;
                }
                String surname = parseData.getSurname();
                if (readDataValidator.checkName(surname)){
                    person.setSurName(surname);
                    dataCount++;
                }
                String lastname = parseData.setLastname();
                if (readDataValidator.checkName(lastname)){
                    person.setLastName(lastname);
                    dataCount++;
                }
                String dateOfBirth = parseData.setDateOfBirth();
                if (readDataValidator.checkDateOfBirth(dateOfBirth)){
                    person.setDateOfBirth(dateOfBirth);
                    dataCount++;
                }



            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(person.toString());
    }
}
