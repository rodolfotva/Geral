package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class rerere {

	public static void main(String[] args) {
		int total = 3;
		List<String> pedras = new ArrayList();
		pedras.add("abcdde");
		pedras.add("baccd");
		pedras.add("eeabg");
		
		System.out.println(checkUpper(total, pedras));

		
	}

	private static int checkUpper(int total, List<String> pedras) {
		int resultado = 0;
		
		Map<String,String> retiraDupla = new HashMap<String, String>();
		List<String> caracteresTotal = new ArrayList<String>();
		TreeSet<String> caracs = new TreeSet<String>();
		
		for(String value : pedras){
			retiraDupla = new HashMap<String, String>();
			for (int x = 0; x < value.length(); x++) {
				retiraDupla.put(String.valueOf(value.charAt(x)), String.valueOf(value.charAt(x)));
				caracs.add(String.valueOf(value.charAt(x)));
			}
			
			for(String value2 : retiraDupla.values()){
				caracteresTotal.add(value2);
			}
		}

		Collections.sort(caracteresTotal);

		for(String carac : caracs){
			int qa = Collections.frequency(caracteresTotal, carac); 
			if(qa == total){
				resultado++;
			}
		}
		
		return resultado;
	}

}
