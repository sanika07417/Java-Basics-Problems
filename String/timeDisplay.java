class timeDisplay{
	public static void main(String args[])
	{
		String t="7:05:45PM";
		//String st=t.subString(t.length()-2);
		String[] time=t.split(":");
		String min=time[1];
		String sec=time[2];
		String newTime="";
		String s=time[0];
		int n=Integer.parseInt(s);
		
		
		char ch=t.charAt(t.length()-2);
		System.out.println(ch);
		
		//System.out.println(n+12);
		
		if(ch=='P')
		{
			int h=n+12;
			String s1=String.valueOf(h);
			time[0]=s1;
			
			System.out.print(s1+":"+min+":"+sec);
			
		}
		else{
			System.out.print(t);
		}
		
		//System.out.println(s);
	}
}