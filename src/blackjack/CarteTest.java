package blackjack;

import java.util.HashSet;
import java.util.Set;

import blackjack.Carte.Couleur;
import blackjack.Carte.Valeur;

public class CarteTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Carte asDeCarreau = new Carte(Valeur.AS, Couleur.CARREAU);
		Carte asDeCarreauBis = new Carte(Valeur.AS, Couleur.CARREAU);
		Carte asDePique = new Carte(Valeur.AS, Couleur.PIQUE);
		
		System.out.println("equals()->" + asDeCarreau.equals(asDeCarreauBis));
		System.out.println("equals()->" + asDeCarreau.equals(asDePique));
		System.out.println("asDeCarreau.toString()" + asDeCarreau);
		
		Talon t = new Talon();
		
		Main m = new Main();
		m.PrendCarte(t, 2);
		
		Main m2 = new Main();
		m2.PrendCarte(t, 1);
		
		System.out.println(m);
		System.out.println(m2);
		

		boolean test = m.compare(m2);
		if(test==true) {
			System.out.println("la main principale bat la deuxieme main");
		}else {
			System.out.println("la deuxieme main bat la main principale");
		}
		
		

	}

}
