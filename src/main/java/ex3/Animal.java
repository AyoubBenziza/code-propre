package ex3;

/**
 * Concept d'animal
 *
 * @author DIGINAMIC
 *
 */
public class Animal {

    /** Nom (Lion, Gazelle, etc.) */
    private final String nom;

    /** Catégorie (mammifère, poisson, etc.) */
    private final Categorie categorie;

    /** Comportement alimentaire (herbivore, carnivore, omnivore) */
    private final Comportement comportement;

    /**
     * Constructeur
     *
     * @param nom          nom de l'animal
     * @param categorie    categorie d'animal
     * @param comportement comportement alimentaire
     */
    public Animal(String nom, Categorie categorie, Comportement comportement) {
        super();
        this.nom = nom;
        this.categorie = categorie;
        this.comportement = comportement;
    }

    /**
     * Retourne une chaine de caractères représentant l'animal
     */
    @Override
    public String toString() {
        return "nom=" + nom + ", catégorie=" + categorie.getNom() + ", comportement=" + comportement;
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
     * Getter pour l'attribut categorie
     *
     * @return the categorie
     */
    public Categorie getCategorie() {
        return categorie;
    }

    /**
     * Getter
     *
     * @return comportement alimentaire
     */
    public Comportement getComportement() {
        return comportement;
    }
}
