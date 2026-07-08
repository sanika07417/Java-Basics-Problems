class stringEqual{
	public static void main(String args[])
	{
		String s1="abc";
		String s2="xxz";
		int s1c=0;
		int s2c=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)==s1.charAt(i+1))
			{
				 s1c++;
				
			}
		}

		for(int i=0;i<s2.length()-1;i++)
		{
			if(s2.charAt(i)==s2.charAt(i+1))
			{
				 s2c++;
			}
		}

		if(s1c==s2c)
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}