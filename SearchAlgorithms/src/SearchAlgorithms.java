
public class SearchAlgorithms {
	
	
	public int linSearch (int[] elements, int query) {

		for (int i=0; i< elements.length; i++)	{
			
			if (elements[i]==query) {
				return i;
			}
			
		}
		return -1;
	}
}
