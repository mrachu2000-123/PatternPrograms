package OopsPrograms;

import java.util.ArrayList;

class BookColl{
	private String title;
	private String author;
	private String isbn;
	private static ArrayList<BookColl> bookCollection = new ArrayList<BookColl>();
	
	BookColl(String title,String author,String isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public static ArrayList<BookColl> getBookCollection() {
		return bookCollection;
	}

	public static void addBook(BookColl book){
		bookCollection.add(book);
	}
	
	public static void removeBook(BookColl book) {
		bookCollection.remove(book);
	}

}

public class Book {
	public static void main(String[] args) {
		BookColl b1 = new BookColl("C Programming", "Dennis Ritchie", "9876434353");
		BookColl b2 = new BookColl("Java Programming", "James Gosling", "91775374443");
		
		BookColl.addBook(b1);
		BookColl.addBook(b2);
		ArrayList<BookColl> bookCollection = BookColl.getBookCollection();
		System.out.println("List of Books");
		for(BookColl b: bookCollection) {
			System.out.println(b.gettitle()+" by "+b.getAuthor()+"  ISBN is "+b.getIsbn());
		}
		
		BookColl.removeBook(b1);
		BookColl b3 =new BookColl("Basic Python", "Guido van Rossum", "6754254625");
		BookColl.addBook(b3);
		System.out.println("\nAfter removing " + b2.gettitle() +":");
		System.out.println("List of Books");
		for(BookColl b: bookCollection) {
			System.out.println(b.gettitle()+" by "+b.getAuthor()+"  ISBN is "+b.getIsbn());
		}
		
		BookColl.addBook(b2);
		System.out.println("\nAfter adding " + b2.gettitle() +":");
		System.out.println("List of Books");
		for(BookColl b: bookCollection) {
			System.out.println(b.gettitle()+" by "+b.getAuthor()+"  ISBN is "+b.getIsbn());
		}
		
	}

}
