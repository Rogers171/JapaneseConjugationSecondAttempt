/**
 * @author Adell - amrogers5
 * CIS175 - Fall 2022
 * Sep 18, 2022
 */
package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Models.NegativeVerb;

public class NegativeVerbTest {
	NegativeVerb negativeVerb = new NegativeVerb("tabenai"); //Tabenai means "to not eat", it is the negative of "taberu", 'to eat'
	
	@Before
	public void setUp () throws Exception {}
	
	@Test
	public void test() {
		assertEquals("tabenakatta", negativeVerb.createPastNegative(negativeVerb.getPlainPresentNegative()));
	}

}
