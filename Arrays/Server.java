class Server{
	public static void main(String args[]){
	
		int health[]={35,35,35,35};
		int s=0;
		int c=0;

		for(int i=2;i<health.length;i++)
		{
			if(health[i]>s)
			{
				s=health[i];
			}
			if(health[i]==health[i-1])
			{
				c++;
			}
		}
		
		System.out.println(c);
		
			for(int i=0;i<health.length;i++)
			{
				for(int j=i+1;j<health.length;j++)
				{
					if(i!=0){
					health[i]=health[j]+1;
					}	
				}
				System.out.println();
			}
			
			for(int i=0;i<health.length;i++)
			{

				System.out.println(health[i]);
				
			}
			//health[j]=health[j]+1;
						//health[j-1]=health[j]+1;
						
						//System.out.println("i+1="+health[j+1]);
						//System.out.println("i-1="+health[j-1]);
						//System.out.println("i="+health[j]);
		
	}
}
					