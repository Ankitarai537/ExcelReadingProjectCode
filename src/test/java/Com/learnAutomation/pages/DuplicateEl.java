package Com.learnAutomation.pages;

import java.util.HashMap;

import com.sun.xml.xsom.impl.scd.Iterators.Map;

public class DuplicateEl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ankita is name Ankita name is si is";
		String arr[]=str.split(" ");
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(String keyval: arr ) {
			if(map.containsKey(keyval)) {
				map.put(keyval, map.get(keyval)+1);
				
			}
			
			
			else {
				map.put(keyval, 1);
				
			}
			
			
			
			
		}

	}

}
