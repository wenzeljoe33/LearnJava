package joe.wenzel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Boxer", 8, 20, 2, 4, 1, 20, 4, 5, "foat" );
        dog.eat();
        dog.walk();
        dog.run();

    }
}
