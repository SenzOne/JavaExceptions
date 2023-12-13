package homework3.service;


public class ParseData {

    private final String[] parsedInformation;

    public ParseData(String data) {
        this.parsedInformation = data.split(" ");
    }

    public String getSurname() {
        return parsedInformation[0];
    }

    public String getName() {
        return parsedInformation[1];
    }


    public String setLastname() {
        return parsedInformation[2];
    }

    public String setDateOfBirth() {
        return parsedInformation[3];
    }

    public long setPhoneNumber() {
        return Long.parseLong(parsedInformation[4]);
    }

    public char setGender() {
        return parsedInformation[5].charAt(0);
    }

    public String[] getParsedInformation() {
        return parsedInformation;
    }
}
