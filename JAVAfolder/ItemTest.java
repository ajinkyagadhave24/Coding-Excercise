abstract class item {
	private int id;
	private String title;
	private int copies;

	public item(int id, String title, int copies) {
		this.id = id;
		this.title = title;
		this.copies = copies;
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getCopies() {
		return copies;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
	}
	public void checkIn()
	{
		System.out.println("Welcome to Library");
	}
	public void checkOut()
	{
		System.out.println("Have a good day");
	}	
}

abstract class WrittenItem extends item
{
	private String authorname;

	public WrittenItem(int id, String title, int copies,String authorname) {
		super(id, title, copies);
		this.authorname=authorname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	@Override
	public String toString() {
		return "WrittenItem [authorname="+ authorname + " toString()=" + super.toString() + "]";
	}

	
}

class Book extends WrittenItem
{
	public Book(int id, String title, int copies, String authorname) {
		super(id, title, copies, authorname);
	}	
	
}


public class ItemTest {
	public static void main(String []args)
	{
		item i;
		i=new JournalPaper(100,"SJP",100,"ABC",2014);
		System.out.println(i);
	}
}
