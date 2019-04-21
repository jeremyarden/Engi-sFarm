package product;
import java.util.List;
import java.util.Vector; 
public abstract class SideProduct extends Product
{
	protected Vector<Product>recipe;
	
	/**
	 * Constructor user-defined yang akan dipakai oleh anak-anak SideProduct
	 * @param name
	 * @param price
	 * @param amount
	 */
	SideProduct(String name, int price, int amount) 
	{
		super(name, price, amount);
		recipe = new Vector<Product>();
	}
	/**
	 * Method yang memeriksa jika sebuah SideProduct dapat dibuat dari list bahan yang diberikan
	 * @return Jika ingredient yang dipersiapkan sesuai resep mengembalikan true
	 */
	public boolean isRecipe(List<Product> ingredients)
	{
		boolean correct;
		correct = true;
		int iterRec, iterCan;
		iterRec = 0;
		iterCan = 0;
		while(iterCan < ingredients.size() && correct)
		{
			if(iterRec < recipe.size())
			{
				if(ingredients.get(iterCan).getProdName().equals(recipe.get(iterRec).getProdName()))
				{
					iterCan++;
					iterRec = 0;
				}
				else
				{
					iterRec++;
				}
			}
			else
			{
				correct = false;
			}
		}
		
		return correct;
	}
	
}
