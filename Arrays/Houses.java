class Houses{
	public static void main(String args[])
	{
		int h=3;
		int c=3;
		int b=20;
		int mj=-1;
		int pre=-1;
		int sum=0;
		
		int ccost[][]={{1,5,2},{2,9,4},{3,1,7}};

		if(h<=c)
		{
			for(int i=0;i<ccost.length;i++)

			{
				int m=Integer.MAX_VALUE;
				
				for(int j=0;j<ccost[i].length;j++)
				{
					if(ccost[i][j]<m&&j!=mj)
					{
						m=ccost[i][j];
						mj=j;
						
					}
				}
				System.out.println(m+" "+mj);
				pre=mj;
				sum+=m;
			}
			if(sum<b)
			{
				System.out.println(sum);
			}
			else{
				System.out.println("-1");
			}
		}
		else{
			System.out.println("-1");
		}
	}
}