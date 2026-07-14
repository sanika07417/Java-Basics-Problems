class majorityElement{
	public static void main(String args[])
	{
		int nums[]={2,2,1,1,1,2,2};
		int gc=0;
		int ele=0;
		
		for(int i=0;i<nums.length;i++)
		{
			int c=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					c++;
				}
			}
			if(c>gc)
			{
				gc=c;
				ele=nums[i];
			}
		}
		System.out.println(ele);
	}
}
			
	