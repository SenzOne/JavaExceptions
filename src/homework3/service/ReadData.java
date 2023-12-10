package homework3.service;

import homework3.validators.ReadDataValidator;

import java.util.Scanner;

public class ReadData {
    private String data;

    public String setData(){
        System.out.println("""
                Форматы данных:\s
                фамилия, имя, отчество - строки
                дата рождения - строка формата dd.mm.yyyy
                номер телефона - целое беззнаковое число без форматирования
                пол - символ латиницей f или m.""");
        System.out.println("Введите данные: ");
        Scanner scanner = new Scanner(System.in);
        data = scanner.nextLine();

        if (ReadDataValidator.checkData(data)) {
            System.out.println(data);
            return "";
        }
        else return null;
    }

    public void setData(String input){
        data = input;
    }

    public String getData() {

        return data;
    }
}
