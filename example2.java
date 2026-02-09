import java.util.Scanner;
public class example2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    String depart=sc.next();
    int rollno=sc.nextInt();
    int mark1=sc.nextInt();
    int mark2=sc.nextInt();
    int mark3=sc.nextInt();
    int total;
    total=mark1+mark2+mark3;
    System.out.println("Welcome to Java,"+name); 
    System.out.println("Department:"+depart);
    System.out.println("roll no:"+rollno);
    System.out.println("Mark1:"+mark1);  
    System.out.println("Mark2:"+mark2); 
    System.out.println("Mark3:"+mark3);
    System.out.println("Total:"+total);
    }
}
