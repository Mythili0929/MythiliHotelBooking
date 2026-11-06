import java.util.Arrays;
public class BubbleSort
{
    public static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
    }
    public static void main(String[] args)
    {
     int[] list={6,30,45,83,99,76};
     System.out.println("Original array is "+Arrays.toString(list));
     bubbleSort(list);
     System.out.println("Sorted array using bubble sort is "+Arrays.toString(list));   
    }
}