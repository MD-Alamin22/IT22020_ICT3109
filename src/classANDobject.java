class Dog {
    String name;
    int age;

    void bark() {
        System.out.println(name + " is barking!");
    }
}

public class classANDobject {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // object creation
        myDog.name = "Buddy";
        myDog.age = 3;
        myDog.bark();
    }
}
