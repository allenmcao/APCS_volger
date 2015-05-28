import java.util.List;
import java.util.ArrayList;

public class PermutationGenerator
{
	private List<Integer> perm1;
	private int size;
	/**
	 Constructs a permutation-generator and initializes the two needed lists.
	 */
	public PermutationGenerator(int a)
	{
		perm1 = new ArrayList<Integer>();
		size = a;
		nextPermutation();
	}

	/**
	 Calculates the next permutation and stores it in the list perm1.
	 */
	public void nextPermutation()
	{
		perm1.clear();
		List<Integer> perm2= new ArrayList<Integer>();
		for(int k = 1;k<size;k++)
		{
			perm2.add(k);
		}
		while(!perm2.isEmpty())
		{
			perm1.add(perm2.remove((int)(Math.random()*perm2.size())));
		}
	}

	/**
	 *Returns the list containing the permutation.
	 *@return returns the list containing the permutation
	 */
	public List getList()
	{
		return perm1;
	}

	public Integer[] getArray()
	{
		Integer[] a = new Integer[perm1.size()];
		for(int k = 0; k<perm1.size(); k++)
		{
			a[k]=perm1.get(k);
		}
		return a;
	}

	/**
	 *Returns the size of the permutation list.
	 *@return returns the size of the permutation list
	 */
	public int getSize()
	{
		return size;
	}

	/**
      Returns the permutation as an ordered, readable list.
      @return returns the numbers in the permutation in order.
   */
	public String toString()
	{
		String s = "";
		for(int k=0;k<=perm1.size()-2;k++)
			s+=perm1.get(k) + ", ";
		s+= perm1.get(perm1.size()-1);
		return s;
	}
}