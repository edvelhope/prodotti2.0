package main;

import java.util.ArrayList;

public class Negozio {

	ArrayList<Prodotto> listaProdotti;

	// Costruttore

	Negozio() {
		this.listaProdotti = new ArrayList<>();
	}

	// Metodo che aggiunge un prodotto nel negozio

	public void aggiungiProdotto(Prodotto prodotto) {

		listaProdotti.add(prodotto);

	}

	// Metodo per filtrare i prodotti per categoria

	public ArrayList<Prodotto> filtraProdotti(String categoria) {
		ArrayList<Prodotto> prodottiFiltrati = new ArrayList<Prodotto>();

		for (Prodotto i : listaProdotti) {
			if (i.getCategoria().equalsIgnoreCase(categoria)) {
				prodottiFiltrati.add(i);
			}
		}
		return prodottiFiltrati;
	}

}
