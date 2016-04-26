import java.util.*;

public class CollectionExperiment 
{
	public static void main(String[] args)
	{
		List<String> liste = new ArrayList<String>();
		experimentiereMit (liste);
		Stack<String> stack = new Stack<String>();
		experimentiereMit (stack);
		Set<String> set = new HashSet<String>();
		experimentiereMit (set);
		
		
		
	}
	
	private static void schreibeCollectionAufConsole(Collection<String> collect)
	{
		for(String s: collect)
		{
			System.out.println(s);
		}
		
	}
	
	private static void experimentiereMit (Collection<String> coll)
	{
		coll.add("hans");
		coll.add("franz");
		
		if(coll.contains("hans"))
		{
			System.out.println("hans ist drin");
		}
		
		coll.clear();
		
		int g = coll.size();
		System.out.println(g);
		
		coll.add("max");
		coll.add("frax");

		schreibeCollectionAufConsole(coll);
		Collection<String> co2 = new HashSet<String>();
		co2.add("max");
		co2.add("abc");
		
		coll.retainAll(co2);
		schreibeCollectionAufConsole(coll);
		
	}
}
