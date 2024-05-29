package ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Représente le concept de zoo avec ses zones spécifiques pour les animaux.
 *
 * @author ayoubbz
 *
 */
public class Zoo {

	/** Nom */
	private String nom;

	/** Les différentes zones du zoo */
	private final List<Zone> zones = new ArrayList<>();

	/**
	 * Constructeur
	 *
	 * @param nom nom du Zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
		Collections.addAll(zones, new SavaneAfricaine(), new ZoneCarnivore(), new Aquarium(), new FermeReptile());
	}

	/**
	 * Ajoute un animal au zoo. Cette méthode choisit une zone pour l'animal en
	 * fonction de sa catégorie et de son régime alimentaire
	 *
	 * @param animal animal
	 */
	public void addAnimal(Animal animal) {
		for (Zone zone : zones) {
			if (zone.accept(animal)) {
				zone.addAnimal(animal);
				break;
			}
		}
	}

	/**
	 * Affichage de la liste des animaux
	 */
	public void afficherListeAnimaux() {
		zones.forEach(Zone::afficherListeAnimaux);
	}

	/**
	 * Getter
	 *
	 * @return nom du zoo
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}