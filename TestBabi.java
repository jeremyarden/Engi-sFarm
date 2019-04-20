import junit.framework.TestCase;
import game.Map;
import animal.Babi;

public class TestBabi extends TestCase {
    private Babi babi;

    public void tesCtor() {
        babi = new Babi();
        assertEquals("Tes Name of Daging","dagingAyam",babi.getDagingBabi().name);
        assertEquals("Tes Price of Daging",3000,babi.getDagingBabi().price);
        assertEquals("Tes amount of Daging",1,babi.getDagingBabi().amount);
        assertEquals("Tes posisi X",8,babi.getPosisiX());
        assertEquals("Tes posisi Y",2,babi.getPosisiY());
    }

    public void tesIsBabiDead() {
        babi = new Babi();
        assertEquals("Tes isBabiDead",false,babi.isBabiDead());
    }

    public void tesMeat() {
        babi = new Babi();
        assertEquals("Tes Name of Daging","dagingAyam",babi.getDagingBabi().name);
        assertEquals("Tes Price of Daging",3000,babi.getDagingBabi().price);
        assertEquals("Tes amount of Daging",1,babi.getDagingBabi().amount);
    }

    public void tesIsMeatAnimal() {
        babi = new Babi();
        assertEquals("Tes isMeatAnimal",true,babi.isMeatAnimal());
    }

    public void tesGetPosisiX() {
        babi = new Babi();
        assertEquals("Tes posisi X",0,babi.getPosisiX());
    }

    public void tesGetPosisiY() {
        babi = new Babi();
        assertEquals("Tes posisi Y",0,babi.getPosisiY());
    }

    public void tesRender() {
        babi = new Babi();
        babi.render(m);
        assertEquals("Tes render",'P',m.getMapEl(babi.getPosisiX(),babi.getPosisiY()));
    }
}