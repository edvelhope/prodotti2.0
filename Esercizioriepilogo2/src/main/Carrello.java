package main;

import java.util.ArrayList;

public class Carrello {

	ArrayList<Prodotto> prodottiSelezionati;

	Carrello() {
		this.prodottiSelezionati = new ArrayList<>();
	}
	
	// Metodo aggiunta prodotto nel carrello

	public void aggProdottoCarrello(Prodotto prodotto) {
		prodottiSelezionati.add(prodotto);
	}

	// Metodo che calcola il prezzo totale del carrello
	
	public double calcolaTotaleCarrello() {
		double totale = 0;
		for (int i = 0; i < prodottiSelezionati.size(); i++) {
			totale += prodottiSelezionati.get(i).getPrezzo();
		}
		return totale;
	}
	
	public ArrayList<Prodotto> getProdottiSelezionati() {
        return prodottiSelezionati;
    }
}
