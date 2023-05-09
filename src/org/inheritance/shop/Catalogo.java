package org.inheritance.shop;

import java.util.Arrays;
import java.util.Scanner;

import org.prod.pojo.Cuffie;
import org.prod.pojo.Prodotto;
import org.prod.pojo.Smartphone;
import org.prod.pojo.Televisore;

public class Catalogo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Prodotto[] arrCa = new Prodotto[100];
		int count = 0;
		while(true) {
			
			
			System.out.println("Scegli tipo di classe");
			System.out.println("1 - Smartphone");
			System.out.println("2 - Televisore");
			System.out.println("3 - Cuffie");
			System.out.println("4 - uscire");
			int tipo = in.nextInt();
			
			if (tipo < 1 || tipo > 4) {
				
				System.err.println("Scelta non trovata");
				
				continue;
			}
			
			switch (tipo) {
			case 1: {
				System.out.println("Nome del prodotto");
				String nome = in.next();
				
				System.out.println("Marca del prodotto");
				String marca = in.next();
				
				System.out.println("Prezzo del prodotto");
				int prezzo = in.nextInt();
				
				System.out.println("Iva del prodotto");
				int iva = in.nextInt();
				System.out.println("Inserire imei");
				int imei = in.nextInt();
				System.out.println("Inserire memoria");
				int memoria = in.nextInt();
				arrCa[count++] = new Smartphone(nome, marca, prezzo, iva, imei, memoria);
			}
			break;
			case 2:{
				System.out.println("Nome del prodotto");
				String nome = in.next();
				
				System.out.println("Marca del prodotto");
				String marca = in.next();
				
				System.out.println("Prezzo del prodotto");
				int prezzo = in.nextInt();
				
				System.out.println("Iva del prodotto");
				int iva = in.nextInt();
				System.out.println("Inserire dimensione");
				int imei = in.nextInt();
				System.out.println("Inserire se e' smart");
				boolean smart = in.nextBoolean();
				arrCa[count++] = new Televisore(nome, marca, prezzo, iva, imei, smart);
			}
			break;
			case 3:{
				System.out.println("Nome del prodotto");
				String nome = in.next();
				
				System.out.println("Marca del prodotto");
				String marca = in.next();
				
				System.out.println("Prezzo del prodotto");
				int prezzo = in.nextInt();
				
				System.out.println("Iva del prodotto");
				int iva = in.nextInt();
				System.out.println("Inserire colore");
				String colore = in.next();
				System.out.println("Inserire se e' wireless");
				boolean wireless = in.nextBoolean();
				arrCa[count++] = new Cuffie(nome, marca, prezzo, iva, colore, wireless);
			}
			break;
			case 4:
				System.out.println("Arrivederci");
				System.out.println(Arrays.asList(arrCa));
				return;
			}
		}
	}
}
