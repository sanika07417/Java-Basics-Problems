class plusOne{
	public static void main(String args[])
	{
		int digit[]={1,2,3};
		int sum=0;
		
		for(int i=0;i<digit.length;i++)
		{
			sum=(sum*10)+digit[i];
			
		}
		sum=sum+1;
		System.out.println(sum);
		for(int i=digit.length-1;i>0;i--)
		{
			if(sum>0){
				sum=sum%10;
				digit[i]=sum;
				sum=sum/10;
			}
			
		}
		for(int i=0;i<digit.length;i++)
		{
			System.out.print(digit[i]+" ");
		}
		
		
	}
}