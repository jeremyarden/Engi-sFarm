package cell;

import game.Map;
import game.Renderable;

public interface Cell extends Renderable
{
	/**
	 * Semua yang mengimplementasikan cell harus bisa merender
	 */
	public void render(Map m);
	/**
	 * @return Tipe Cell yang akan diinteraksikan, 1 untuk Land dan 2 untuk Facility
	 */
	public int cellType();
}
