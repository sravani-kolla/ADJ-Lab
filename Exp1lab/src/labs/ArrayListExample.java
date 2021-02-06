package labs;
import java.util.*;
public class ArrayListExample {
 public static void main(String args[]) {
 ArrayList<String> obj = new ArrayList<String>();
 obj.add("Sravani");
 obj.add("Harshini");
 obj.add("Lalitha");
 obj.add("Kalyani");
 obj.add("Amulya");
 System.out.println("Currently the array list has following elements:"+obj);
 obj.add(0, "Rahul");
 obj.add(1, "Ravan");
 obj.remove("Chaitanya");
 obj.remove("Harshu");
 System.out.println("Current array list is:"+obj);
 obj.remove(1);
 System.out.println("Current array list is:"+obj);
 }
} 