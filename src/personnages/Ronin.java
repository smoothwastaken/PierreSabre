package personnages;

public class Ronin extends Humain {

	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentDonne = (int) (getArgent() * 0.1);

		super.parler(beneficiaire.getNom() + " prend ces " + argentDonne + " sous.");
		beneficiaire.recevoir(argentDonne);
		perdreArgent(argentDonne);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		
		if (force >= adversaire.getReputation()) {
			gagnerArgent(adversaire.getArgent());
			honneur++;
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
		}
	}

}
