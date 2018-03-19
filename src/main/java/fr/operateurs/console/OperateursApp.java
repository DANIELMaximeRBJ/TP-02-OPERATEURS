package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {
	 public static void main( String[] args )
	    {
		 	System.out.println("***** Application Opérateurs *****");
		 	
		 	System.out.println("Veuillez saisir le premier nombre :");
		 	Scanner questionUser = new Scanner(System.in) ;
		 	int nombre_1 = questionUser.nextInt() ; 
		 	
		 	System.out.println("Veuillez saisir le second nombre :");
		 	int nombre_2 = questionUser.nextInt() ; 
		 	
		 	System.out.println(nombre_1 + "+" + nombre_2 + "=" + (nombre_1 + nombre_2));
		 	System.out.println(nombre_1 + "-" + nombre_2 + "=" + (nombre_1 - nombre_2));
		 	System.out.println(nombre_1 + "*" + nombre_2 + "=" + (nombre_1 * nombre_2));
		 	System.out.println(nombre_1 + "/" + nombre_2 + "=" + (nombre_1 / nombre_2));
		 	System.out.println(nombre_1 + "%" + nombre_2 + "=" + (nombre_1 % nombre_2));
	    }
	 
}
