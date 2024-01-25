// Declaration of the Person class implementing Payable and Comparable interfaces
class Person implements Payable, Comparable<Person> {
    // Static variable for counting the number of Person instances created
    private static int counter = 0;

    // Public variable to store the unique ID of the person
    public int id;

    // Private variables to store the person's name and surname
    private String name;
    private String surname;

    // Default constructor
    public Person() {
        // Increment the counter and assign it to the id
        this.id = ++counter;
    }

    // Parameterized constructor
    public Person(String name, String surname) {
        // Calls the default constructor
        this();
        // Initialize the name and surname
        this.name = name;
        this.surname = surname;
    }

    // Getters and setters for id, name, and surname
    public int getId() {
        return id;
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

    // toString method to return a string representation of the Person object
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    // getPosition method returning a string indicating the person's position
    public String getPosition() {
        return "Person";
    }

    // Implementation of the getPaymentAmount method from the Payable interface
    public double getPaymentAmount() {
        return 0.0;
    }

    // Implementation of the compareTo method from the Comparable interface
    public int compareTo(Person person) {
        // Compares two Person objects based on their payment amount
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
// Declaration of the Payable interface with a method getPaymentAmount
interface Payable {
    double getPaymentAmount();
}