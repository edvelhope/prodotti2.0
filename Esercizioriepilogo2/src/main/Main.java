/*2)  Crea una classe Prodotto con attributi nome, categoria e prezzo.
Crea una classe Negozio con un ArrayList di prodotti disponibili e metodi per:
- Filtrare i prodotti per categoria.
- Aggiungere nuovi prodotti al negozio.
Crea una classe Carrello che contiene un ArrayList di prodotti selezionati.
- Implementa un metodo per aggiungere un prodotto al carrello.
- Implementa un metodo per calcolare il totale del carrello.
Simula un negozio con almeno 5 prodotti e un carrello per un utente, includendo operazioni di filtraggio e acquisto.*/

package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Negozio negozio = new Negozio();

		Prodotto latte = new Prodotto("Latte", "Alimenti", 1.90);
		Prodotto laptop = new Prodotto("Laptop", "Elettronica", 999.90);
		Prodotto smartphone = new Prodotto("Smartphone", "Elettronica", 499.90);
		Prodotto verdura = new Prodotto("Verdura", "Alimenti", 0.90);
		Prodotto pantaloni = new Prodotto("Pantaloni", "Abbigliamento", 49.90);
		Prodotto divano = new Prodotto("Divano", "Casa", 299.90);
		negozio.aggiungiProdotto(latte);
		negozio.aggiungiProdotto(laptop);
		negozio.aggiungiProdotto(smartphone);
		negozio.aggiungiProdotto(verdura);
		negozio.aggiungiProdotto(pantaloni);
		negozio.aggiungiProdotto(divano);

		// Filtro prodotti per categoria

		ArrayList<Prodotto> elettronica = negozio.filtraProdotti("Elettronica");

		for (Prodotto i : elettronica) {
			System.out.println(i);
		}

		System.out.println("\nProdotti nel carrello:");
		
		Carrello carrello = new Carrello();
		carrello.aggProdottoCarrello(divano);
		carrello.aggProdottoCarrello(laptop);
		carrello.aggProdottoCarrello(verdura);

		for (Prodotto i : carrello.getProdottiSelezionati()) {
			System.out.println(i);
		}

		System.out.println("Totale nel carrello: " + carrello.calcolaTotaleCarrello() + " €");

	}

}
