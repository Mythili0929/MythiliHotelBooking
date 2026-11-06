import java.util.Arrays;
class SortArray
{
    public static void main(String[] args) {
        int[] marks={92,78,89};
        System.out.println("marks2 before sorting");
        System.out.println(marks[1]);
        Arrays.sort(marks);
        System.out.println("marks after sorting");
        System.out.println(marks[1]);
    }
}