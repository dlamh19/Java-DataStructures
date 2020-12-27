public class binarySearch 
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 4, 10, 11, 60, 90, 100, 204, 777, 90000, 90192, 912033, 912044};

        System.out.print("777 is found in array index: " + binSearch(array, 0, array.length - 1, 777));
    }

    public static int binSearch(int[] array, int lo, int hi, int target)
    {
        if(lo > hi)
            return -1;

        // find middle of the array
        int middle = (hi + lo) / 2;

        if(array[middle] == target)
            return middle;
        else if(array[middle] < target)
            return binSearch(array, middle + 1, hi, target);
        else
            return binSearch(array, lo, middle - 1, target);
    }
}
