import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemo_Methods {

	public static void main(String[] args) {
		ArrayList<String> group1 = new ArrayList<String>();

		group1.add("Dhatrika");
		group1.add("Mahesh");
		group1.add("GangiReddy");
		group1.add("Dhruvika");
		group1.add(0, "Siri");

		ArrayList<String> group2 = new ArrayList<String>();

		group2.add("Siva");
		group2.add("Ganesh");
		group2.add("Alka");
		group2.add("Gaamika");
		group2.add(0, "Siri");

		//group1.remove(0);
		
		Collections.synchronizedList(group1);
		
		//CopyOnWriteArrayList<String> all = new CopyOnWriteArrayList<String>(group1);

		// String[] arr = (String[]) group1.toArray();

		// List<String> list = Arrays.asList(arr);

		 Collections.sort(group1);

		// group1.sort
		// group1.addAll(group2);

		// System.out.println(group1.containsAll(group2));

		// System.out.println(group1.retainAll(group2));

		// System.out.println(al.isEmpty());
		// System.out.println(al.contains("Siri"));
		// System.out.println(al.indexOf("Mahesh"));

		System.out.println("=================");

		Iterator<String> itr = group1.iterator();
		while (itr.hasNext()) {
			group1.remove(1);
			System.out.println(itr.next());
			//itr.remove();
		}
		System.out.println("=================");
	}

}
