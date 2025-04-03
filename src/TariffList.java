/* Luna Von Besser
 * 041165988
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


/**This is the Lab 6 named TariffList.java
*
* @author Student's Name
* Class Description:
* TariffList has one method(main) which contains methods to perform different operations
* on two lists of tariffs imposed by US and the retaliation by Canada. 
* These are created with the contents from two arrays.
*/


public class TariffList {

	/**
	 * Ensure that you read all content and comments in this code so that you can be clear 
	 * on what to do.
	 * Consult your theory slides as much as possible to see implementation examples.
	 * Remember to clean up your code from TO DO statements, and also include Javadoc comments. 
	 *  
	 * The main method has two arrays that with contents that are put into one list.
	 * There are four methods which perform actions on the List. These methods are:
	 * 
	 * printList() will take a list of Strings as a parameter, and print the contents using iterator
	 * 
	 * removeFromList() will take a list, and two ints, and remove items from the list
	 * 					at the indexes of the two int parameters
	 * printSortedList() will take a list and sort the Strings by alphabetical order
	 * 					 by the first letter of each string
	 * printNonDuplicates() will take a list, and remove duplicates from it, and 
	 * 						 then print the contents 
	 * @param String[] args empty string array
	 */
	public static void main(String[] args) {

		// add tariffsUS to list1
		String[] tariffsUS = {"oil", "steel", "cars", "lumber", "aluminium", "dairy"};
		List<String> list1 = new LinkedList<>(Arrays.asList(tariffsUS));


		// add tariffsCAN to list2
		String[] tariffsCAN = {"oil", "dairy", "electricty", "alcohol", "lithium", "lumber"};
		List<String> list2 = Arrays.asList(tariffsCAN);
		
		//print out the original list1
		System.out.printf("%nI am printing list 1.%n");
		printList(list1);

		//print out the original list2
		System.out.printf("%nI am printing list 2.%n");
		printList(list2);
		
		list1.addAll(list2);

		list2 = null;
		tariffsCAN = null;

		
		
		//printout the two lists (list1 and list2 added together in list1)
		System.out.printf("%nI am printing list 1 with list appended.%n");
		printList(list1);


		//Remove (list without tariffs 3 to 5)
		System.out.printf("%nI am deleting tariffs 3 to 5 now...%n");
		removeFromList(list1, 3, 5);


		//printing current list
		System.out.printf("%nThis is the current list of tariffs after deleting tariffs...%n");
		printList(list1);

		System.out.println();


		//list sorted in alphabetical order
		System.out.printf("%nThese are the Sorted tariffs in an alphabetical order...%n");
		printSortedList(list1);


		//list contents with no more duplicates
		System.out.printf("%nI am removing the duplicate tariffs now...%n");
		printNonDuplicates(list1);
	}

	
	public static void printList(List<String> list) {
	 Iterator<String> it = list.iterator();
	 while(it.hasNext()){
		System.out.println(it.next());
	 }
	}

	public static void printSortedList(List<String> list) {
		Collections.sort(list);
		printList(list);
	}


	

	public static void removeFromList(List<String> list, int begin, int finish) {
		list.subList(begin, finish +1).clear();
		printList(list);
	}

	
	
	
	public static void printNonDuplicates(List<String> list) {
		Set<String> set=new LinkedHashSet<>(list); 

		Iterator<String> itr=set.iterator();

		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}


}





