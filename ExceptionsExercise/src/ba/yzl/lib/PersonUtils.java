package ba.yzl.lib;

import ba.yzl.model.Person;

public class PersonUtils {
	
	public static String getPeronFullName(Person person) {
		if(person == null) {
			throw new NullPointerException("person reference is null");
		}
		
		return person.getName();
	}

}
