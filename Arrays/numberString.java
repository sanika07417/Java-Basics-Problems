class numberString{
	public static void main(String args[])
	{
		String n="1321";
		
		String r="";
		
		for(int i=0;i<n.length();i++)
		{
			int c=0;
			for(int j=i+1;j<n.length();j++)
			{
				if(n.charAt(i)==n.charAt(j))
				{
					c++;
					
				}
			}
			if(c>0)
			{
				continue;

			}
			r=r+n.charAt(i);
		}
		System.out.println(r);
	}
}