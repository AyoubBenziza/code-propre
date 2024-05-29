package ex3;

/**
 * Représente une catégorie phylogénétique d'animaux
 *
 * @author ayoubbz
 *
 */
public enum Categorie {

    /** Type Mammifère */
    MAMMIFERE("Mammifère"),

    /** Type Oiseau */
    OISEAU("Oiseau"),

    /** Type Poisson */
    POISSON("Poisson"),

    /** Type Reptile */
    REPTILE("Reptile");

    /** Nom de la classe d'animaux */
    private final String nom;

    /**
     * Constructeur
     *
     * @param nom Nom de la catégorie
     */
    private Categorie(String nom) {
        this.nom = nom;
    }

    /**
     * Getter
     *
     * @return nom de la catégorie
     */
    public String getNom() {
        return nom;
    }

}
