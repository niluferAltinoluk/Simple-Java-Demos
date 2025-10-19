/******************************************************/
/*                                                    */
/*   PhoneBook.java                                   */
/*                                                    */
/*                                                    */
/*  Implements an PhoneBook of PhoneBookEntries       */
/*  Uses the java.util.ArrayList class                */
/*                                                    */
/*   Constructor                                      */
/*   PhoneBook(int c)                                 */
/* creates an empty phone book with c  capacity       */
/*   phoneBook()                                      */
/*  creates an empty phone book with default capacity */
/*                                                    */
/*  Public methods                                    */
/*  int addEntry(PhoneBookEntry pe)                   */
/*    adds to the phone book if possible (duplicates  */
/*   allowed!) returns 0 on success and -1 on failure */
/*                                                    */
/*  phoneEntry find(String name)                      */
/*  finds the entry for a given name or null if       */
/*  no such entry.                                    */
/*                                                    */
/******************************************************/

import java.util.*;  

public class PhoneBook {

	private ArrayList<PhoneBookEntry> book;
        private int capacity;
	private final static int DEFAULT = 2;
	private int size;

	public PhoneBook(){
		capacity = DEFAULT;
		book = new ArrayList<PhoneBookEntry>(DEFAULT);
		size = 0;
	}

	public PhoneBook(int c){
		capacity = c;
		book = new ArrayList<PhoneBookEntry>(c);
		size = 0;
	}

        public void addEntry(PhoneBookEntry pbe){

		size++;
		book.add(pbe);

	}

	
	public PhoneBookEntry find(String nm){
                
                 for (int i=0; i < size; i++) {
		    if (book.get(i).getName().equals(nm)) 
			    return new PhoneBookEntry(book.get(i));
		}
		return null;
	}

       public String toString(){

	        String str ="";
                for (int i=0; i < size; i++) {
		   if (i == size-1) 
                      str += book.get(i);
                   else   
                      str += book.get(i) + ",";
			    
		}
		return str;
	}
	
}
