class Digit{
	public static void main(String args[]){
		int arr[]={1,2,4,5};
		int r=0;
		int c=0;
		int s=0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0){
				c++;
			}
			s=s+arr[i];
		}
		
		for(int i=0;i<4;i++){
			for(int j=i+1;j<4;j++){
				if(arr[i]==arr[j]){
					r++;
				}
			}
		}

		if((c==2)&&(s%3==0)&&(r==0)){
			System.out.println("Open");
		}
		else{
			System.out.println("Locked");
		}
					
	}
}
							