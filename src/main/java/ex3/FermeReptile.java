package ex3;

/**
 * Zone d'un zoo qui n'accueille que des reptiles
 */
public class FermeReptile extends Zone {

	/**
	 * Poids moyen de nourriture en kg consommé par animal dans la ferme aux
	 * reptiles
	 */
	public static final double POIDS_MOYEN_CONSO_FERME_REPTILE = 0.1;

	/**
	 * Constructeur
	 */
	public FermeReptile() {
		super(POIDS_MOYEN_CONSO_FERME_REPTILE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean accept(Animal animal) {

		return animal.getCategorie().equals(Categorie.REPTILE);
	}
}