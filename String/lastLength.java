class lastLength{
	public static void main(String args[])
	{
		String s = "Hello World";
		String arr[]=s.split(" ");
		//int si=arr.length()-1;
		String lastele="";
		for(int i=0;i<arr.length;i++)
		{	if(i==arr.length-1)
				lastele=arr[i];
		}
		System.out.println(lastele.length());
	}
}