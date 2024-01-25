// Creating Student class extending Person
class Student extends Person {
    // Static variable for counting Student instances
    private static int counter = 0;
    // Private variable for the student's GPA
    private double gpa;
    // Default constructor
    public Student() {
        // Increments the counter and assigns it to the id
        this.id = ++counter;
    }
    // Parametrized constructor
    public Student(String name, String surname, double gpa) {
        // Calls the superclass (Person) constructor to initialize name and surname
        super(name, surname);
        // Initializes the GPA.
        this.gpa = gpa;
    }
    // Getters and setters
    public double getGpa() {
        return gpa; // Getter for GPA.
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    // toString method
    public String toString() {
        // Overrides toString method to include student details
        return "Student: " + super.toString();
    }
    // Implementation of Payable interface
    public double getPaymentAmount() {
        // Implements getPaymentAmount from Payable, conditional on GPA
        return (gpa > 2.67) ? 36660.00 : 0.00;
    }
}