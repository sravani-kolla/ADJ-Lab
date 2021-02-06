package labs;
import java.util.HashMap;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>(); 
        map.put("Sravani", 10); 
        map.put("Kalyani", 30); 
        map.put("Amulya", 20);
        System.out.println("Size of map is:- "+ map.size()); 
        System.out.println(map);
        if (map.containsKey("Sravani")) { 
            Integer a = map.get("Sravani"); 
            System.out.println("value for key"+" \"Sravani\" is:"+ a); 
        } 
		
	}

}
