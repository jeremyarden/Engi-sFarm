class Bebek extends FarmAnimal implements MeatAnimal, EggAnimal {
    protected DuckEgg telurBebek;
    protected DuckMeat dagingBebek;
    
    Bebek() {
        telurBebek("telurBebek",3000,0);
        dagingBebek("dagingBebek",4000,1);
        letak.setX(2);
        letak.setY(2);
    } ///ctor
    
    public void Talk() {
        printf("kwek");
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
}