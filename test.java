class test{
    public static void main(String[] args) {
        var car1 = new car("Toyota", "Camry", 2020);
        car1.showTotalCars(); // Call static method to show total cars created
        Integer num = 10; // Example of using Integer wrapper class
        num++;
        System.out.println("Number: " + ++num); // Display the number
        System.out.println("Hello, World!");
    }
}