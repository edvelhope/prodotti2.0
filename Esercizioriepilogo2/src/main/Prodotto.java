package main;

public class Prodotto {
	String nome;
	String categoria;
	double prezzo;

	public Prodotto(String nome, String categoria, double prezzo) {
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	@Override
	public String toString() {
		return nome + " " + categoria + " " + prezzo;
	}
}
