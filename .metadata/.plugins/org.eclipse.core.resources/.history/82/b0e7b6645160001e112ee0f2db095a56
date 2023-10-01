package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(int effetPotionMin, int effetPotionMax) {
		super();
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");;
	}
	
	public String prendreParole() {
		return "Le Druide " + nom +" : ";
	}
	
	public void preparerPotion() {
		Random Potion;
		Potion = nextInt(effetPotionMax);
		if (Potion > 7) {
			parler("J'ai préparé une super potion de force");
			System.out.println(Potion)
		}else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force")
			System.out.println(Potion);
		}
		
	}

}

	