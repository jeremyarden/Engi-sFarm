package cell;

import java.util.List;


import game.Map;
import game.Player;
import game.Point;
import product.ChickenCordonBleu;
import product.CowCheese;
import product.GoatCheese;
import product.Product;
import product.SideProduct;
import product.Steak;

public class Mixer implements Facility
{
	private Point letak;
	private final int cellType = 2;
	
	public Mixer(int x,int y)
	{
		letak = new Point(x,y);
	}

	@Override
	public void render(Map m) 
	{
		m.setMapEl(letak.getX(),letak.getY(),'M');
	}

	@Override
	public int cellType() 
	{
		return cellType;
	}

	@Override
	public void interact(Player p) 
	{
		System.out.println("Use the mix command to interact with me");
	}
	
	public SideProduct mix(List<Product> ingredients)
	{
		ChickenCordonBleu rec1 = new ChickenCordonBleu();
		CowCheese rec2 = new CowCheese();
		GoatCheese rec3 = new GoatCheese();
		Steak rec4 = new Steak();
		if(rec1.isRecipe(ingredients))
		{
			System.out.println("You made Chicken Cordon Bleu");
			return rec1;
		}
		else if(rec2.isRecipe(ingredients))
		{
			System.out.println("You made Cow Cheese");
			return rec2;
		}
		else if(rec3.isRecipe(ingredients))
		{
			System.out.println("You made Goat Cheese");
			return rec3;
		}
		else if(rec4.isRecipe(ingredients))
		{
			System.out.println("You made Steak");
			return rec4;
		}
		else
		{
			return null;
		}
	}

}
