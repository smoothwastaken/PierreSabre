package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");

		int argentExtorque = victime.seFaireExtorquer();

		parler("J’ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait "
				+ this.getArgent() + " sous dans ma poche. Hi ! Hi !");

		this.gagnerArgent(argentExtorque);
		reputation++;
	}

	public void perdre() {
		parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		perdreArgent(getArgent());
		reputation--;
	}

	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses "
				+ gain + " sous.");
	}

}
