package Opps_3;

/*
 *  you have to implement a Library using Java Class " Library "
 *  Methods : addBook, issueBook , returnBook, showAvailableBooks
 *  Properties : Array to store the available books.
 */

class Library{
	String[] books;
	int no_of_books = 0;
	Library(){
		this.books = new String[100];
		this.no_of_books = 0;
	}
	void addBooks(String book) {
		this.books[no_of_books] = book;
		no_of_books ++;
		System.out.println(book+" has been Added !");
	}
	void Show_Available_books() {
		System.out.println("Available Books are : ");
		for(String book : this.books) {
			if(book == null) {
				continue;
			}
			System.out.println("* "+book);
		}
	}
	void issue_book(String book) {
			for(int i=0; i<this.books.length; i++) {
			if(this.books[i] == book) {
				System.out.println("The Book has been Issued");
				this.books[i] = null;
				return;
			}
		}
			System.out.println("This book does not exist");
	}
	void return_book(String book) {
		this.books[no_of_books] = book;
		addBooks(book);
	}
}

public class online_library {
	public static void main(String[] args) {
		Library Central_library = new Library();
		
		Central_library.addBooks("Think and Grow Rich");
		Central_library.addBooks("Algorithm");
		Central_library.addBooks("Data Structue");
		Central_library.addBooks("C and C++");
		Central_library.Show_Available_books();
		
		Central_library.issue_book("Algorithm");
		Central_library.Show_Available_books();
		
		Central_library.return_book("Algorithm");
		Central_library.Show_Available_books();
		
	}
}
