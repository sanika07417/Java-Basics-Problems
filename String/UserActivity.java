class UserActivity {
    public static void main(String args[]) {

        String s = "LLLVVPP";
        char arr[] = s.toCharArray();
	int c = 0; 

        for(int i = 0; i < arr.length-1; i++) {
	
		for(int j=i+1;j<arr.length-1;j++)
		{
		
                	if(arr[i] == arr[j]) {
                    		c++;
		
                	}
			else{
				if(c>0){
				System.out.println(arr[i]+" "+(c+1));
			}
			c=0;
		}

         }
	}	

		
        
    }
}