package model;

public class PersonalData {
    private int personalDataId;
    private String email;
    private String phoneNumber;
    private String Address;

    public PersonalData(int personalDataId, String email, String phoneNumber, String address) {
        this.personalDataId = personalDataId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        Address = address;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "personalDataId=" + personalDataId +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public PersonalData() {
    }

    public int getPersonalDataId() {
        return personalDataId;
    }

    public void setPersonalDataId(int personalDataId) {
        this.personalDataId = personalDataId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
