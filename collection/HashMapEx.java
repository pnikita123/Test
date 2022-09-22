package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("Br","Brazil");
		map.put("In","India");
		map.put("De","Germany");
		System.out.println(" implementing hasMap :");
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			System.out.println("Country code :"+entry.getKey()+" Country Name :"+entry.getValue());
		}
	   
		System.out.println("\n"+map.get("In"));
		
		// TreeMap
        TreeMap<String,String> treeMap=new TreeMap<String,String>();
		
        treeMap.put("B10","Sandwitch");
        treeMap.put("D5","Pav-Bhaji");
        treeMap.put("L15","Coffee");
        treeMap.put("B19","Tea");
        System.out.println("\nimplementing TreeMap :");
        for(Map.Entry<String, String> entry : treeMap.entrySet())
		{
			System.out.println("Menu code :"+entry.getKey()+" Menu Name :"+entry.getValue());
		}
        
        
       //HashTable
        Hashtable<String,String> hashtable=new Hashtable<String,String>();
        hashtable.put("B10","Sandwitch");
        hashtable.put("D5","Pav-Bhaji");
        hashtable.put("L15","Coffee");
        hashtable.put("B19","Tea");
        
        System.out.println("\nimplementing HashMap :");
        for(Map.Entry<String, String> entry : treeMap.entrySet())
		{
			System.out.println("Menu code :"+entry.getKey()+" Menu Name :"+entry.getValue());
		}
        
	}

}











