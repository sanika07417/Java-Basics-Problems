class server1{
	/*public static void main(String args[])
	{
		int arr[]={1,2,1,3};
		
		int e=arr[0];
		int ind=0;
		int max=0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++){
			if(j!=ind){
				arr[j]++;
			}
			else{
				e=arr[j];
				ind=j;
			}
			if(arr[j]!=e&&j>0)
			{
				
			}
			else{
				max=arr[j];
			}
			}
			
		}
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
			System.out.println(max);
		}
	}*/




    static int getMaxHealth(int[] health) {

        int n = health.length;
        int ans = 0;

        for (int start = 0; start < n; start++) {

            boolean[] visited = new boolean[n];

            int add = 0;

            int current = start;

            int x = health[current];

           while (true) {

    visited[current] = true;

    int nextValue = x + 1;

    int next = -1;

    for (int i = 0; i < n; i++) {

        if (!visited[i] && health[i] + add + 1 == nextValue) {
            next = i;
            break;
        }
    }

    if (next == -1) {
        break;          // x is the answer
    }

    add++;
    current = next;
    x = nextValue;
}

            ans = Math.max(ans, x);
        }

        return ans;
    }

    public static void main(String[] args) {

        int health[] = {1,2,1,3};

        System.out.println(getMaxHealth(health));
    }

}
			


			