abstract class List{
	public abstract void sort();
	public abstract void search();
	public abstract  void remove();
	public void display()
	{
		System.out.println(" method implemented in asbtract class");
	}
}
class ArrayList extends List{
	public void sort()
	{
		System.out.println("Sort method from arraylist");
	}
	public void search()
	{
		System.out.println("Search method from arraylist");
	}
	public void remove()
	{
		System.out.println("remove method from arraylist");
	}
}
class LinkedList extends List{
	public void sort()
	{
		System.out.println("Sort method from LinkedList");
	}
	public void search()
	{
		System.out.println("Search method from LinkedList");
	}
	public void remove()
	{
		System.out.println("remove method from LinkedList");
	}
}
public class List_ArrayList_LinkedList_Driver{
	public static void main(String [] args)
	{
		List l1 = new ArrayList();
		l1.sort();
		l1.search();
		l1.remove();
		
		List l2 = new LinkedList();
		l2.sort();
		l2.search();
		l2.remove();
	}
}

