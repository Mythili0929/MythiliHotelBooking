import java.util.Arrays;
public class BinarySearch
{
    public static int binarySearch(int[] arr,int left,int right,int key)
    { 
        if(right>=left)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==key)
               return mid;
            if(arr[mid]>key)
               return binarySearch(arr,left,mid-1,key);
            return binarySearch(arr,mid+1,right,key);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr={2,27,48,32,12,7,29,9};
        Arrays.sort(arr);
        int key=29;
        int n=arr.length;
        int pos=binarySearch(arr,0,n-1,key);
        if(pos==-1)
        {
            System.out.println("element not found in the list");
        }
        else
        {
            System.out.println("Element "+key+"found at index"+pos);
        }
    }
}