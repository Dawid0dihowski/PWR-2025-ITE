package pl.edu.pwr.dkocyla.np;

public class Customer {
    // ===== ZADANIE 5: model danych zamawiającego do deserializacji JSON-a =====
    // Dane zamawiającego; pola są prywatne, a Jackson wypełnia je przez settery.
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
}
