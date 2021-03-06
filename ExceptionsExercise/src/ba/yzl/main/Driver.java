package ba.yzl.main;

import ba.yzl.lib.PersonUtils;
import ba.yzl.model.Person;

public class Driver {

	public static void main(String[] args) {
		Person person = null; 
		
		//person.getName(); // null pointer exception .. olmayan bir instance ustune method cagiriyoruz
		
		//catch bloklari ozelden genele dogru yazilir
		
		
		try { // exception olusturabilecek durumlari koyariz try icine.. akis devam ettirilir
			
			System.out.println(" before exception");
			
			//int result = 5 / 0;
			
		PersonUtils.getPeronFullName(person);
		
		System.out.println(" after exception");
		}
		catch (NullPointerException e){
			
			//exception handler ,, hata olustu ,, hatanin ustesinden burda gelinir.
			System.out.println("person is null , try again");
		} 
		catch (Exception e) {
			// catch zincirleri 
			
			System.out.println(" general exception");
			
			
		}   
		
		System.out.println("main thread cont.");
		
	}
	
	

}
