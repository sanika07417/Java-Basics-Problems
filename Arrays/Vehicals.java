class Vehicals{
	public static void main(String args[])
	{
		int v=200;
		int w=540;
		
		
		if(v<w && w%2==0)
		{
			int tw=(4*v-w)/2;
			int fw=v-tw;
			System.out.println("TW : "+tw);
			System.out.println("FW : "+fw);
		}
		else{
			System.out.println("INVALID INPUT");
		}
		
	}
}
