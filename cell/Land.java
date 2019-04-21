package cell;

public interface Land extends Cell
{
	/**
	 * Memberi tahu jika suatu petak land sudah diberi air dan muncul
	 * @return True jika Land sudah pernah diberi air
	 */
	public boolean isGrass();
	/**
	 * Merubah status grass menjadi true
	 */
	public void watered();
	/**
	 * Merubah status grass menjadi false
	 */
	public void eaten();
	
	public int getX();
	
	public int getY();
	
}
