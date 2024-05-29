package ex2;

/**
 * Représente un Livret A
 *
 * @author ayoubbz
 *
 */
public class LivretA extends CompteBancaire {

	/** Taux de rémunération en % dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur de la classe LivretA
	 *
	 * @param solde            Solde du compte
	 * @param tauxRemuneration Taux de rémunération en pourcentage
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Calculer la rémunération annuelle du compte
	 *
	 */
	public void appliquerRemuAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / 100.0;
	}

	/**
	 * Getter
	 *
	 * @return le taux de rémunération
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 *
	 * @param tauxRemuneration Taux de rémunération
	 * Modifie le taux de rémunération
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
