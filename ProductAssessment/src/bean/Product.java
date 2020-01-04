package bean;

public class Product {
	private int id;
	private String name;
	private double price;
	private String categoy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategoy() {
		return categoy;
	}
	public void setCategoy(String categoy) {
		this.categoy = categoy;
	}
	public Product(int id, String name, double price, String categoy) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.categoy = categoy;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", categoy=" + categoy + "]";
	}
	
	
}
