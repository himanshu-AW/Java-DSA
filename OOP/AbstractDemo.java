/**
 * abstract
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk(); 

        Chicken c = new Chicken();
        c.eat();
        c.walk();   
    }
}

abstract class Animal {
    String color;

    // Animal(){
    //     color="Brown";
    //     // System.out.println("Animal constructor called");
    // }
    void eat(){
        System.out.println("Animal eats.");
    }
    abstract void walk();
}

class Horse extends Animal{
    // Horse(){
    //     System.out.println("Hose constructor called.");
    // }
    void walk(){
        System.out.println("Horse walked on 4 legs.");
    }
}

class Chicken extends Animal{
    // Chicken(){
    //     System.out.println("Chicken constructor called.");
    // }
    void walk(){
        System.out.println("Chicken walked on 2 legs.");
    }
}