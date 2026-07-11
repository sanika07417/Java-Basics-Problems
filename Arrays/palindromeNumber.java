class palindromeNumber{
	public static void main(String args[])
	{
		int x=121;
		String str=String.valueOf(x);
		String s1=str;
		String s2="";
		int c=1;
		System.out.println(str.length());
		
		for(int i=str.length()-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i;j<=i;j++)
			{
				if(str.charAt(i)==s2.charAt(j))
				{
					c++;
				}
			}
			
		}
		if(c==str.length()){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		System.out.println(s1+" "+s2+" "+c);	
		
		
	}
}