package product;

public class GoatCheese extends SideProduct
{
	GoatCheese()
	{
		super("kejuKambing",4500,1);
		recipe.add(new GoatMilk());	
	}
}