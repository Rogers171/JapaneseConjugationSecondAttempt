/**
 * @author Adell - amrogers5
 * CIS175 - Fall 2022
 * Sep 18, 2022
 */
package Models;

public class Verb {
	//Properties
	private String dictionaryForm; //The plain (informal) present tense form (positive)
	private String masuForm;  //The polite (formal present tense form (positive), alwasy ends in -masu, thus the name
	private String verbType; //Three categories (conjugation types) of verbs in Japanese: Godan, Ichidan, and irregular (only 2 fully irregular verbs and 1 partially irregular verb)
	private static String taForm; //The -ta form is the plain past tense form of the verb.  Ends in -ta or -da
	
	//Getters and Setters
	public String getDictionaryForm() {
		return dictionaryForm;
	}
	public void setDictionaryForm(String dictionaryForm) {
		this.dictionaryForm = dictionaryForm;
	}
	public String getMasuForm() {
		return masuForm;
	}
	public void setMasuForm(String masuForm) {
		this.masuForm = masuForm;
	}
	public String getVerbType() {
		return verbType;
	}
	public void setVerbType(String verbType) {
		this.verbType = verbType;
	}
	public static String getTaForm() {
		return taForm;
	}
	public static void setTaForm(String taForm) {
		Verb.taForm = taForm;
	}
	
	//constructors
	public Verb() {}
	
	public Verb(String dictionaryForm, String masuForm) {
		this.dictionaryForm = dictionaryForm;
		this.masuForm = masuForm;
	}
	
	//Methods
	
	//Method to determine which verb class/type based on the dictionary and masu forms
	public String determineVerbType(String dictionaryForm, String masuForm) {
		if (dictionaryForm.equals("suru") || dictionaryForm.equals("kuru") || dictionaryForm.equals("iku")) {
			verbType = "irregular";
		} else if (dictionaryForm.endsWith("ru") && !masuForm.endsWith("rimasu")) {
			verbType = "ichidan";
		} else {
			verbType = "godan";
		}
		return verbType;
	}
	
	//Method to create the ta form according to verb type
	public static String createTaForm(String dictionaryForm, String verbType) {
		if (verbType.equals("irregular")) {
			if (dictionaryForm.equals("suru")) {
				taForm = "shita";
			} else if (dictionaryForm.equals("kuru")) {
				taForm = "kita";
			} else {
				taForm = "itta";
			}
		} else if (verbType.equals("ichidan")) {
			String stemForm = dictionaryForm.substring(0, dictionaryForm.length()-2);
			taForm = stemForm + "ta";
		} else {
			String stemForm = dictionaryForm.substring(0, dictionaryForm.length()-2);
			if (dictionaryForm.endsWith("mu") || dictionaryForm.endsWith("nu") || dictionaryForm.endsWith("bu")) {
				taForm = stemForm + "nda";
			} else if (dictionaryForm.endsWith("su")) {
				taForm = stemForm + "shita";
			} else if (dictionaryForm.endsWith("ku")) {
				taForm = stemForm + "ita";
			} else if (dictionaryForm.endsWith("gu")) {
				taForm = stemForm + "ida";
			} else {
				taForm = stemForm + "tta";
			}
		}
		return taForm;
	}
}
