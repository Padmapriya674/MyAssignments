package week1day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library lib= new Library();

String bookTitle = lib.addBook("Happy Books");
lib.addBook(bookTitle);
lib.issueBook();
System.out.println(bookTitle);
 
}

}
	
