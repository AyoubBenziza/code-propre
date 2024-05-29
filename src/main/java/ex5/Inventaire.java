package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un inventaire d'objets répartis dans des caisses de différentes tailles en fonction de leur poids en kg (petits, moyens, grands)
 *
 * @author ayoubbz
 *
 */
public class Inventaire {

	/** Liste des caisses */
	private final List<Caisse> caisses;

	/**
	 * Constructeur
	 *
	 */
	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 0, 5));
		caisses.add(new Caisse("Moyens objets", 5, 20));
		caisses.add(new Caisse("Grands objets", 20, Integer.MAX_VALUE));
	}

	/**
	 * Ajoute un item à l'inventaire : cette méthode choisit une caisse adaptée en
	 * fonction du poids de l'objet
	 *
	 * @param item item à ajouter
	 */
	public void addItem(Item item) {

		for (Caisse caisse : caisses) {
			if (caisse.accepte(item)) {
				caisse.getItems().add(item);
			}
		}
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("Inventaire: ").append(taille()).append(" objet(s).");
		for (Caisse c : caisses) {
			builder.append("\n\t").append(c);
		}
		return builder.toString();
	}

	/**
	 * Retourne le nombre d'objets dans l'inventaire
	 *
	 * @return int
	 */
	public int taille() {

		int somme = 0;
		for (Caisse caisse : caisses) {
			somme += caisse.taille();
		}
		return somme;
	}
}
