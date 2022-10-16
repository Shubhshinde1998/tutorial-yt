import java.util.Scanner;

class discount
{
public static void main(String args[])
{
  float amt,netamt,discount,Tamt;
  int qty;
  System.out.println("Enter the amount");
  System.out.println("Enter the quantity");
  Scanner x=new Scanner(System.in);
  amt=x.nextFloat();
  qty=x.nextInt();

   Tamt=amt*qty;
  
 
   if(Tamt>5000)
    {
       discount=(Tamt)*(0.1);
       netamt=Tamt-discount;
    System.out.println("Net amount payable customer="+netamt);
  }

  else
    {
       discount=(Tamt)*(0.05);
       netamt=Tamt-discount;
    System.out.println("Net amount payable customer="+netamt);
    }



}

}