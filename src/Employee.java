// Employee class extends Person
class Employee extends Person {
    // Static variable for counting Employee instances
    private static int counter = 0;
    // Private variable to store the employee's position
    private String position;
    // Private variable to store the employee's salary
    private double salary;
    // Default constructor
    public Employee() {
        // Increments the counter and assigns it to the id
        this.id = ++counter;
    }
    // Parametrized constructor
    public Employee(String name, String surname, String position, double salary) {
        // Calls the superclass (Person) constructor
        super(name, surname);
        // Initializes the position
        this.position = position;
        // Initializes the salary.
        this.salary = salary;
    }
    // Getters and setters
    public String getPosition() {
        return position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // toString method
    public String toString() {
        return "Employee: " + super.toString();
    }
    // Implementation of Payable interface
    public double getPaymentAmount() {
        // Returns the payment amount, which is the salary for an employee
        return salary;
    }
}