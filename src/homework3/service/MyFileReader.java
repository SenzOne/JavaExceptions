package homework3.service;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {


    public boolean searchInSurnameAndHashcode(Person person) throws IOException {
        String fileName = "/Users/s.slashchhinin/IdeaProjects/JavaExceptions/SurnamesAndHashCode.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Обработка строки из файла
                String[] data = line.split(";");
                int hash = Integer.parseInt(data[1]);
                if (data[0].equals(person.getSurName()) && person.hashCode() == hash){
                    System.out.println(person.getSurName()  + " уже есть в базе");
                    return false;
                }

            }
        }
        return true;
    }
}
