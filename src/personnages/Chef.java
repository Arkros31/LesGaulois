package personnages;

public class Chef {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	public Chef(String nom, int force, int effetPotion, Village village) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
		this.village = village;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");;
	}
	
	public String prendreParole() {
		return "Le Chef " + nom +" : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
}
