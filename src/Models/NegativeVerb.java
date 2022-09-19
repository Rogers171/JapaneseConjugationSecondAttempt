/**
 * @author Adell - amrogers5
 * CIS175 - Fall 2022
 * Sep 18, 2022
 */
package Models;

public class NegativeVerb {
	//Properties
	private String plainPresentNegative; //Negative refers to "not", as in "not eating"
	private String plainPastNegative; //Past negative would be like "wasn't eating" or "didn't eat"
	
	//Getters and Setters
	public String getPlainPresentNegative() {
		return plainPresentNegative;
	}
	public void setPlainPresentNegative(String plainPresentNegative) {
		this.plainPresentNegative = plainPresentNegative;
	}
	public String getPlainPastNgative() {
		return plainPastNegative;
	}
	public void setPlainPastNEgative(String plainPastNegative) {
		this.plainPastNegative = plainPastNegative;
	}
	
	//Constructors
	public NegativeVerb(String plainPresentNegative) {
		this.plainPresentNegative = plainPresentNegative;
	}
	
	public NegativeVerb() {}
	
	//Method
	public String createPastNegative(String plainPresentNegative) {
		plainPastNegative = plainPresentNegative.substring(0,(plainPresentNegative.length()-1)) + "katta";
		return plainPastNegative;
	}	
}
