package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		super.parler("J’ai tout perdu! Le monde est trop injuste...");
		return super.getArgent();
	}
	
	public void recevoir(int argent) {
		super.parler(argent + " sous ! Je te remercie généreux donateur!");
		super.gagnerArgent(argent);
	}
	
}
