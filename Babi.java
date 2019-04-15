class Babi extends FarmAnimal implements MeatAnimal {
    protected Pork dagingBabi;
    
    Babi() {
        dagingBabi("dagingBabi",5000,1);
        letak.setX(8);
        letak.setY(2);
    } ///ctor
    
    public void Talk() {
        printf("oink");
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
}