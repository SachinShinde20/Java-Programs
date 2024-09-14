import java.util.Stack;

public class Stack_P1 {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack<>();
        myStack.push("Luffy");
        myStack.push("Zoro");
        myStack.push("Sanji");
        myStack.push("Jimbei");

        // Print Stack
        System.out.println("Stack: " + myStack);

        System.out.println("Is Empty? :" + myStack.empty());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());

        System.out.println("\nStack: " + myStack);
        for (String s : myStack) {
            System.out.println(s + ", " + myStack.search(s));
        }
        System.out.println("Is Kaido Present in Stack: " + myStack.search("Kaido"));

    }
}