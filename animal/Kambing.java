package animal;

import game.Map;
import game.Renderable;
import product.FarmProduct;
import product.GoatMeat;
import product.GoatMilk;

public class Kambing extends FarmAnimal implements MeatAnimal, MilkAnimal, Renderable {
    protected GoatMilk susuKambing; ///produk yang dihasilkan berupa susu kambing
    protected GoatMeat dagingKambing; ///produk yang dihasilkan berupa daging kambing
    
    Kambing() {
        susuKambing = new GoatMilk();
        dagingKambing = new GoatMeat();
        letak.setX(5);
        letak.setY(6);
    } ///ctor
    
    public void Talk() {
        System.out.println("mbek");
        susuKambing.addAmount();
    } ///kambing mengeluarkan suara "mbek"
    
    public boolean isKambingDead() {
        return (super.getHungryCountdown() < 1);
    } ///penanda kambing hidup atau mati
            
    public GoatMilk getSusuKambing() {
        return susuKambing;
    } ///getter susu kambing
    
    public GoatMeat getDagingKambing() {
        return dagingKambing;
    } ///getter daging kambing
    
    public void render(Map m) {
        m.setMapEl(letak.getX(),letak.getY(),'G');
    }

	@Override
	public Boolean isMilkAnimal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean isMeatAnimal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public FarmProduct getMilk() {
		// TODO Auto-generated method stub
		return susuKambing;
	}

	@Override
	public FarmProduct getMeat() {
		// TODO Auto-generated method stub
		return dagingKambing;
	}
} 