package com.library.calling;

import com.library.details.Library;

public class LibraryCaller {
	public static void main(String[] args) {
		Library lib = new Library();
		 String name1 = lib.libraryName = "Central City Library";
	        String loc1 = lib.location = "Sector 12, Mumbai";
	        int books1 = lib.totalBooks = 45000;
	        String librarian1 = lib.librarianName = "Mrs. Kavita Sharma";
	        boolean public1 = lib.isPublic = true;

	        System.out.println("Library Name: " + lib.libraryName);
	        System.out.println("Location: " + lib.location);
	        System.out.println("Total Books: " + lib.totalBooks);
	        System.out.println("Librarian Name: " + lib.librarianName);
	        System.out.println("Is Public: " + lib.isPublic);
	    
	}

}
