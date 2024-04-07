import java.util.Stack;

/**
 * LearnStack
 */
public class LearnStack {

    public static void main(String[] args) {
        
        Stack<String> animal =  new Stack<>();
        
        animal.push("Lion");
        animal.push("Rook");
        animal.push("Dog");
        animal.push("Horse");
        animal.push("Cat");

        System.out.println(animal.toString());
        System.out.println("Peek elem: "+animal.peek());
        
        System.out.println(animal.toString());
        System.out.println("Poped elem: "+animal.pop());
        System.out.println("Peek elem: "+animal.peek());

    }
}