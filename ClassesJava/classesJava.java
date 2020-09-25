import java.util.*;

public class classesJava
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Create person Object
        Person David = new Person("David", 19, 180);
        Teacher Joel = new Teacher("Joel", "Rutgers", "CS", 20, 200 , 4);
        System.out.println("Hi my name is " + David.name);

        System.out.print("Do you want to change your height from " + David.height+ " to anything else? ");
        int newHeight = scan.nextInt();

        David.height = newHeight;

        System.out.println("Your new height is: " + David.height);
        System.out.println();
        System.out.println("Get Name: " + David.getName());
        System.out.println("Get Age: " + David.getAge());
        System.out.println("Get Height: " + David.getHeight());
        System.out.println();

        System.out.println("David's Teachers name is: " + Joel.getName());
        







    }
}