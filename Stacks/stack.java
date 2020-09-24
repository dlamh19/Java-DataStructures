import java.util.Stack;

public class stack 
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        //Adding to the Stack
        stack.push(0);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        //Peek the Top
        System.out.println("The Top of the Stack is: " + stack.peek());

        //Check stack if its empty
        System.out.println("Is the stack empty? " + stack.isEmpty());
        
        //Iterate through stack and print
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        System.out.println();    
    }
}
