class StringnNum{
	public static void main(String args[])
	{
		String s="This is alpha 5051 and 9475";
		//char arr[]=s.toCharArray();
		String s1=" ";
		String s2=" ";
		
		for(int i=0;i<s.length();i++)
		{	
			if(s.charAt(i)>='0'&&s.charAt(i)<='9'||s.charAt(i)==' ')
			{
				s1+=s.charAt(i);
				//System.out.println(s1);
				if(s.charAt(i)==' ')
				{
					//System.out.println(s1);

					
			
				}
				
				//s2+=s.charAt(i);
				
			}
			/*else{
				System.out.println(s.charAt(i));
			}*/
		}
		System.out.println(s1.trim());
		
		String s3[]=s1.split(" ");
		
		for(int i=0;i<s3.length-1;i++)
		{
			System.out.println(s3[i]);
		}
		//System.out.println(s2+" "+s3);
			
		
	}
}  