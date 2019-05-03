import java.util.Scanner;
class Task4
{
	public static void main(String args[])
	{
		int m,n,c,d;
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter the number of rows and coulmns of matrix :");
		m=ob.nextInt();
		n=ob.nextInt();
		int first[][]=new int[m][n];
		int second [][]=new int[m][n];
		int sum[][]=new int[m][n];
		System.out.println("Enter the elements of first matrix");
		for(c=0; c<m; c++)
			for(d=0; d<n; d++)
				first [c][d]= ob.nextInt();
			    System.out.println("Enter the elements of second matrix");
				for(c=0; c<m; c++)
			      for(d=0; d<n; d++)
				       second [c][d]= ob.nextInt();
				      for(c=0; c<m; c++)
						  for(d=0; d<n; d++)
							  sum[c][d]=first [c][d]+second [c][d];
						       System.out.println("The sum of matrices  is :");
							   for(c=0; c<m; c++)
							   {
								 for(d=0; d<n; d++)
                                  System.out.println(sum[c][d] +"\t");
                                  System.out.println();							  
							   }
	}
}