package product;

public class ChickenCordonBleu extends SideProduct
{

	ChickenCordonBleu() {
		super("ChickenCordonBleu", 12000, 1);
		recipe.add(new CowMilk()); 
		recipe.add(new ChickenMeat());
		recipe.add(new CowCheese()); 
		// TODO Auto-generated constructor stub
	}
	
}
