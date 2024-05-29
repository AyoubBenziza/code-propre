package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une zone d'un zoo
 */
public abstract class Zone {

    /** Liste des animaux de la zone */
    private final List<Animal> animaux;

    /** Poids moyen consommé par animaux pour la zone */
    private final double poidsMoyenConsoNourriture;

    /** Constructeur
     *
     */
    public Zone(double poidsMoyenConsoNourriture) {
        this.animaux = new ArrayList<>();
        this.poidsMoyenConsoNourriture = poidsMoyenConsoNourriture;
    }

    /** La zone contrôle si elle accepte ou non l'animal passé en paramètre.
     * Le résultat fourni est basé sur la catégorie de l'animal et son régime alimentaire.
     * Chaque classe fille fournit son propre algorithme
     * @param animal animal
     * @return boolean
     */
    public abstract boolean accept(Animal animal);

    /** Liste des animaux de la zone
     * @param animal animal
     */
    public final void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * Affiche tous les animaux de la zone
     */
    public void afficherListeAnimaux(){
        System.out.println(this.getClass().getSimpleName()+":");
        animaux.forEach(a -> System.out.println(a.toString()));
        System.out.println();
    }

    /**
     * Calcule le poids indicatif de nourriture consommé chaque jour par les animaux
     */
    public final double calculerKgsNourritureParJour(){
        return animaux.size() * getPoidsMoyenConsoNourriture();
    }

    /** Getter
     * @return le poids moyen consommé par les animaux de la zone
     */
    public final double getPoidsMoyenConsoNourriture() {
        return poidsMoyenConsoNourriture;
    }
}
