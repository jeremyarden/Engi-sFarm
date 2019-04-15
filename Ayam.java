class Ayam extends FarmAnimal implements MeatAnimal, EggAnimal {
    protected ChickenEgg telurAyam; ///produk yang  dihasilkan berupa telur ayam
    protected ChickenMeat dagingAyam; ///produk yang dihasilkan berupa daging ayam
    
    Ayam() {
        telurAyam("telurAyam",2000,0);
        dagingAyam("dagingAyam",3000,1);
        letak.setX(0);
        letak.setY(0);
    }
    public void Talk() {
        printf("petok petok");
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
}