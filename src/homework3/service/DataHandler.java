package homework3.service;

import homework3.validators.ConsoleReaderValidator;

public class DataHandler {

    private final Person person;
    private final ConsoleReaderValidator readDataValidator;

    public DataHandler(Person person, ConsoleReaderValidator readDataValidator) {
        this.person = person;
        this.readDataValidator = readDataValidator;
    }

    public void setData(ParseData parseData) {
        try {
            String name = parseData.getName();
            if (readDataValidator.checkName(name)) {
                person.setName(name);
            }

            String surname = parseData.getSurname();
            if (readDataValidator.checkName(surname)) {
                person.setSurName(surname);
            }

            String lastname = parseData.setLastname();
            if (readDataValidator.checkName(lastname)) {
                person.setLastName(lastname);
            }

            String dateOfBirth = parseData.setDateOfBirth();
            if (readDataValidator.checkDateOfBirth(dateOfBirth)) {
                person.setDateOfBirth(dateOfBirth);
            }

            long phoneNumber = parseData.setPhoneNumber();
            if (readDataValidator.checkPhoneNumber(phoneNumber)) {
                person.setPhoneNumber(phoneNumber);
            }

            char gender = parseData.setGender();
            if (readDataValidator.checkGender(gender)) {
                person.setGender(gender);
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Ошибка при установке данных: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

