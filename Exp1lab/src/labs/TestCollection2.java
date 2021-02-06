package labs;
import java.util.Hashtable;
public class TestCollection2 {
	public static void main(String[] args) {
		 Hashtable<Integer, String> ht1 = new Hashtable<>(4); 
	     Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(2); 
	        ht1.put(1, "A"); 
	        ht1.put(2, "B"); 
	        ht1.put(3, "C"); 
	        ht2.put(4, "D"); 
	        ht2.put(5, "E"); 
	        ht2.put(6, "F");  
	        System.out.println("Mappings of ht1 : " + ht1); 
	        System.out.println("Mappings of ht2 : " + ht2); 

	}

}
