class singleNumber{
	public static void main(String args[])
	{
		int nums[]={2,2,1};
	
		int n=0;
       		for(int i=0;i<nums.length;i++){
            		int c=0;
            		for(int j=i+1;j<nums.length-1;j++){
                		if(nums[i]==nums[j]){
                    			c++;
                		}
            		}
		}
            	if(c==0){
                	n=nums[i];
            }
        }