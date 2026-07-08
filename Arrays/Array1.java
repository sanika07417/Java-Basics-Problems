class Array1{
	public static void main(String args[]){
		int a[]={1,2,3};
		int b[]={1,6,3};
	
		int c[]=new int[3];

		for(int i=0;i<a.length;i++){
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
			
		}
	}
}
		
