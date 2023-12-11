package homework3.service;

import homework3.validators.ReadDataValidator;

public class ParseData {
    ReadDataValidator readDataValidator = new ReadDataValidator();
    private final String[] parsedInformation;

    public ParseData(String data) {
        this.parsedInformation = data.split(" ");
    }

    public String getName() {
        return parsedInformation[0];
    }

    public String getSurname() {
        return parsedInformation[1];
    }

    public String setLastname() {
        return parsedInformation[2];
    }

    public String setDateOfBirth() {
        return parsedInformation[4];
    }

    public int setPhoneNumber() {
        return Integer.parseInt(parsedInformation[4]);
    }

    public char setGender() {
        return parsedInformation[5].charAt(0);
    }

    public String[] getParsedInformation() {
        return parsedInformation;
    }
}
