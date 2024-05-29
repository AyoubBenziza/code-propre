package ex2;

/** Représente un compte bancaire de type compte courant (type=CC) ou livret A (type=LA)
 * @author ayoubbz
 */
public abstract class CompteBancaire {
	/** Solde du compte */
	protected double solde;
	
	/** Montant du découvert autorisé seulement pour les comptes courants */
	protected double decouvert;
	
	/**
	 * Constructeur de la classe CompteBancaire
	 *
	 * @param solde Solde du compte
	 * @param decouvert Montant du découvert autorisé
	 */
	public CompteBancaire(double solde, double decouvert) {
		super();
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Ajouter un montant au solde
	 * @param montant Montant à créditer
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Soustraire un montant au solde
	 * @param montant à débiter
	 */
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
			this.solde -= montant;
		}
	}
	
	/** Getter
	 * @return le solde du compte
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde Solde du compte
	 * Modifie le solde du compte
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/** Getter
	 * @return le découvert autorisé
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/** Setter
	 * @param decouvert the decouvert to set
	 * Modifie le montant du découvert autorisé
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
