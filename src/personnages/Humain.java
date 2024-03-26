package personnages;

public class Humain {
	
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getBoissonFavorite() {
		return boissonFavorite;
	}
	
	public int getArgent() {
		return argent;
	}
	
	private void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite +  ".");
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	public void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (argent > prix) {
			this.parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			this.parler("Je n'ai plus que " + argent + " en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}

}
