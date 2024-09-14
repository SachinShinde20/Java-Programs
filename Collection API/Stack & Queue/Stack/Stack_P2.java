import java.util.Stack;

public class Stack_P2 {
    public static void main(String[] args) {

        Stack<Details> myStack = new Stack<>();
        myStack.push(new Details(101, "Raj"));
        myStack.push(new Details(102, "Kaali"));
        myStack.push(new Details(103, "Shyam"));
        myStack.push(new Details(104, "Arvind"));
        myStack.push(new Details(105, "Viraj"));

        // Print Stack
        System.out.println("Stack: " + myStack);

        System.out.println("Is Empty? :" + myStack.empty());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());

        System.out.println("\nStack: " + myStack);
        for (Details s : myStack) {
            System.out.println(s + ", " + myStack.search(s));
        }
        // Print -1 If value is not present
        System.out.println("Is Kiran Present in Stack: " + myStack.search(new Details(104, "Kiran")));

    }
}