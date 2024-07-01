package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Spa implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Therapist> therapists = new ArrayList<>();

    public Spa(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addTherapist(Therapist t) {
        therapists.add(t);
    }

    public boolean deleteTherapist(Therapist t) {
        return therapists.remove(t);
    }

    public void printTherapists() {
        for (Therapist t : therapists) {
            System.out.println(t);
        }
    }

    public void saveTherapistsToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Therapist t : therapists) {
                writer.write(t.getName() + "," + t.getSurname() + "," + t.getLicenseNumber());
                writer.newLine();
            }
        }
    }

    public void loadTherapistsFromFile(String filename) throws IOException {
        therapists.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    therapists.add(new Therapist(parts[0], parts[1], parts[2]));
                }
            }
        }
    }
}
