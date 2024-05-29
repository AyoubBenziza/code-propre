package ex3;

/**
 * Zone d'un zoo qui n'accueille que des mammifères herbivores
 */
public class SavaneAfricaine extends Zone {

	/**
	 * Poids moyen de nourriture en kg consommé par animal dans la savane africaine
	 */
	public static final double POIDS_MOYEN_CONSO_SAVANE = 10.0;

	/**
	 * Constructeur
	 */
	public SavaneAfricaine() {
		super(POIDS_MOYEN_CONSO_SAVANE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean accept(Animal animal) {

		return animal.getCategorie().equals(Categorie.MAMMIFERE)
				&& animal.getComportement().equals(Comportement.HERBIVORE);
	}
}