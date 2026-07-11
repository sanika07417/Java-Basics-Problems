
//import Java.lang.*;
class sentence{
	public static void main(String args[])
	{
		String s="ThisIsTable";
		String s1=" ";
		

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				s1=s1+" ";
				
			}
			s1=s1+s.charAt(i);
			
		}
		String n=s1.trim();
		System.out.println(n.toLowerCase());
	}
}