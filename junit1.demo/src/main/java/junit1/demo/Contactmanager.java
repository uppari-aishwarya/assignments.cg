package junit1.demo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Contactmanager {
	
	Map<String, Contact> contactlist= new HashMap<String, Contact>();
   
	public void addContact(String firstName, String lastName, String phone) {
		
		Contact contact = new Contact (firstName,lastName,phone);
		ValidateContact(contact);
		contactlist.put("first", contact);	
	}
	
	public Collection<Contact> getAllContacts(){
		return contactlist.values();
	}

	private void ValidateContact(Contact contact) {
		
		contact.validateFirstName();
		contact.validateLastName();
		contact.validatePhone();		
	}

}
