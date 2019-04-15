class Kelinci extends FarmAnimal implements MeatAnimal {
    protected RabbitMeat dagingKelinci; ///produk yang dihasilkan berupa daging kelinci
    
    Kelinci() {
        dagingKelinci("dagingKelinci",4000,1);
        letak.setX(6);
        letak.setY(6);
    } ///ctor
    
    public void Talk() {
        printf("cit cit");
    } ///kelinci berbicara "cit cit"
    
    public boolean isKelinciDead() {
        return (super.getHungryCountdown() < 1);
    } ///penanda kelinci hidup atau mati
    
    public RabbitMeat getDagingKelinci() {
        return dagingKelinci;
    } ///getter daging kelinci
    
    public void render() {
        //Map::setMapEl(letak.getX(),letak.getY(),"R");
    }
}