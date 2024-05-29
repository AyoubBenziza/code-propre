package ex3;

/**
 * Zone d'un zoo qui n'accueille que des poissons
 */
public class Aquarium extends Zone {

	/**
	 * Poids moyen de nourriture en kg consommé par animal dans l'aquarium
	 */
	public static final double POIDS_MOYEN_CONSO_AQUARIUM = 0.2;

	/**
	 * Constructeur
	 */
	public Aquarium() {
		super(POIDS_MOYEN_CONSO_AQUARIUM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean accept(Animal animal) {

		return animal.getCategorie().equals(Categorie.POISSON);
	}
}