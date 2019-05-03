import java.util.Scanner;
class Task3
{
  public static void main(String args[])
  {
	  Scanner ob= new  Scanner(System.in);
	  System.out.println("Enter  your number : ");
	  int num=Integer.parseInt(ob.nextLine());
      int s=0;	 
	 for(int i=1 ; i<=num; i++ )
		 s=s+i;
	 System.out.println("The sum is : "+ s);
  }
}