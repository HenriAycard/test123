package blackjack;

import blackjack.JoueurHumain;
import blackjack.JoueurOrdinateur;
import blackjack.Carte;

public abstract class Joueur {

	protected Main m;

	public Joueur(Main m) {
		this.m = m;
	}

	public void ajouter(Talon t, int nbcarte) {
		m.PrendCarte(t, nbcarte);
	}
	abstract boolean prendreCarte();
}
