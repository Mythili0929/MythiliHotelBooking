public class StringBufferDemo
{
    public static void main(String[] args)
    {
     String str="G Pullaiah College of Engineering and Technology";
     StringBuffer s=new StringBuffer(str);
     s.append("Kurnool");
     System.out.println(s);
     s.insert(1,"Java");
     System.out.println(s);
     s.replace(1,4,"OOPs");
     System.out.println(s);
     System.out.println("Before deleting: "+s);
     s.delete(5,10);
     System.out.println("after deleting index from 5 to 10 is : "+s);
     s.deleteCharAt(13);
     System.out.println("After deleting character at index 13 :"+s);
     s.reverse();
     System.out.println("reverse is "+s);
     System.out.println("Capacity of buffer is "+s.capacity());
     System.out.println("Length of string is "+s.length());
    }
}