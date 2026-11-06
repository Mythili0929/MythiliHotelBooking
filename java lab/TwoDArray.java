class TwoDArray
{
    public static void main(String[] args) {
        int[][] marks={{90,86,95},{89,96,92}};
        for(int i=0;i<=marks.length;i++)
        {
            for(int j=0;j<=marks.length;j++)
            {
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}