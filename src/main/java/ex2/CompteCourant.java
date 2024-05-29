package ex2;

/**
 * Représente un compte de dépôt courant
 *
 * @author ayoubbz
 *
 */
public class CompteCourant extends CompteBancaire {

    /**
     * Constructeur de la classe CompteCourant
     *
     * @param solde     Solde du compte
     * @param decouvert Montant du découvert autorisé
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde, decouvert);
    }
}
