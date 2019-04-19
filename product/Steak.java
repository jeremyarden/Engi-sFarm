package product;

public class Steak extends SideProduct
{
	Steak()
	{
		super("Steak",8000,1);
		recipe.add(new Beef());
	}
}
