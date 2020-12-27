public class linearSearch
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 4, 1, 777 ,8 ,1, 14, 15};

        System.out.print("777 is found in array index: " + linearSearch(array, 777));
    }

    public static int linearSearch(int[] array, int target)
    {   
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == target)
                return i;
        }
        return -1;
    }
}

// Time Complexity -> O(N)
// Space Complexity -> O(1)

