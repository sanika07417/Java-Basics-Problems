import java.util.Scanner;
class Airport{
	public static void main(String args[]){
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the no of elements : ");
		//int n=sc.nextInt();
		//int arr[]=new int[n];
		int arr[]={1,0,2,0,1,0,2};
		int n=7;
		int g=0;
		int s=0;
		int m=0;

		/*for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}*/

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		 
		for(int i=0;i<n;i++)
		{
			
				if(arr[i]>g)
				{
					g=arr[i];
				}
				else if(arr[i]<s)
				{

					s=arr[i];
				}
				
		}
		for{int i=0;i<n;i++)
		{
			if(arr[i]<g&&arr[i]>s){
					m=arr[i];
					System.out.println(" new medium"+m);
				}
		}

		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(m+" Medium risk");
		System.out.println(g+" high risk");
		System.out.println(s+" Low risk");
		
	}
}