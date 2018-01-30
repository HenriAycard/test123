package blackjack;

public class Jeu {
	public static void main(String[] args) {
		System.out.println("==== WELCOME ====");
		System.out.println("Chargement de la partie ...");
		Talon t = new Talon();
		
		System.out.println("Creation de la main Humaine ...");
		Main mHumaine = new Main();
		JoueurHumain jh = new JoueurHumain(mHumaine);
		
		System.out.println("Creation de la main Ordinateur ...");
		Main mOrdinateur = new Main();
		JoueurOrdinateur jo = new JoueurOrdinateur(mOrdinateur);
		boolean verifHumain;
		boolean verifOrdi;
		
		System.out.println("   === La partie commence ! ===");
		do {
			verifHumain = jh.prendreCarte();
			if(verifHumain) {
			jh.ajouter(t, 1);
			}
			System.out.println("Vos Cartes:" + jh.toString());
			System.out.println("Vos points: " + jh.m.somme());
			verifOrdi = jo.prendreCarte();
			if(verifOrdi) {
				jo.ajouter(t, 1);
			}
		
		//}while((jh.prendreCarte() || jo.prendreCarte()) && (jh.m.somme()<22) && (jo.m.somme()<22));
		}while((verifHumain == true || verifOrdi == true) && (jh.m.somme()<22) && (jo.m.somme()<22));
		
		if(jh.m.compare(jo.m)) {
			System.out.println("vous avez gagne");
			System.out.println("Vos points: " + jh.m.somme());
			System.out.println("Points Ordianteur: " + jo.m.somme());

		}else {
			System.out.println("vous avez perdu");
			System.out.println("Vos points: " + jh.m.somme());
			System.out.println("Points Ordianteur: " + jo.m.somme());
		}

		
		
		
	}

}
