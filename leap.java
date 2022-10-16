//testing branch



/*Write a pragram scan year print year is leap or not leap.*/

import java.util.Scanner;

class leap
{
public static void main(String args[])
{
   int year;
   System.out.println("Enter the year=");
   Scanner x=new Scanner(System.in);
   year=x.nextInt();

  		if(year%4==0 && year%100!=0 || year%400==0)
          {
		System.out.println("Leap year");
          }

        	else
          {
		System.out.println("Not a leap year");
	     }
}
}