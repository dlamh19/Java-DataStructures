import java.util.Scanner;

public class helloWorld 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Ask user for name
        System.out.println("What is your name: ");

        String name = scan.nextLine(); 

        //Print Hello World, Hello name, and Name Length
        System.out.println("Hello World");
        System.out.println("Hello " + name);
        System.out.println("Length of your name is: " + name.length());

        scan.close();
    }
}
