class Marks
{
    public static void main(String[] args) {
        String name=new String("Lilly");
        int[] marks=new int[3];
        marks[0]=96;
        marks[1]=92;
        marks[2]=98;
        System.out.println("name is "+name);
        for(int i=0;i<3;i++){
         System.out.println("marks"+(i+1)+"="+marks[i]);  
        }
    }
}