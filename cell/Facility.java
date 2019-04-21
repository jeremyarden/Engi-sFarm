package cell;

import game.Player;

public interface Facility extends Cell
{
	/**
	 * Harus diimpletasikan interact ketika berinteraksi
	 * dengan player
	 */
	public void interact(Player p);
}
