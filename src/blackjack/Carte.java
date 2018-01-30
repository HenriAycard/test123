package blackjack;
import java.awt.Color;
public class Carte {

	
	public enum Couleur {
		COEUR, CARREAU, TREFLE, PIQUE
		
	}

	public enum Valeur {
		AS{int getNumVal(){
			return 1;
			}
		}, DEUX{int getNumVal(){
			return 2;
			}
		}, TROIS{int getNumVal(){
			return 3;
			}
		}, QUATRE{int getNumVal(){
			return 4;
			}
		}, CINQ{int getNumVal(){
			return 5;
			}
		}, SIX{int getNumVal(){
			return 6;
			}
		}, SEPT{int getNumVal(){
			return 7;
			}
		}, HUIT{int getNumVal(){
			return 8;
			}
		}, NEUF{int getNumVal(){
			return 9;
			}
		}, DIX{int getNumVal(){
			return 10;
			}
		}, VALET{int getNumVal(){
			return 11;
			}
		}, DAME{int getNumVal(){
			return 12;
			}
		}, ROI{int getNumVal(){
			return 13;
			}
		};
		abstract int getNumVal();

	}

	private Valeur valeur;// "ace", "deux"...
	private Couleur couleur; // "pique", "coeur"

	public Carte(Valeur valeur, Couleur couleur) {
		this.valeur = valeur;
		this.couleur = couleur;		
	}
	
	public static void main(String[] args) {
		Carte carte = new Carte(Valeur.AS, Couleur.CARREAU);
		carte.equals("coco");
	}
	public Valeur getValeur() {
		return valeur;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((couleur == null) ? 0 : couleur.hashCode());
		result = prime * result + ((valeur == null) ? 0 : valeur.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		
		if (!(o instanceof Carte)){
			return false;
		}
		Carte other = (Carte) o;
		
		
		return couleur == other.couleur && valeur == other.valeur;
	}

	@Override
	public String toString() {
		return "Carte [valeur=" + valeur + ", couleur=" + couleur + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}












