package ex5;

/**
 * Représente un objet
 *
 * @author ayoubbz
 *
 */
public class Item {

	/** Nom de l'objet */
	private String nom;

	/** Poids en kg */
	private double poids;

	/**
	 * Constructeur d'un objet
	 *
	 * @param nom   nom de l'objet
	 * @param poids poids en kg
	 */
	public Item(String nom, double poids) {
		super();
		this.nom = nom;
		this.poids = poids;
	}

	/**
	 * Retourne une chaine de caractères représentant l'objet
	 */
	@Override
	public String toString() {
		return nom + " " + poids + " kg";
	}

	/**
	 * Getter
	 *
	 * @return nom de l'objet
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 *
	 * @param nom nom de l'objet
	 * Modifier le nom de l'objet
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 *
	 * @return poids de l'objet
	 */
	public double getPoids() {
		return poids;
	}

	/**
	 * Setter
	 *
	 * @param poids the poids to set
	 * Modifier le poids de l'objet
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}
}
