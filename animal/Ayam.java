package animal;
import product.ChickenMeat;
import product.FarmProduct;
import product.ChickenEgg;
import game.Map;
import game.Renderable; 

public class Ayam extends FarmAnimal implements MeatAnimal, EggAnimal, Renderable {
    protected ChickenEgg telurAyam; ///produk yang  dihasilkan berupa telur ayam
    protected ChickenMeat dagingAyam; ///produk yang dihasilkan berupa daging ayam
    
    public Ayam() {
        telurAyam = new ChickenEgg();
        dagingAyam = new ChickenMeat();
        letak.setX(0);
        letak.setY(0);
    }
    public void Talk() {
        System.out.println("petok petok");
        telurAyam.addAmount();
    }
    public boolean isAyamDead() {
        return (super.getHungryCountdown() < 1);
    }
    public ChickenEgg getTelurAyam() {
        return telurAyam;
    } ///getter produk telur ayam
    
    public ChickenMeat getDagingAyam() {
        return dagingAyam;
    } ///getter produkk daging ayam
    
    public void render(Map m) { 
        m.setMapEl(letak.getX(),letak.getY(),'C');
    }
	@Override
	public boolean isEggAnimal() {
		return true;
	}
	@Override
	public boolean isMeatAnimal() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public FarmProduct getEgg() {
		// TODO Auto-generated method stub
		return telurAyam;
	}
	@Override
	public FarmProduct getMeat() {
		// TODO Auto-generated method stub
		return dagingAyam;
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
