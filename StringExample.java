import java.util.Scanner;
public class StringExample{
  public static void main(String args[]){
    String str="hello";
    System.out.println("original str:"+str);
    str=str+"world";
    System.out.println("updated str:"+str);
    StringBuffer sb=new StringBuffer("Computer");
    System.out.println("original:"+sb);
    sb.append("Science");
    System.out.println("Modified:"+sb);
   
  }
}




