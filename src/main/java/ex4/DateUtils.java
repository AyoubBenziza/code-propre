package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitaire permettant de formater des dates
 *
 * @author ayoubbz
 */

public class DateUtils {

	/** Format d'affichage et de parsage par défaut */
	private static final String FORMAT_DEFAUT = "dd/MM/yyyy HH:mm:ss";

	/** Transforme une date en chaine de caractères en respectant un format (modèle) d'affichage
	 * @param pattern format d'affichage (cf {@link SimpleDateFormat})
	 * @param date date à formatter
	 * @return {@link String}
	 */
	public static String format(String pattern, Date date) {

		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	/** Transforme une date en chaine de caractères en utilisant le format d'affichage par défaut : dd/MM/yyyy HH:mm:ss
	 *
	 * @param date date à formatter
	 * @return {@link String}
	 */
	public static String formatDefaut(Date date) {

		return format(FORMAT_DEFAUT, date);
	}
}
