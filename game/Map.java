package game;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Map 
{
	@SuppressWarnings("unused")
	private final int MAP_LENGTH = 10;
	private final int MAP_WIDTH = 11;
	private char [][] map;
	private char [][] oriMap;
	private ArrayList <Renderable> entity;
	
	public Map(String filename) throws FileNotFoundException
	{
		Scanner inp = new Scanner(new File(filename));
		String in;
		int row = 0,col = 0;
		while(inp.hasNextLine())
		{
			in = inp.nextLine();
			while(col<in.length())
			{
				map[row][col] = in.charAt(col);
				oriMap[row][col] = in.charAt(col);
				/*
				 * Diisi dengan switch statement yang mengisi
				 * Rendeable dengan Cell
				 */
				col++;
			}
			row++;
			col = 0;
		}
		inp.close();
	}
	
	public char getMapEl(int i,int j)
	{
		return map[i][j];
	}
	
	public char getOriMapEl(int i,int j)
	{
		return oriMap[i][j];
	}
	
	public void setMapEl(int i,int j, char El)
	{
		map[i][j] = El;
	}
	
	public Renderable getEntity(int i,int j)
	{
		return entity.get(i*(MAP_WIDTH) + j);
	}
	
	public void setEntity(int i, int j, Renderable r)
	{
		entity.set((i*(MAP_WIDTH) + j), r);
	}
}
