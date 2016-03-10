/**
 * 
 */
package Cisc181.Practice3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Cisc181.Exceptions.InsufficientFundsException;

/**
 * @author Konark
 *
 */
public class AccountTest {
	Account a;
	Account b;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a = new Account();
		b = new Account(1122, 20000, 4.5);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		try {
			b.widthdraw(2500);
		} catch (InsufficientFundsException e) {
			fail();
		}
		b.deposit(3000);
		assertEquals("Balance", b.getBalance(), 20500, .1);
		System.out.println(b.getBalance());
	}

	@Test
	public void testGetters() {
		assertEquals("Returns 0", a.getAnnualInterest(), 0, .1);
		assertEquals("Returns 0", a.getId(), 0);
		System.out.println(a.getDateCreated());
	}
}