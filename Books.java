
public class Books {
	int serialNo;
	String bookName;
	String author;
	double price;
	String publication;
	
	
	public void setBookDetails(int no, String bname, String au, double p, String pub)
	{
		serialNo=no;
		bookName=bname;
		author=au;
		price=p;
		publication=pub;
	}
	
	public void printBooksDetails()
	{
		System.out.println("===========Books===========");
		System.out.println("Serial no: "+serialNo);
		System.out.println("Book name: "+bookName);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
		System.out.println("Publication: "+publication);
	}
}
