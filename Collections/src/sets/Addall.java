package sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Addall {
	public static void main(String args[]) {
		Set<Integer>obj=new LinkedHashSet<Integer>();
		obj.add(5);
		obj.add(15);
		obj.add(25);
		obj.add(35);
		System.out.println(obj);
    ArrayList<Integer> obj1= new ArrayList<Integer>();
        obj1.add(0);
        obj1.add(10);
        obj1.add(20);
        obj1.add(30);
        obj.addAll(obj1);   
       System.out.println(obj);
        
    
	}

}