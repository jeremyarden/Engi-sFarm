package game;

import java.util.ArrayList;

import product.Product;


public class Player implements Renderable
{
	private final int START_X = 5;
	private final int START_Y = 5;
	private final int CAPACITY = 10;
	
	private Point letak;
	private int money;
	private int water;
	private ArrayList<Product> backpack;
	
	public Player()
	{
		letak = new Point(START_X, START_Y);
		money = 0;
		water = 0;
		backpack = new ArrayList<Product>();
	}
	
	public int getMoney()
	{
		return money;
	}
	
	public int getWater()
	{
		return water;
	}
	
	public int getBackpackAmt()
	{
		return backpack.size();
	}
	
	public int getBackpackCap()
	{
		return CAPACITY;
	}
	
	public Point getLetak()
	{
		return letak;
	}
	
	public Product getItemAt(int idx)
	{
		return backpack.get(idx);
	}
	
	public Product getItem(String name)
	{
		int i = 0;
		while(!backpack.get(i).getProdName().equals(name) && i<backpack.size()-1)
		{
			i++;
		}
		if(backpack.get(i).getProdName().equals(name))
		{
			return backpack.get(i);
		}
		else
		{
			System.out.println("Not Found");
			return null;
		}
	}
	
	public void addWater(int amt)
	{
		water+=amt;
	}
	
	public void addMoney(int amt)
	{
		money+=amt;
	}
	
	public void addItem(Product e)
	{
		backpack.add(e);
	}
	
	public void removeItem(String name)
	{
		int i = 0;
		while(!backpack.get(i).getProdName().equals(name) && i<backpack.size()-1)
		{
			i++;
		}
		if(backpack.get(i).getProdName().equals(name))
		{
			backpack.remove(i);
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	
	public void move(String dir, Map m)
	{
		switch(dir)
		{
			case "UP":
				if(letak.getX()-1>=0)
				{
					letak.setX(letak.getX()-1);
				}
				else
				{
					System.out.println("Can't go there");
				}
				break;
			case "RIGHT":
				if(letak.getY()+1 < m.getMapWidth())
				{
					letak.setY(letak.getY()+1);
				}
				else
				{
					System.out.println("Can't go there");
				}
				break;
			case "DOWN":
				if(letak.getX()+1 < m.getMapLength())
				{
					letak.setX(letak.getX()+1);
				}
				else
				{
					System.out.println("Can't go there");
				}
				break;
			case "LEFT":
				if(letak.getY()-1>=0)
				{
					letak.setY(letak.getY()-1);
				}
				else
				{
					System.out.println("Can't go there");
				}
				break;
		}
	}
	
	@Override
	public void render(Map m) 
	{
		m.setMapEl(letak.getX(),letak.getY(),'F');
	}

}
