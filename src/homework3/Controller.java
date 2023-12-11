package homework3;


import homework3.service.ParseData;
import homework3.service.ReadData;
import homework3.validators.ReadDataValidator;

public class Controller {
    private String data;
    private String resData;
    ReadData readData = new ReadData();
    ReadDataValidator readDataValidator = new ReadDataValidator();




    public void startProgram(){
        while (resData == null){
            try {
                readData.setData();  // ввод из cmd
                String stringData = readData.getData();  //
                ParseData parseData = new ParseData(stringData);
                String name = parseData.getName();
                if (readDataValidator.checkName(name)) {
                    resData = name;
                    System.out.println("Иия Записано!");
                }


            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
