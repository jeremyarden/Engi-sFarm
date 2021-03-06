package animal;

import game.Map;
import product.Beef;
import product.CowMilk;
import product.FarmProduct;

public class Sapi extends FarmAnimal implements MeatAnimal, MilkAnimal {
    protected Beef dagingSapi; ///produk yang dihasilkan berupa beef
    protected CowMilk susuSapi; ///produk yang dihasilkan berupa susu sapi
    
    public Sapi() {
        susuSapi = new CowMilk();
        dagingSapi = new Beef();
        letak.setX(5);
        letak.setY(3);
    } ///ctor
    
    void Talk() {
        System.out.println("moo");
        susuSapi.addAmount();
    } ///sapi mengeluarkan suara "moo"
    
    boolean isSapiDead() 
    {
        return (super.getHungryCountdown() < 1);
    } ///penanda sapi hidup atau mati
    
    Beef getDagingSapi() {
        return dagingSapi;
    } ///getter daging sapi
    
    CowMilk getSusuSapi() {
        return susuSapi;
    } ///getter susu sapi
    
    public void render(Map m) {
        m.setMapEl(letak.getX(),letak.getY(),'S');
    }

	@Override
	public boolean isMilkAnimal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isMeatAnimal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public FarmProduct getMilk() {
		// TODO Auto-generated method stub
		return susuSapi;
	}

	@Override
	public FarmProduct getMeat() {
		// TODO Auto-generated method stub
		return dagingSapi;
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