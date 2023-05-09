package org.inheritance.shop;

import org.prod.pojo.Cuffie;
import org.prod.pojo.Prodotto;
import org.prod.pojo.Smartphone;
import org.prod.pojo.Televisore;

public class Shop {
	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto("ciccio", "samsung", 20, 22);
		
		System.out.println(p1);
		System.out.println("\n-------------------------\n");
		
		Smartphone s1 = new Smartphone("galaxy", "lg", 120, 20, 123312, 132);
		
		System.out.println(s1);		
		System.out.println("\n-------------------------\n");
		
		Televisore t1 = new Televisore("tv", "lg", 120, 22, 13, true);
		
		System.out.println(t1);	
		System.out.println("\n-------------------------\n");
		
		Cuffie c1 = new Cuffie("ryze", "omen", 125, 22, "blue", true);
		
		System.out.println(c1);
	}
}
