package org.inheritance.shop;

import java.util.Scanner;

import org.prod.pojo.Cuffie;
import org.prod.pojo.Smartphone;
import org.prod.pojo.Televisore;

public class Catalogo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nome del prodotto");
		String nome = in.nextLine();
		
		System.out.println("Marca del prodotto");
		String marca = in.nextLine();
		
		System.out.println("Prezzo del prodotto");
		int prezzo = in.nextInt();
		
		System.out.println("Iva del prodotto");
		int iva = in.nextInt();
		
		System.out.println("Scegli tipo di classe");
		System.out.println("1 - Smartphone");
		System.out.println("2 - Televisore");
		System.out.println("3 - Cuffie");
		System.out.println("4 - uscire");
		int tipo = in.nextInt();
		
		switch (tipo) {
			case 1: {
				System.out.println("Inserire imei");
				int imei = in.nextInt();
				System.out.println("Inserire memoria");
				int memoria = in.nextInt();
				Smartphone s1 = new Smartphone(nome, marca, prezzo, iva, imei, memoria);
				System.out.println(s1);
			}
			break;
			case 2:{
				System.out.println("Inserire dimensione");
				int imei = in.nextInt();
				System.out.println("Inserire se e' smart");
				boolean smart = in.hasNext();
				Televisore t1 = new Televisore(nome, marca, prezzo, iva, imei, smart);
				System.out.println(t1);
			}
			break;
			case 3:{
				System.out.println("Inserire colore");
				String colore = in.next();
				System.out.println("Inserire se e' wireless");
				boolean wireless = in.hasNext();
				Cuffie c1 = new Cuffie(nome, marca, prezzo, iva, colore, wireless);
				System.out.println(c1);
			}
			break;
			default:
				System.out.println("Arrivederci");
		}
		
		in.close();
	}
}
