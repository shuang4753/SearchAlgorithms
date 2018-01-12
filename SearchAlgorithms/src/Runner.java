//Simon
public class Runner {

	
	public static void main(String[] args)	{
		
		int[] test1= {1,2,3,4,5,6,8,9,10};
		int[] test2= {0,4,5,6,12,15,17,23,29};
		
		System.out.println(linSearch(test1, 3)); //2
		System.out.println(linSearch(test1, 3)); //2
		
		System.out.println(binSearch(test2, 23)); //7
		System.out.println(linSearch(test2, 23)); //7
				
		System.out.println(binSearch(test2, 25)); //-1
		System.out.println(linSearch(test2, 25)); //-1
		
		System.out.println(binSearch(test1, 10)); //9
		System.out.println(linSearch(test1, 10)); //9
		
		System.out.println(binSearch(test1, 1)); //0
	}
	
	public static int linSearch (int[] elements, int query) {

		for (int i=0; i< elements.length; i++)	{
			
			if (elements[i]==query) {
				return i;
			}
			
		}
		return -1;
	}
	
	public static int binSearch(int[] elements, int query)	{
		int L=0;
		int R=elements.length-1;
		
		while (L<=R)	{
			int mid=(L+R)/2;
			
			if (elements[mid]== query)	{
				return mid;
			}
			
			if (elements[mid] != query) {
				
			}
		}
	}

}
