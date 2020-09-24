import java.util.Scanner;

public class controlFlow 
{
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = Integer.parseInt(object.nextLine());

        System.out.print("What is your name? ");
        String name = object.nextLine();
        name.toLowerCase();

        System.out.print("What is your favorite food? ");
        String food = object.nextLine();
        food.toLowerCase();

        // If statements to compare the strings and age number
        if(age == 19 && name.compareTo("david") == 0 && food.compareTo("eggs") == 0)
            System.out.print("You are David");
        else if(age < 20 || food.equals("eggs") == true)
            System.out.print("You are similar to David");
        System.out.println();
        object.close();
    }  
}
