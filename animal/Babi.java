package animal;

import game.Map;
import game.Renderable;
import product.FarmProduct;
import product.Pork;

public class Babi extends FarmAnimal implements MeatAnimal, Renderable {
    protected Pork dagingBabi;
    
    public Babi() {
        dagingBabi = new Pork();
        letak.setX(8);
        letak.setY(2);
    } ///ctor
    
    public void Talk() {
        System.out.println("oink");
    } ///babi mengeluarkan suara "oink"
    
    public boolean isBabiDead() {
        return (super.getHungryCountdown() < 1);
    } ///penanda babi hidup atau mati
    
    public Pork getDagingBabi(){
        return dagingBabi; 
    } ///getter produk pork
    
    public void render(Map m) {
        m.setMapEl(letak.getX(),letak.getY(),'P');
    }

	@Override
	public boolean isMeatAnimal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public FarmProduct getMeat() {
		// TODO Auto-generated method stub
		return dagingBabi;
	}
	
	public int getPosisiX() {
		// TODO Auto-generated method stub
		return letak.getX();
	}
	public int getPosisiY() {
		// TODO Auto-generated method stub
		return letak.getY();
	}  
}
