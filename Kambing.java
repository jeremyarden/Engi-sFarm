class Kambing extends FarmAnimal implements MeatAnimal, MilkAnimal {
    protected GoatMilk susuKambing; ///produk yang dihasilkan berupa susu kambing
    protected GoatMeat dagingKambing; ///produk yang dihasilkan berupa daging kambing
    
    Kambing() {
        susuKambing();
        dagingKambing();
        letak.setX(5);
        letak.setY(6);
    } ///ctor
    
    public void Talk() {
        printf("mbek");
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
} 
