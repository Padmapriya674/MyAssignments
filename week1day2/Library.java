package week1day2;

public class Library 
      {		
String addBook(String Manifestation)
{
	System.out.println("Book added successfully");
	return Manifestation;
}
void issueBook()	
{
	System.out.println("Book issued successfully");
}

public static void main(String[] args)
{
	Library ab= new Library();
	String Manifestation= ab.addBook("HELLO");
			ab.issueBook();
	
}
}