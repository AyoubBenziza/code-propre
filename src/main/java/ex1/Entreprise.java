package ex1;

import java.util.Date;
// Javadoc
/**
 * Classe représentant une entreprise
 *
 * @field siret : int
 * @field nom : String
 * @field adresse : String
 * @field dateCreation : Date
 * @author ayoubbz
 */
public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;

	public Entreprise(int siret, String nom, String adresse, Date dateCreation){
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}
	
	private static final int capitalMax = 3000000;
	
	private void afficherStatut(){
		
	}

	/*
	* Getters and Setters
	 */

	/**
	 * @return le siret de l'entreprise
	 */
	public int getSiret(){
		return siret;
	}

	/**
	 * @return le nom de l'entreprise
	 */
	public String getNom(){
		return nom;
	}

	/**
	 * @return l'adresse de l'entreprise
	 */
	public String getAdresse(){
		return adresse;
	}

	/**
	 * @return la date de création de l'entreprise
	 */
	public Date getDateCreation(){
		return dateCreation;
	}
	/**
	 * @param siret int
	 * Modifie le siret de l'entreprise
     */
	public void setSiret(int siret){
		this.siret = siret;
	}

	/**
	 * @param nom String
	 * Modifie le nom de l'entreprise
	 */
	public void setNom(String nom){
		this.nom = nom;
	}

	/**
	 * @param adresse String
	 * Modifie l'adresse de l'entreprise
	 */
	public void setAdresse(String adresse){
		this.adresse = adresse;
	}

	/**
	 * @param dateCreation Date
	 * Modifie la date de création de l'entreprise
	 */
	public void setDateCreation(Date dateCreation){
		this.dateCreation = dateCreation;
	}
	
}
