//testing branch

/* Write a program scan two numbers print largest number*/



import java.util.Scanner;

class First
{
   public static void main(String args[])
  {
    int a,b;
    Scanner x=new Scanner(System.in);
    a=x.nextInt();
    b=x.nextInt();

    if(a>b)
     System.out.println("a is greater than b");
     
    else
    System.out.println("b is greater than a");
 
  }
}