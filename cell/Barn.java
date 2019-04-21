package cell;

import game.Map;
import game.Point;

public class Barn implements Land
{
	private boolean grass;
	private Point letak;
	private final int cellType = 1;
	public Barn(int x, int y)
	{
		letak = new Point(x,y);
		grass = false;
	}
	
	@Override
	public void render(Map m)
	{
		m.setMapEl(letak.getX(), letak.getY(), grass? '*' : 'x');
	}

	@Override
	public int cellType() 
	{
		return cellType;
	}

	@Override
	public boolean isGrass() {
		// TODO Auto-generated method stub
		return grass;
	}

	@Override
	public void watered() 
	{
		grass = true;
	}

	@Override
	public void eaten() 
	{
		grass = false;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return letak.getX();
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return letak.getY();
	}

}
