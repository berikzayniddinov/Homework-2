// Imports the ArrayList
import java.util.ArrayList;
// Imports the Collections
import java.util.Collections;
public class Main { // Creating a main class
    // Method to print data of each person along with their earnings
    public static void printData(Iterable<Person> people) {
        // Iterates over each person in the iterable collection
        for (Person person : people) {
            // Prints person details and their payment amount
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
    // Main method of the program
    public static void main(String[] args) {
        // Creates an Employee object
        Employee emp1 = new Employee("Ermek", "Orazbekov", "Java developer", 270450.78);
        Employee emp2 = new Employee("Davlat", "Sunnatov", "C++ Developer", 500000.00);
        // Creates a Student object
        Student stu1 = new Student("Alikhan", "Borash", 3.0);
        Student stu2 = new Student("Rassul", "Satpekov", 2.5);


        // Adding created objects to an ArrayList of type Person
        ArrayList<Person> people = new ArrayList<>();
        // Adds all the objects to the ArrayList
        Collections.addAll(people, emp1, emp2, stu1, stu2);
        // Sorting the ArrayList based on the payment amount
        Collections.sort(people);
        // Calling the printData method to print each person's details
        printData(people); // Calls the printData method to display the sorted list of people and their earnings
    }
}