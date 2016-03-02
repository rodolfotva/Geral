package main;

import java.util.Locale;
import java.util.ResourceBundle;

public class MainRes {

	public static void main(String... args){
		
		//ResourceBundle ou ListResourceBundle sao abstratas.

		Locale locale  = new Locale("de", "fr");
		Locale locale2 = new Locale("pt");
		Locale locale3 = new Locale("pt","BR","");
		Locale locale4 = new Locale.Builder().setLanguage("en").build();
		Locale locale5 = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
		Locale locale6 = Locale.GERMANY; //seta os dois automaticamente
		Locale locale7 = Locale.CHINESE; //seta apenas a lingua
		
		System.out.print(locale7.getDisplayLanguage(locale6));//vai mostrar a lingua falando na lingua pedida
		System.out.print(" - ");
		System.out.println(locale7.getDisplayCountry());
		System.out.println("");
		
		ResourceBundle bundle = ResourceBundle.getBundle("bundle.MyBundle", locale);

		System.out.println("English: " + bundle.getObject("Cancel"));
		System.out.println("English: " + bundle.getObject("Send"));

		System.out.println("");

		bundle = ResourceBundle.getBundle("bundle.MyBundle", locale5);

		System.out.println("Franch: " + bundle.getObject("Cancel"));
		System.out.println("Franch: " + bundle.getObject("Send"));

		System.out.println("");

		//Locale.setDefault(new Locale("fr", "FR"));
		bundle = ResourceBundle.getBundle("bundle.MyBundle", locale3);

		System.out.println("Brazil: "+ bundle.getObject("Cancel"));
		System.out.println("Brazil: "+ bundle.getObject("Send"));

		System.out.println("");

		bundle = ResourceBundle.getBundle("bundle.MyBundle", locale6);

		System.out.println("Germany: "+ bundle.getObject("Cancel"));
		System.out.println("Germany: "+ bundle.getObject("Send"));
	}
}
