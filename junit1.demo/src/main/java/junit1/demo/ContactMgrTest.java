package junit1.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ContactMgrTest {
	
	@Test
	public void shouldCreateContact(){
		
		/*Contactmanager cm= new Contactmanager();
		cm.addContact("Ram", "Prasad", "032435464");
		assertFalse(cm.getAllContacts().isEmpty());
		assertEquals(1,cm.getAllContacts().size());
		*/
	@Test
		public void newTest() {
			System.out.println("Insude new Test");
			int sum= 8+9;
			assertEquals(17,sum);
			}
		
		@BeforeAll
		public static void init() {
			System.out.println("This method will run first");
		}
		
		@ParameterizedTest
		@ValueSource(Strings = {"rail","teli","mali"})
		public void endsWithI(String str) {
			assertTrue(str.endsWith("i"));
		}
	}

	

}

