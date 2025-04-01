package setDemo;

import java.util.*;  

// This open source code exemplifies HashSet class that implements SET Interface.
//Uses a hash table for storage and ONLY UNIQUE items are stored.
//NO DUPLICATES

public class HashSetDemo{  
public static void main(String args[]){  
	
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("Perth");  
set.add("Pembroke"); 
set.add("Perth");  
set.add("Gananoque");  

// Going through the elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
System.out.println("Just showing an example of HASHSET");
}  
}  