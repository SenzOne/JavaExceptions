package homework3.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Saver {
    public void saveToFile(Person person) throws IOException {
        String fileName = person.getSurName() + ".txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(getPersonData(person));
        writer.newLine();
        System.out.println("Фаил Записан");
    }


    private String getPersonData(Person person) {
        return "<" + person.getSurName() + ">" +
                "<" + person.getName() + ">" +
                "<" + person.getLastName() + ">" +
                "<" + person.getDateOfBirth() + ">" +
                "<" + person.getPhoneNumber() + ">" +
                "<" + person.getGender() + ">";
    }

}
