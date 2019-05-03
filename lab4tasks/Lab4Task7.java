class Lab4Task7{
	public static void main(String args[]){
		int array[]={1,4,3,6,3,8,2,7,5,9,12,10};
		System.out.print("Before Sorting:");
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.print("\nAfter Sorting: ");
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
}