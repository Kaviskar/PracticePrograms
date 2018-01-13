import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;



public class HashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<String, List<String>> mymap=new LinkedHashMap<String, List<String>>();
	
		List<String> myList1=new ArrayList<String>();
		
		myList1.add("Car1");
		myList1.add("Car2");
		
       List<String> myList2=new ArrayList<String>();
		
		myList2.add("Bike1");
		myList2.add("Bike2");
		myList2.add("Bike3");
		
       List<String> myList3=new ArrayList<String>();
		
		myList3.add("Apple");
		
		mymap.put("Car", myList1);
		mymap.put("Bike", myList2);
		mymap.put("Fruit", myList3); 
		
		for(Map.Entry m : mymap.entrySet()){
			System.out.println(m.getKey()+"   "+m.getValue());
		}
	}

}
