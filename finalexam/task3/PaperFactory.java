package finalexam.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    public void addPerson(Person p) {
        staff.add(p);
    }

    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    public void printStaff() {
        for (Person p : staff) {
            System.out.println(p);
        }
    }

    public void saveStaffToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Person p : staff) {
                writer.write(p.getName() + "," + p.getSurname() + "," + p.getPersonalNumber());
                writer.newLine();
            }
        }
    }

    public void loadStaffFromFile(String filename) throws IOException {
        staff.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    staff.add(new Person(parts[0], parts[1], parts[2]));
                }
            }
        }
    }
}