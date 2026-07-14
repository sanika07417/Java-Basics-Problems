class validPalindrome{
	public static void main(String args[])
	{
		String s="San,i:ka";
		String s1="";
		s=s.toLowerCase();
		System.out.println(s);
		
		for(int i=s.length()-1;i>=0;i--) {
            		if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
               			 s1+=s.charAt(i);
            		}
        	}
		System.out.println(s1);
	}
}