package product;

public class ChickenCordonBleu extends SideProduct
{

	public ChickenCordonBleu() {
		super("ChickenCordonBleu", 12000, 1);
		recipe.add(new CowMilk()); 
		recipe.add(new ChickenMeat());
		recipe.add(new CowCheese()); 
		// TODO Auto-generated constructor stub
	}
	
}
