import junit.framework.TestCase;

public class TestBebek extends TestCase {
    private Bebek bebek;

    public void tesCtor() {
        bebek = new Bebek();
        assertEquals("Tes Name of Telur","telurBebek",bebek.getTelurBebek().name);
        assertEquals("Tes Price of Telur",2000,bebek.getTelurBebek().price);
        assertEquals("Tes amount of Telur",0,bebek.getTelurBebek().amount);
        assertEquals("Tes Name of Daging","dagingBebek",bebek.getDaginBebekm().name);
        assertEquals("Tes Price of Daging",3000,bebek.getDagingBebek().price);
        assertEquals("Tes amount of Daging",1,bebek.getDagingBebek().amount);
        assertEquals("Tes posisi X",2,bebek.getPosisiX());
        assertEquals("Tes posisi Y",2,bebek.getPosisiY());
    }

    public void tesTalk() {
        bebek = new Bebek();
        bebek.Talk();
        assertEquals("Tes amount of Telur",1,bebek.getTelurBebek().amount);
    }

    public void tesIsBebekDead() {
        bebek = new Bebek();
        assertEquals("Tes isAyamDead",false,bebek.isBebekDead());
    }

    public void tesGetTelurBebek() {
        bebek = new Bebek();
        assertEquals("Tes Name of Telur","telurBebek",bebek.getTelurBebek().name);
        assertEquals("Tes Price of Telur",2000,bebek.getTelurBebek().price);
        assertEquals("Tes amount of Telur",0,bebek.getTelurBebek().amount);
    }

    public void tesGetDagingBebek() {
        bebek = new Bebek();
        assertEquals("Tes Name of Daging","dagingBebek",bebek.getDagingBebek().name);
        assertEquals("Tes Price of Daging",3000,bebek.getDagingBebek().price);
        assertEquals("Tes amount of Daging",1,bebek.getDagingBebek().amount);
    }

    public void tesGetPosisiX() {
        bebek = new Bebek();
        assertEquals("Tes posisi X",0,bebek.getPosisiX());
    }

    public void tesGetPosisiY() {
        bebek = new Bebek();
        assertEquals("Tes posisi Y",0,bebek.getPosisiY());
    }

    public void tesRender() {
        bebek = new Bebek();
        bebek.render(m);
        assertEquals("Tes render",'D',m.getMapEl(bebek.getPosisiX(),bebek.getPosisiY()));
    }
}