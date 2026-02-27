//OVERRIDING//
import java.util.Scanner;
class animal{
  void sound(){
    System.out.println("animal makes sound");
  }
}
class Dog extends animal{
  void sound(){
    System.out.println("Dog barks");
  }
}
public class test{
  public static void main(String args[]){
    animal a= new Dog();
    a.sound();
    animal b=new animal();
    b.sound();
  }
}
  