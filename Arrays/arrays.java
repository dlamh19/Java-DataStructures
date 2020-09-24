import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class arrays
{
    public static void main(String[] args)
    {
        //Array Syntax
        int[] array = new int[5];           //1d array size of 5
        int[][] array2d = new int[5][5];       //2d array size of 5x5   
        //int[] array2 = {1, 2, 3, 4, 5};
        //int[][] array3 = {{1,2,3,4,5}, {6,7,8,9,10}};
        ArrayList<Integer> list = new ArrayList<Integer>();
        List<String> names = new ArrayList<>();
        
        //Adding to String list
        names.add("David");
        names.add("Dave");
        names.add("Jack");
        names.add("Joel");

        Collections.sort(names);
        for(String name : names)
            System.out.print(name + " ");
        System.out.println();
        System.out.println();


        
        //Adding to the list
        list.add(5);
        list.add(6);
        list.set(1,10);
        list.add(7);
        list.add(20);
        list.remove(3);
        list.add(8);
        
        //print the arraylist
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
        System.out.println();

        //fill 1d array
        for(int i = 0; i < array.length; i++)
        {
            array[i] = 1;
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println();



        //fill 2d array
        for(int row = 0; row < array2d.length; row++)
        {
            for(int col = 0; col < array2d[row].length; col++)
            {
                array2d[row][col] = 2;
                System.out.print(array2d[row][col]);
                
            }
            System.out.println();
        }






    }
}
