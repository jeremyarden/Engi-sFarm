package animal;

import game.Map;
import product.FarmProduct;
import product.RabbitMeat;

public class Kelinci extends FarmAnimal implements MeatAnimal {
    protected RabbitMeat dagingKelinci; ///produk yang dihasilkan berupa daging kelinci
    
    public Kelinci() {
        dagingKelinci = new RabbitMeat();
        letak.setX(6);
        letak.setY(6);
    } ///ctor
    
    public void Talk() {
        System.out.println("cit cit");
    } ///kelinci berbicara "cit cit"
    
    public boolean isKelinciDead() {
        return (super.getHungryCountdown() < 1);
    } ///penanda kelinci hidup atau mati
    
    public RabbitMeat getDagingKelinci() {
        return dagingKelinci;
    } ///getter daging kelinci
    
    public void render(Map m) {
        m.setMapEl(letak.getX(),letak.getY(),'R');
    }

	@Override
	public boolean isMeatAnimal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public FarmProduct getMeat() {
		// TODO Auto-generated method stub
		return dagingKelinci;
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