package blackjack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import blackjack.Carte.Couleur;
import blackjack.Carte.Valeur;

public class Talon {

	private int indiceCarte;
	private static final int NB_CARTE_52 = 52;
	private List<Carte> cartes = new LinkedList<>();

	public Talon() {
		indiceCarte=0;

		for (Couleur couleur : Couleur.values()) {

			for (Valeur valeur : Valeur.values()) {

				cartes.add(new Carte(valeur, couleur));
			}
		}
	}

	public boolean isComplet() {


		Set<Carte> setCartes = new HashSet<>(cartes);

		if (setCartes.size() != NB_CARTE_52) {
			return false;
		}

		return true;

	}
	
	public Carte DonneCarte() {
		indiceCarte++;
		return cartes.get(indiceCarte-1);
		
	}
	
	public void melanger() {
		
	}

	
}
