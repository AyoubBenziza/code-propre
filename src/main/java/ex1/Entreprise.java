package ex1;

import java.util.Date;
// Javadoc
/**
 * Classe représentant une entreprise
 *
 * @author ayoubbz
 */
public class Entreprise {
	/** Numéro siret de l'entreprise */
	private int siret;
	/** Nom de l'entreprise */
	private String nom;
	/** Adresse de l'entreprise */
	private String adresse;
	/** Date de création de l'entreprise */
	private Date dateCreation;

	/**
	 * Constructeur de la classe Entreprise
	 * @param siret : siret de l'entreprise
	 * @param nom : nom de l'entreprise
	 * @param adresse : adresse de l'entreprise
	 * @param dateCreation : date de création de l'entreprise
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation){
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	private static final int capitalMax = 3000000;

	/**
	 * Méthode permettant d'afficher les informations de l'entreprise
	 */
	private void afficherStatut(){
		System.out.println("Siret : "+siret);
		System.out.println("Nom : "+nom);
		System.out.println("Adresse : "+adresse);
		System.out.println("Date de création : "+dateCreation);
	}

	/**
	 * Getter
	 *
	 * @return le siret de l'entreprise
	 */
	public int getSiret(){
		return siret;
	}

	/**
	 * Getter
	 *
	 * @return le nom de l'entreprise
	 */
	public String getNom(){
		return nom;
	}

	/**
	 * Getter
	 *
	 * @return l'adresse de l'entreprise
	 */
	public String getAdresse(){
		return adresse;
	}

	/**
	 * Getter
	 *
	 * @return la date de création de l'entreprise
	 */
	public Date getDateCreation(){
		return dateCreation;
	}
	/**
	 * Setter
	 *
	 * @param siret int
	 * Modifie le siret de l'entreprise
     */
	public void setSiret(int siret){
		this.siret = siret;
	}

	/**
	 * Setter
	 *
	 * @param nom String
	 * Modifie le nom de l'entreprise
	 */
	public void setNom(String nom){
		this.nom = nom;
	}

	/**
	 * Setter
	 *
	 * @param adresse String
	 * Modifie l'adresse de l'entreprise
	 */
	public void setAdresse(String adresse){
		this.adresse = adresse;
	}

	/**
	 * Setter
	 *
	 * @param dateCreation Date
	 * Modifie la date de création de l'entreprise
	 */
	public void setDateCreation(Date dateCreation){
		this.dateCreation = dateCreation;
	}
	
}
