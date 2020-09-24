import java.util.Scanner;

public class whileLoops 
{
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);

        int num1 = 5;

        // loop through num1
        while(num1 < 10)
        {
            num1++;
            System.out.print(num1);
        }
        System.out.println();

        System.out.print("Enter number of rows for triangle: ");
        int rows = object.nextInt();
        int rows2 = rows;
        int zero = 0;

        //print triangle upside down
        while(zero < rows)
        {
            int star = rows;

            while(zero < star)
            {
                System.out.print("*");
                star--;
            }
            System.out.println();
            rows--;
        }

        System.out.println();
        
        int temp1 = zero + 1;

        //print triangle upwards
        while(zero < rows2)
        {
            while(zero < temp1)
            {
                System.out.print("*");
                zero++;
            }
            System.out.println();
            temp1++;
            rows2--;
            zero = 0;
        }
        object.close();
    }
}
