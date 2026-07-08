class Frequency{
	public static void main(String args[])
	{
		String s="Sanika";
		String c="";
		String cc="";
		int count=1;

		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c+=s.charAt(i);
					count++;
				}
				
			}
			
			count=0;	
		}

		System.out.println(c);
		System.out.println(cc);
	}
}