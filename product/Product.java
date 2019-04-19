package product;

public abstract class Product 
{
	/**
	 * Atribut-Atribut Product
	 */
	private String name;
	private int price;
	private int amount;
	
	/**
	 * User-defined constructor yang nanti akan dipakai untuk oleh kelas turunan Product
	 * @param name
	 * @param price
	 * @param amount
	 */
	Product(String name, int price, int amount)
	{
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	public String getProdName()
	{
		return name;
	}
	
	public int getProdPrice()
	{
		return price;
	}
	
	public int getProdAmount()
	{
		return amount;
	}
	
	public void setProdName(String n)
	{
		this.name = n;
	}
	
	public void setProdPrice(int p)
	{
		this.price = p;
	}
	/**
	 * Menambah banyak product sebanyak satu
	 */
	public void addAmount()
	{
		this.amount++;
	}
	
	
	
	
}
