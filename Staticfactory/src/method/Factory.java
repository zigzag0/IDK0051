package method;

public class Factory {
    public static Cat getInstanceOfCat() {
        return new Cat();
    }

    public static Dog getInstanceOfDog() {
        return new Dog();
    }
}
