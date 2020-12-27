public class insertionSort 
{
    public static void main(String[] args)
    {
        int[] array = {100, 2021, 4, 1, 777 ,8 , -1, 1234, -15};

        System.out.println("Unsorted Array: ");
        printArray(array);

        sort(array);

        System.out.println("Sorted Array: ");
        printArray(array);
    }
    
    public static void sort(int[] array)
    {
        // Take a starting key, compare each predecessor to key

        for(int index = 1; index < array.length; index++)
        {
            int key = array[index];
            int prev = index - 1;

            while(prev >= 0 && array[prev] > key)
            {
                array[prev + 1] = array[prev];
                prev = prev - 1;
            }
            array[prev + 1] = key;
        }
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
