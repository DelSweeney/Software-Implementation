
package ie.lyit.testers;

import ie.lyit.serialize.BookSerializer;
import ie.lyit.serialize.book.Menu;

public class BookSerializerTester {

	public static void main(String[] args) {
		BookSerializer bookSerializer = new BookSerializer();
/*		
		// Add two records to the ArrayList
		bookSerializer.add();
		bookSerializer.add();
				
		// Write the ArrayList to File
		bookSerializer.writeRecordsToFile();
*/
		
		// Read the ArrayList from the File
		// this Deserializes ArrayList
		bookSerializer.readRecordsFromFile();
		
		//create menu object
		Menu meuObj = new Menu();
		
		
		
		bookSerializer.writeRecordsToFile();
		
		// List all the books in the ArrayList
		bookSerializer.list();
	}
}
