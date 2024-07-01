package finalexam.task3;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        Person person1 = new Person("John", "Doe", "123456789");
        Person person2 = new Person("Jane", "Smith", "987654321");

        factory.addPerson(person1);
        factory.addPerson(person2);

        System.out.println("Staff after adding two persons:");
        factory.printStaff();

        factory.deletePerson(person1);

        System.out.println("Staff after deleting one person:");
        factory.printStaff();
    }
}