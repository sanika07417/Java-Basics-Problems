class buySell{
	public static void main(String args[])
	{
		int price[]={7,6,4,3,1};
		int sm=price[0];
		int ind=0;
		int max=0;
		int profit=0;

		for(int i=0;i<price.length-1;i++)
		{
			if(sm>price[i+1])
			{
				sm=price[i+1];
				ind=i;
			}
		}
		if(ind==price.length){
			profit=0;
			
		}
		else{
			for(int i=ind+1;i<price.length;i++)
			{
				if(profit<(price[i]-sm))
				{
					profit=price[i]-sm;
				}
			}
		}

		System.out.println(profit);
	}
}