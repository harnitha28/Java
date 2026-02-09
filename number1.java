import java.util.Scanner;
class number1{
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
     int n=sc.nextInt();
      for (int n = 0; n<101; n++){
        if (n%2==0){
      System.out.println("Even no",n++);
    }
  }
}
}