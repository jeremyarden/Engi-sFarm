package game;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import cell.Barn;
import cell.Coop;
import cell.Grassland;
import cell.Land;
import cell.Mixer;
import cell.Truck;
import cell.Well;
public class Map 
{
	@SuppressWarnings("unused")
	private final int MAP_LENGTH = 10;
	private final int MAP_WIDTH = 11;
	private char [][] map;
	private char [][] oriMap;
	private ArrayList<Land> eatable;
	private Renderable [] [] entity;
	
	public char [][] getMap()
	{
		return map;
	}
	
	public char [][] getOriMap()
	{
		return map;
	}
	
	public ArrayList<Land> getEatb()
	{
		return eatable;
	}
	
	public Renderable [] [] getEnti()
	{
		return entity;
	}
	public Map(String filename) throws FileNotFoundException
	{
		Scanner inp = new Scanner(new File(filename));
		map = new char[MAP_LENGTH][MAP_WIDTH];
		oriMap = new char[MAP_LENGTH][MAP_WIDTH];
		entity = new Renderable[MAP_LENGTH][MAP_WIDTH];
		eatable = new ArrayList<Land>();
		String in;
		int row = 0,col = 0;
		while(inp.hasNextLine())
		{
			in = inp.nextLine();
			while(col<in.length())
			{
				map[row][col] = in.charAt(col);
				oriMap[row][col] = in.charAt(col);
				switch (in.charAt(col))
                {
                    case 'o':
                        entity[row][col] = (new Coop(row,col));
                        eatable.add(new Coop(row,col));
                        break;
                    case '-':
                        entity[row][col] = (new Grassland(row,col));
                        eatable.add(new Grassland(row,col));
                        break;
                    case 'x':
                        entity[row][col] = (new Barn(row,col)); 
                        eatable.add(new Barn(row,col));
                        break;
                    case 'T':
                        entity[row][col] = ( new Truck(row,col));
                        break;
                    case 'M':
                        entity[row][col] = (new Mixer(row,col));
                        break;
                    case 'W':
                        entity[row][col] = (new Well(row,col));
                        break;
                    default:
                        break;
                }
				col++;
			}
			row++;
			col = 0;
		}
		inp.close();
	}
	
	public void drawMap()
	{
		  for(int i = 0;i<MAP_LENGTH;i++)
		    {
		        for(int j = 0;j<MAP_WIDTH;j++)
		        {
		            System.out.print(map[i][j]);
		        }
		        System.out.println();
		    }
	}
	
	public Land getLandPos(int x,int y)
	{
		int i;
		boolean found = false;
		i = 0;
		while(i<eatable.size() && !found)
		{
			found = eatable.get(i).getX() == x && eatable.get(i).getY() == y;
			if(!found)
			{
				i++;
			}
		}
		return eatable.get(i);
	}
	
	public void resetMap()
	{
		for(int i = 0;i<MAP_LENGTH;i++)
		{
			for(int j = 0; j<MAP_WIDTH;j++)
			{
				map[i][j] = oriMap[i][j];
			}
		}
	}
	
	public int getMapLength()
	{
		return MAP_LENGTH;
	}
	
	public int getMapWidth()
	{
		return MAP_WIDTH;
	}
	
	public char getMapEl(int i,int j)
	{
		if(goodIdx(i,j))
		{
			return map[i][j];
		}
		else
		{
			return '\0';
		}
	}
	
	public char getOriMapEl(int i,int j)
	{
		if(goodIdx(i,j))
		{
			return oriMap[i][j];
		}
		else
		{
			return '\0';
		}
	}
	
	public void setMapEl(int i,int j, char El)
	{
		if(goodIdx(i,j))
		{
			map[i][j] = El;
		}
	}
	
	public Renderable getEntity(int i,int j)
	{
		if(goodIdx(i,j))
		{
			return entity[i][j];
		}
		else
		{
			return null;
		}
	}
	
	public void setEntity(int i, int j, Renderable r)
	{
		if(goodIdx(i,j))
		{
			entity[i][j] = r;
		}
	}
	
	private boolean goodIdx(int i, int j)
	{
		return i>=0 && j >= 0 && i<MAP_LENGTH && j < MAP_WIDTH;
	}
}
