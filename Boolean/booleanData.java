public class booleanData
{
    public static void main(String[] args)
    {
        boolean answer1 = true;
        boolean answer2 = false;
        
        if(true)
            System.out.println("Hi - 1!");
        if(!answer1 == false)
            System.out.println("Hi - 2!");
        if(answer1 == true)
            System.out.println("Hi - 3!");

        //Using And Operator
        if(answer1 == true && answer2 == true)
            System.out.println("Hi - 4!");
        
        //Using Or Operator
        if(answer1 == true || answer2 == true)
            System.out.println("Hi - 5!");

        System.out.println(answer1);
        System.out.println(!answer1);



        

        


    }
}
