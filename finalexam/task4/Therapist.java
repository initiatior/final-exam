package finalexam.task4;

public class Therapist {
    private String name;
    private String surname;
    private String licenseNumber;

    public Therapist(String name, String surname, String licenseNumber) {
        this.name = name;
        this.surname = surname;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "Therapist [name=" + name + ", surname=" + surname + ", licenseNumber=" + licenseNumber + "]";
    }
}