import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class stackList 
{
    ArrayList<Integer> list = new ArrayList<Integer>();

    public stackList()
    {

    }
    public stackList(int data)
    {
        list.add(data);
    }

    public int peek()
    {
        return list.get(list.size()-1);
    }

    public void pop()
    {
        list.remove(list.size()-1);
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public void push(int data)
    {
        list.add(data);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Create Stack Object
        stackList stack = new stackList();

        char a;

        do
        {
            System.out.print("Enter numbers to insert into stack: ");
            int data = scan.nextInt();
            stack.push(data);

            System.out.print("Continue(Y/N) -> ");
            a = scan.next().charAt(0);

        }while(a == 'Y' || a == 'y');


        //Top of Stack
        System.out.println("Top of The Stack is: " + stack.peek());
        System.out.println("The stack is empty: " + stack.isEmpty());

        //Iterate through stack
        System.out.print("The whole Stack: ");

        while(stack.isEmpty() != true)
        {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println();


        scan.close();
    }


}
