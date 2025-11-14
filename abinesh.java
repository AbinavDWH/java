
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }

    // void sound() {
    //     System.out.println("Dog barks");
    // }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}



class abinesh{
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
    }
}