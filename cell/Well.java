package cell;

import game.Map;
import game.Player;
import game.Point;

public class Well implements Facility
{
	private Point letak;
	private final int addWater = 5;
	private final int cellType = 2;

	public Well(int x, int y)
	{
		letak = new Point(x,y);
	}
	@Override
	public void render(Map m) 
	{
		m.setMapEl(letak.getX(), letak.getY(), 'W');
	}

	@Override
	public int cellType() {
		// TODO Auto-generated method stub
		return cellType;
	}

	@Override
	public void interact(Player p) 
	{
		p.addWater(addWater);
		System.out.println("Added water "+addWater);
	}

}
