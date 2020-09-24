public class forLoops 
{
    public static void main(String[] args)
    {
        //Print Hi 5 Times
        for(int i = 0; i < 6; i++)
            System.out.print("5 ");
        System.out.println();

        String name = "David";

        //Print the String David with spaces
        for(int i = 0; i < name.length(); i++)
            System.out.print(name.charAt(i) + " ");
        System.out.println();

        //Break vs Continue
        for(int i = 0; i < name.length(); i++)
        {

            if(name.charAt(i) == 'a')
                break;
            else
                System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        for(int i = 0; i < name.length(); i++)
        {
            if(name.charAt(i) == 'a')
                continue;
            else
                System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }  
}
