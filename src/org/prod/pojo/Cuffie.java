package org.prod.pojo;

public class Cuffie extends Prodotto{
	private String colore;
	private boolean wireless;

	public Cuffie(String nome, String marca, int prezzo, int iva,
			String colore, boolean wireless) {
		super(nome, marca, prezzo, iva);
		setColore(marca);
		setWireless(wireless);
	}

	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		return "(C)" + getProdottoString()
				+ "\ncolore: " + getColore()
				+ "\nwireless: " + isWireless();
	}
}
