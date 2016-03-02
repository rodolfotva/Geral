package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int qtde = sc.nextInt();

		if (qtde >= 1 && qtde <= 100) {
			List<String> pedras = new ArrayList();
			for (int x = 0; x < qtde; x++) {
				pedras.add(sc.next());
			}

			System.out.println(checkUpper(qtde, pedras));

		}
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
