package org.prod.pojo;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String marca;
	private int prezzo;
	private int iva;
	
	public Prodotto(String nome, String marca, int prezzo, int iva) {
		Random rdm = new Random();
		
		codice = rdm.nextInt(101);
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public int getCodice() {
		return codice;
	}
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getMarca() {
		return marca;
	}	
	public void setMarca(String marca) {
		this.marca = marca;
	}	
	public int getPrezzo() {
		return prezzo;
	}	
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}	
	public int getIvaPr() {
		return (int) (getPrezzo() * ( 1 + getIva() / 100f));
	}
	public int getIva() {
		return iva;
	}	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	protected String getProdottoString() {
		return "codice: " + getCodice() 
				+ "\nnome: " + getNome()
				+ "\nmarca: " + getMarca()
				+ "\nprezzo: " + getPrezzo()
				+ "\nprezzo + iva: " + getIvaPr();
	}
	
	@Override
	public String toString() {
		return "(P)" + getProdottoString();
	}
}

