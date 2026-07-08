import java.util.Scanner;
class asc{
	public static void main(String args[]){
		int a[]={20,15,26,2,-98,-6};
		int b[]={20,15,26,2,98,6};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				
				if(b[j]==a[i]){
					System.out.println(j+1);
				}
				
			}
		}

				
	}
	 
}