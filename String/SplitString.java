class SplitString{
	public static void main(String args[])
	{
		String s="Sanika ,shreyash ,shruti";
		String arr[]=s.split(",");
		
		for(String name:arr)
		{
			System.out.println(name);
		}
	}
}