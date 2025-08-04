public class car {

    // ---------------------------------------------------
    // Static Variable (Class Variable)
    // - Belongs to the c class, not to any specific car object.
    // - There's only one copy shared by all Car objects.
    // - Initialized when the Car class is loaded into memory.
    // ---------------------------------------------------
    public static int numberOfCarsCreated = 0; // Tracks how many Car objects have been made

    // ---------------------------------------------------
    // Non-Static Variables (Instance Variables)
    // - Belongs to each individual Car object.
    // - Each Car object will have its own 'make', 'model', and 'year'.
    // - Memory allocated when a new Car object is created on the Heap.
    // ---------------------------------------------------
    public String make;
    public String model;
    public int year;

    // Constructor for the Car class
    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        numberOfCarsCreated++; // Increment the static counter every time a new Car is created
    }

    // Non-static method (can access both static and non-static variables)
    public void displayCarInfo() {
        System.out.println("Car Info: " + this.year + " " + this.make + " " + this.model);
        System.out.println("Total Cars Created (from instance method): " + numberOfCarsCreated);
    }

    // Static method (can ONLY access static variables directly)
    // To access non-static variables from a static method, you need an object instance.
    public static void showTotalCars() {
        System.out.println("--- Static Method Call ---");
        System.out.println("Total Cars in Inventory (from static method): " + numberOfCarsCreated);
        // Uncommenting the line below would cause a compilation error:
        // System.out.println("Make: " + make); // Error: Cannot make a static reference to the non-static field make
    }

    public static void main(String[] args) {
        System.out.println("--- Program Start ---");

        // Accessing static variable directly using the class name before any objects are created
        System.out.println("Initial number of cars: " + car.numberOfCarsCreated);

        // Create the first Car object
        System.out.println("\nCreating Car 1:");
        car car1 = new car("Toyota", "Camry", 2020);
        car1.displayCarInfo(); // Call non-static method
        System.out.println("Current number of cars (via static variable direct access): " + car.numberOfCarsCreated);

        // Create the second Car object
        System.out.println("\nCreating Car 2:");
        car car2 = new car("Honda", "Civic", 2022);
        car2.displayCarInfo(); // Call non-static method
        System.out.println("Current number of cars (via static variable direct access): " + car.numberOfCarsCreated);

        // Demonstrate sharing of static variable
        // Even though we're accessing it via car1, it's the SAME static variable
        System.out.println("\nAccessing static variable via car1 object (though not recommended practice): " + car1.numberOfCarsCreated);

        // Accessing static method
        car.showTotalCars();

        // Modify a non-static variable (only affects car1)
        System.out.println("\nModifying car1's make...");
        car1.make = "Lexus"; // Only car1's make changes
        car1.displayCarInfo();
        car2.displayCarInfo(); // car2's make remains Honda

        // Modify the static variable directly (affects all views of it)
        System.out.println("\nManually setting numberOfCarsCreated to 10 (just for demo):");
        car.numberOfCarsCreated = 10;
        System.out.println("Total Cars now: " + car.numberOfCarsCreated);
        car1.displayCarInfo(); // Notice displayCarInfo shows the new static value
        car2.displayCarInfo(); // Same for car2

        System.out.println("\n--- Program End ---");
    }
}