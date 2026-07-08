class Histogram{
	public static void main(String args[])
	{
		int height[]={2,6,5,1,5,3};
		int w=1;
		int greater=0;
		int gi=0;
		int area=0;
		

		for(int i=0;i<height.length;i++)
		{
			if(height[i]>greater){
				greater=height[i];
				gi=i;
			}
		}
		System.out.println(greater+" "+gi);

		int li=gi-1;
		int ri=gi+1;
		int l=height[li];
		int r=height[ri];

		System.out.println(l+" "+r);
		
		if(l>r)
		{
			area=l*(w+(gi-li));
		}
		else{
			area=r*(w+(ri-gi));
		}
		System.out.println("Area : "+area);		
	}
}
		