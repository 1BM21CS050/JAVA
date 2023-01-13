import java.util.Scanner;
class student
{  
    student(){}
    String name;
    String usn;
    double result=0;

    int credits[];
    int marks[];
    int total=0;


    void accept()
   {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number of subjects ");
    n=s.nextInt();

   System.out.println("Enter your Name ");
   name=s.nextLine();
   System.out.println("Enter USN ");
   usn=s.nextLine();
   System.out.println("Enter credits and marks of each subject respectively ");
   for(int i=0;i<n;i++)
    {
      credits[i]=s.nextInt();
      marks[i]=s.nextInt();
     }
   } 
   void calculate()
   {
     for(int i=0;i<n;i++)
     {
       if(marks[i]>=90 && marks[i]<=100)
          result+=credits[i]*10;
      else if(marks[i]>=80 && marks[i]<90) 
          result+=credits[i]*9;
      else if(marks[i]>=70 && marks[i]<80)
          result+=credits[i]*8;
      else if(marks[i]>=60 && marks[i]<70)
          result+=credits[i]*7; 
      else if(marks[i]>=50 && marks[i]<60)
           result+=credits[i]*6;
      else if(marks[i]>=40 && marks[i]<50)
          result+=credits[i]*5;
      else 
         result+=0*credits[i];
     }
      for(int i=0;i<n;i++)
        total+=credits[i];
      result=result/total;
   }
   void display()
   {
      System.out.println("Name:"+name+"  USN:"+usn);
      System.out.println("credits  Marks");
      for(int i=0;i<n;i++)
     System.out.println(credits[i]+"         "+marks[i]);
     System.out.println("Total credits="+total);
     System.out.println("SGPA="+result);
   }
}


class demo
{
   public static void main(String[] args)

  {
    student s1=new student();
    s1.accept();
   s1.calculate();
   s1.display();
  }
}