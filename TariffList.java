package lab6col;

// STUDENT STARTER CODE FILE

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

		/**
		 * You will start your implementation by first printing out each list provided to you.
		 * 
		 * TO DO 1: IMPLEMENT a solution where the:
		 * 
		 * list2 is added into list1 and then releasing list2 from memory
		 */
		
		//print out the original list1
		printList(list1);

		//print out the original list2
		printList(list2);

		/**
		 * TO DO 1: IMPLEMENT a solution where the:
		 * 
		 * list2 is added into list1 and then releasing list2 from memory
		 */
		
		//start here by writing your code to add list2 to list1
		
		list1.addAll(list2);

		list2 = null;
		tariffsCAN = null;

		//your code ends here
		
		//printout the two lists (list1 and list2 added together in list1)
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

	/**
	 * TO DO 2: IMPLEMENT a solution where the:
	 * 
	 * printList() will print the list passed as a parameter using the iterator.
	 * @param list a list of Strings
	 */

	//Start your code here
	public static void printList(List<String> list) {
	 Iterator<String> it = list.iterator();
	 while(it.hasNext()){
		System.out.println(it.next());
	 }
	}
	//Your code stops here.


	/**
	 * TO DO 3: IMPLEMENT a solution where the:
	 * 
	 * printSortedList() will take a list of Strings as parameter and
	 * sort the list in alphabetical order, and then call printList()
	 * @param list a list of Strings
	 */
	
	//Start your code here
	public static void printSortedList(List<String> list) {
		Collections.sort(list);
		printList(list);
	}
	//Your code stops here.

	/**
	 * TO DO 4: IMPLEMENT a a solution where the:
	 * 
	 * removeFromList() will take a list of Strings, and two integers representing
	 * the indexes in which the method will remove, including AND between,
	 * and then call the printList()
	 * @param list a list of Strings
	 * @param begin an int representing the index the method will remove FIRST
	 * @param finish an int representing the index AFTER the LAST index being removed
	 */
	
	//Start your code here
	public static void removeFromList(List<String> list, int begin, int finish) {
		list.subList(begin, finish +1).clear();
		printList(list);
	}
	//Your code stops here.
	

	/**
	 * TO DO 5: IMPLEMENT a solution where the:
	 * 
	 * printNonDuplicates() takes a list as a parameter, and turns it into a
	 * LinkedHashSet to remove any duplicates, and then prints out the contents using
	 * an iterator
	 * @param list a list of Strings
	 */
	
	//Start your code here
	public static void printNonDuplicates(List<String> list) {
		Set<String> set=new LinkedHashSet<>(list); 

		Iterator<String> itr=set.iterator();

		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
	//Your code stops here.

}





