import java.util.*;
class basicCF{
	public static void main(String args[])
	{
		ArrayList<Integer> nums=new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(2);
		nums.add(4);
		
		//System.out.println(nums);
		//System.out.println(nums.get(1));
		/*nums.set(2,4);
		System.out.println(nums);
		nums.remove(2);
		System.out.println(nums);
		System.out.println(nums.size());*/

		/*for(Integer x:nums)
		{
			if(x==2)
			{
				nums.set(1,3);
			}
		}*/

		System.out.println(nums);

		Iterator<Integer> it = nums.iterator();
		while (it.hasNext()) {
    			System.out.println(it.next());
		}

		Set<Integer> s=new Set<>();
		s.addAll(nums);
		System.out.println(s);
	}
}