class Kambing extends FarmAnimal implements MeatAnimal, MilkAnimal {
    protected Beef dagingSapi; ///produk yang dihasilkan berupa beef
    protected CowMilk susuSapi; ///produk yang dihasilkan berupa susu sapi
    
    Sapi() {
        susuSapi("susuSapi",4000,0);
        dagingSapi("dagingSapi",6000,1);
        letak.setX(5);
        letak.setY(3);
    } ///ctor
    
    void Talk() {
        printf("moo");
        susuSapi.addAmount();
    } ///sapi mengeluarkan suara "moo"
    
    bool isSapiDead() {
        return (super.getHungryCountdown() < 1);
    } ///penanda sapi hidup atau mati
    
    Beef getDagingSapi() {
        return dagingSapi;
    } ///getter daging sapi
    
    CowMilk getSusuSapi() {
        return susuSapi;
    } ///getter susu sapi
    
    void render(Map m) {
        m.setMapEl(letak.getX(),letak.getY(),'S');
    }    
}