package homework3;


import homework3.service.ReadData;
import homework3.validators.ReadDataValidator;

public class Controller {
    private String data;
    ReadData readData = new ReadData();

    public void startProgram(){
        System.out.println("Здравствуйте! ");
        while (data == null){
            try {
                data = readData.setData();
                System.out.println(data); // TODO: добавить запись в файл
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
