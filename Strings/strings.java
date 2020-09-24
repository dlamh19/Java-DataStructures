public class strings 
{
    public static void main(String[] args)
    {
        String name = "David ";
        String end = "Says Hi!";
        String sentence = "How is Everyones Day Today?";
        String newSentence = sentence.replaceAll("\s", "");


        //Print name and length
        System.out.println("Name: " + name + "\nName Length: "+ name.length());

        //Print name in all Uppercase and LowerCase
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //String concatonation
        System.out.println(name + end);
        System.out.print(name.concat(end));

        //Concatentation with Ints
        int a = 20;
        int b = 40;
        String x = "20";
        String y = "40";
        String z = x + b;

        System.out.println(a + b);      //Prints an Int
        System.out.println(x + y);      //PRints a String
        System.out.println(x + b);      //Prints a String, be careful with this
        System.out.println(z);          //Prints the concatenated string

        //Iterate through string and print with charAt
        for(int i = 0; i < name.length(); i++)
            System.out.print(name.charAt(i));
        System.out.println();

        System.out.println("The name contains David: "+ name.contains("David"));
        System.out.println("The name ends with D: " + name.endsWith("David "));
        System.out.println("Name and End Are Equal: " + name.equals(end));
        System.out.println("The indexOf A in David is: " + name.indexOf("a"));
        System.out.println("Printing Int A as A string: " + Integer.toString(a));

        System.out.println();
        System.out.println(sentence);
        System.out.println(newSentence);









    }
}
