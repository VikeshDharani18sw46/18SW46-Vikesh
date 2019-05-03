
class Task5
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,5,7,8,9,10,11,12,13,14,15};
		int huge;
		huge = arr[0];
		for ( int x=0 ; x < 15 ; x++)
		{
			if(huge < arr[x])
			{
				huge = arr[x];
			}
		}
		System.out.println("Largest Value : " + huge);
	}
}

