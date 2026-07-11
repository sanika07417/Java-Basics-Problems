class buySell{
	public static void main(String args[])
	{
		int price[]={7,1,5,3,6,4};
		int sm=price[0];
		int ind=0;

		for(int i=0;i<price.length;i++)
		{
			if(price[i]<price[i])
			{
				sm=price[i];
				ind=i;
			}
		}
		System.out.println(sm+" "+ind);
	}
}