class singleNumber{
	public static void main(String args[])
	{
		int nums[]={4,2,1,2,1};
	
		int n=0;
       		for(int i=0;i<nums.length;i++){
            		int c=0;
            		for(int j=0;j<nums.length;j++){
				System.out.println(nums[i]+" = "+nums[j]);
                		if(nums[i]==nums[j]&&i!=j){
					
                    			c++;
					System.out.println(nums[i]+" = "+nums[j]+"->"+c);
                		}
				
            		}
			if(c==0){
                			n=nums[i];
            			}
			
		}
            	
		System.out.println(n);
        }
	
}