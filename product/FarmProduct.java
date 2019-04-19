package product;

public abstract class FarmProduct extends Product
{
	/**
	 * Constructor user-defined yang akan dipakai oleh anak-anak FarmProduct
	 * @param name
	 * @param price
	 * @param amount
	 */
	FarmProduct(String name, int price, int amount) 
	{
		super(name, price, amount);
	}

}
