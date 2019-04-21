package cell;

import game.Map;
import game.Player;
import game.Point;
import product.Product;

public class Truck implements Facility
{
	private Point letak;
	private final int capacity = 5; 
	private Product [] load;
	private int amount;
	private int awayTime;
	private final int cellType = 2;
	
	public Truck(int x, int y)
	{
		letak = new Point(x,y);
		load = new Product[capacity];
		amount = 0;
		awayTime = 5;
	}
	
	@Override
	public void render(Map m) 
	{
		m.setMapEl(letak.getX(),letak.getY(),'T');
		awayTime = (awayTime<5)? ++awayTime : awayTime;
	}

	@Override
	public int cellType() 
	{
		return cellType;
	}

	@Override
	public void interact(Player p) 
	{
		String item = null;
		int i,sum;
		sum = 0;
		String choice = null;
		if(amount < capacity)
		{
			System.out.println("What would you like to sell?");
			//Item diberi input 
			load[amount] = p.getItem(item);
			p.removeItem(item);
			amount++;
		}
		else
		{
			System.out.println("The truck is full!");
		}
		System.out.println("Sell all item?");
		//choice diberi input
		if(choice.toUpperCase() == "YES")
		{
			for(i = 0;i<capacity;i++)
			{
				sum+=load[i].getProdPrice();
			}
		}
		p.addMoney(sum);
	}

}
