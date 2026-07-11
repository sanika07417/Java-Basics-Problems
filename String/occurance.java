class occurance{
	public static void main(String args[])
	{
		String haystack = "sadbutsad";
		String needle = "sad";
		int ind=0;
       		for(int i=0;i<haystack.length()-1;i++){
            		int c=1;
            		for(int j=0;j<needle.length()-1;j++){
                		if(needle.charAt(i)==haystack.charAt(j)){
                    			c++;
                    			ind=j;
					System.out.println(ind);
                		}
            		}
            		/*if(c==needle.length()){
                		System.out.println(ind);
            		}
           		else{
                		System.out.println("-1");
            		}*/
        	}

	}
}
