package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une caisse avec un minimum et un maximum
 *
 * @author ayoubbz
 *
 */
public class Caisse {

	/** nom */
	private String nom;
	/** items */
	private List<Item> items;
	/** min */
	private final int min;
	/** max */
	private final int max;

	/**
	 * Constructeur
	 *
	 * @param nom nom de la caisse
	 * @param min poids minimum
	 * @param max poids maximum
	 */
	public Caisse(String nom, int min, int max) {
		super();
		this.nom = nom;
		this.min = min;
		this.max = max;
		this.items = new ArrayList<>();
	}

	/**
	 * La méthode demande si la caisse accepte ou non l'item
	 *
	 * @param item item
	 * @return boolean
	 */
	public boolean accepte(Item item) {
		return min <= item.getPoids() && item.getPoids() < max;
	}

	/**
	 * Retourne le nombre d'objets dans la caisse
	 *
	 * @return int
	 */
	public int taille() {
		return items.size();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nom).append(": ").append(taille()).append(" objet(s)).");
		items.forEach(i -> builder.append("\n\t\t").append(i));
		return builder.toString();
	}

	/**
	 * Getter pour l'attribut nom
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut items
	 *
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * Setter pour l'attribut items
	 *
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
