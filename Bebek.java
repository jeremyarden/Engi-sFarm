package animal;

import game.Map;
import game.Renderable;
import product.DuckEgg;
import product.DuckMeat;
import product.FarmProduct;

public class Bebek extends FarmAnimal implements MeatAnimal, EggAnimal, Renderable {
    protected DuckEgg telurBebek;
    protected DuckMeat dagingBebek;
    
    Bebek() {
        telurBebek = new DuckEgg();
        dagingBebek = new DuckMeat();
        letak.setX(2);
        letak.setY(2);
    } ///ctor
    
    public void Talk() {
        System.out.println("kwek");
        telurBebek.addAmount();
    } ///bebek mengeluarkan suara "kwek"
    
    public boolean isBebekDead() {
        return (super.getHungryCountdown() < 1);
    } ///penanda bebek hidup atau mati
    
    public DuckEgg getTelurBebek() {
        return telurBebek;
    } ///getter produk telur bebek
    
    public DuckMeat getDagingBebek() {
        return dagingBebek;
    } ///getter produkk daging bebek
    
    public void render(Map m) {
        m.setMapEl(letak.getX(),letak.getY(),'D');
    }

	@Override
	public Boolean isEggAnimal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean isMeatAnimal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public FarmProduct getEgg() {
		// TODO Auto-generated method stub
		return telurBebek;
	}

	@Override
	public FarmProduct getMeat() {
		// TODO Auto-generated method stub
		return dagingBebek;
	}
}