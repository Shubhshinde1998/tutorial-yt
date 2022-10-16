//testing branch


/*Write a program scan age and print person is major minor or senior citizen*/

import java.util.Scanner;

class age
{
 public static void main(String args[])
{
int age;
System.out.println("Enter age=");
Scanner x=new Scanner(System.in);
age=x.nextInt();


if(age<18)
{
System.out.println("Person is Minor");
}

else if(age>18 && age<50)
{
System.out.println("Person is Major");
}
else
{
System.out.println("Person is Senior Citizen");
}


}


}