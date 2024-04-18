package Day2;

import java.util.HashMap;

public class HashMapprac {

	public static void main(String[] args) {
		// Syntax
        HashMap <String, String> capitals = new HashMap<String, String>();
        
        //add items  .put()
        
        
        capitals.put("Bangladesh","DhaKa") ;
        capitals.put("USA","Washinton DC") ;
        capitals.put("India","ND") ;
        capitals.put("Swiss","Bern") ;
        capitals.put("Germaney","Berlin") ;
        
        System.out.println(capitals);
        
        //access an item .get()
        
    System.out.println(capitals.get("USA"));
    
    // remove an item .remove()
    
    capitals.remove("USA");  
    System.out.println(capitals);
    
    // to clear 
    
    //to find the size  .size()
		
    System.out.println(capitals.size());
    
    // Loop both type
	}

}
