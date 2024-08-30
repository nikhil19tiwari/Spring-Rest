package in.pwskill.nikhil;

 class Book{
	private String title;
	private String author;
	private Double price;
	Book(){
		// Default Constructor
	}
	Book(String title,String author){
		this.author= author;
		this.title = title;
		}
	Book(String title,String author,Double price){
		this.author= author;
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
 }
public class Test {
 public static void main(String []args) {
	 
	 Book b = new Book("MicroServices","Khushi",15000.0);
	 System.out.println("The author name is  ::"+b.getAuthor());
	 System.out.println("The title name is ::"+b.getTitle());
	 System.out.println("the price of this cource is ::"+b.getPrice());
 }
}
