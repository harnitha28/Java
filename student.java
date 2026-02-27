import java.util.Scanner;
class Student{
  String name;
  int reg;
  int rollno;
  String department;
  Student(String a,int b,int c,string d ){
    name=a;
    age=b;
    rollno=c;
    department=d;
}
  void displaystudentdetail(){
    System.out.println("name:"+name);
    System.out.println("age:"+age);
    System.out.println("register no:"+registerno);
    System.out.println("department:"+department);
}
class marks extends student{
   int mark1,mark2,mark3,tot;
   float avg;
   String res;
   mark(int m1,int m2,int m3){
     mark1=m1;
     mark2=m2;
     mark3=m3;
   }
   public void calculate(){
     tot=mark1+mark2+mark3;
     avg=tot/3;
     if mark1>40&&mark2>40&&markm3>40{
       result="pass";
       else{
         result="fail";}
     }
     System.out.println("name");
     
   }   
   }
}

   
  
  