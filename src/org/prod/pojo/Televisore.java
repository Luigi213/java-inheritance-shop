package org.prod.pojo;

public class Televisore extends Prodotto{
	private int dimensioni;
	private boolean smart;

	public Televisore(String nome, String marca, int prezzo, int iva, 
			int dimensioni, boolean smart) {
		super(nome, marca, prezzo, iva);
		setDimensioni(dimensioni);
		setSmart(smart);
	}

	public int getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		return  "[" + "(T)" + getProdottoString()
				+ "\ndimensioni: " + getDimensioni()
				+ "\nsmart: " + isSmart() + "]";
	}
}
