package org.prod.pojo;

public class Smartphone extends Prodotto{
	
	private int imei;
	private int memoria;

	public Smartphone(String nome, String marca, int prezzo, int iva,
			int imei, int memoria) {
		super(nome, marca, prezzo, iva);
		setImei(imei);
		setMemoria(memoria);
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return "(S)"+ getProdottoString()
				+ "\nIMEI: " + getImei()
				+ "\nmemoria: " + getMemoria();
	}
	
}
