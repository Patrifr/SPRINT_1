package Ex2_GenericMethods;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Sebastián","Fernandez",32);
        Person person2 = new Person("Naiara","Garcia", 45);
        Person person3 = new Person("Irene","Cervantes", 25);

        GenericMethods.printArguments(person1,"Apple",63);
        GenericMethods.printArguments("Apple","Strawberry","Banana");
        GenericMethods.printArguments(12,13,14);
        GenericMethods.printArguments(person1,person2,person3);
    }
}
