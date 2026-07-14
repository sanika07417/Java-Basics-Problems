class starHash{
	public static void main(String args[])
	{
		String s="#***#";
		int sc=0;
		int hc=0;

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
			{
				sc++;
			}
			else{
				hc++;
			}
		}
			
		System.out.println(sc+" "+hc);
		if(sc>hc)
		{
			System.out.println("1");
			int st=sc-hc;
			System.out.println("Increases "+st+" *");
		}
		else if(sc<hc)
		{
			System.out.println("-1");
			int h=sc-hc;
			System.out.println("Increases "+h+" #");
		}
		else{
			System.out.println("0");
		}
	}
}