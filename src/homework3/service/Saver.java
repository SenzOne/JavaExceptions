package homework3.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Saver {
    public void saveToFile(Person person) throws IOException {
        savePersonData(person);
        saveSurnamesAndHashCode(person);
        System.out.println("Данные о персоне сохранены.");
    }

    private void savePersonData(Person person) throws IOException {
        String fileName = person.getSurName() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(getPersonData(person));
            writer.newLine();
            System.out.println("Данные записаны в файл " + fileName);
        }
    }

    private void saveSurnamesAndHashCode(Person person) {
        String fileName = "SurnamesAndHashCode.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(person.getSurName() + ';' + person.hashCode() + ';');
            writer.newLine();
            System.out.println("Код записан в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи кода в файл: " + e.getMessage());
        }
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
