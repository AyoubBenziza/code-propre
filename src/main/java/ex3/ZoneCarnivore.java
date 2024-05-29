package ex3;

/**
 * Zone d'un zoo qui n'accueille que des mammifères carnivores
 */
public class ZoneCarnivore extends Zone {

	/**
	 * Poids moyen de nourriture en kg consommé par animal dans la zone carnivore
	 */
	public static final double POIDS_MOYEN_CONSO_ZONE_CARNIVORE = 10.0;

	/**
	 * Constructeur
	 */
	public ZoneCarnivore() {
		super(POIDS_MOYEN_CONSO_ZONE_CARNIVORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean accept(Animal animal) {

		return animal.getCategorie().equals(Categorie.MAMMIFERE)
				&& animal.getComportement().equals(Comportement.CARNIVORE);
	}
}