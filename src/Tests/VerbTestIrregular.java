/**
 * @author Adell - amrogers5
 * CIS175 - Fall 2022
 * Sep 18, 2022
 */
package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Models.Verb;

public class VerbTestIrregular {
	Verb verb = new Verb("iku", "ikimasu");
	
	@Before
	public void setUP () throws Exception {}
	
	@Test
	public void test() {
		verb.setVerbType(verb.determineVerbType(verb.getDictionaryForm(), verb.getMasuForm()));
		assertEquals("itta", verb.createTaForm(verb.getDictionaryForm(), verb.getVerbType()));
	}
	
	@Test
	public void testVerbTypeNotNull() {
		assertNotNull(verb.determineVerbType(verb.getDictionaryForm(), verb.getMasuForm()));
	}
	
	@Test
	public void testTaFormFalse() {
		assertFalse(verb.getDictionaryForm().equals(verb.getTaForm()));
	}

}
