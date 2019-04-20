import junit.framework.*;
import game.Map;
import animal.Ayam;

public class TestAyam extends TestCase {
    private Ayam ayam;

    public void tesCtor() {
        ayam = new Ayam();
        assertEquals("Tes Name of Telur","telurAyam",ayam.getTelurAyam().name);
        assertEquals("Tes Price of Telur",2000,ayam.getTelurAyam().price);
        assertEquals("Tes amount of Telur",0,ayam.getTelurAyam().amount);
        assertEquals("Tes Name of Daging","dagingAyam",ayam.getDagingAyam().name);
        assertEquals("Tes Price of Daging",3000,ayam.getDagingAyam().price);
        assertEquals("Tes amount of Daging",1,ayam.getDagingAyam().amount);
        assertEquals("Tes posisi X",0,ayam.getPosisiX());
        assertEquals("Tes posisi Y",0,ayam.getPosisiY());
    }

    public void tesTalk() {
        ayam = new Ayam();
        ayam.Talk();
        assertEquals("Tes amount of Telur",1,ayam.getTelurAyam().amount);
    }

    public void tesIsEggAnimal() {
        ayam = new Ayam();
        assertEquals("Tes isEggAnimal",true,ayam.isEggAnimal());
    }

    public void tesIsMeatAnimal() {
        ayam = new Ayam();
        assertEquals("Tes isMeatAnimal",true,ayam.isMeatAnimal());
    }

    public void tesIsAyamDead() {
        ayam = new Ayam();
        assertEquals("Tes isAyamDead",false,ayam.isAyamDead());
    }

    public void tesGetEgg() {
        ayam = new Ayam();
        assertEquals("Tes Name of Telur","telurAyam",ayam.getTelurAyam().name);
        assertEquals("Tes Price of Telur",2000,ayam.getTelurAyam().price);
        assertEquals("Tes amount of Telur",0,ayam.getTelurAyam().amount);
    }

    public void tesGetMeat() {
        ayam = new Ayam();
        assertEquals("Tes Name of Daging","dagingAyam",ayam.getDagingAyam().name);
        assertEquals("Tes Price of Daging",3000,ayam.getDagingAyam().price);
        assertEquals("Tes amount of Daging",1,ayam.getDagingAyam().amount);
    }

    public void tesGetPosisiX() {
        ayam = new Ayam();
        assertEquals("Tes posisi X",0,ayam.getPosisiX());
    }

    public void tesGetPosisiY() {
        ayam = new Ayam();
        assertEquals("Tes posisi Y",0,ayam.getPosisiY());
    }

    public void tesRender() {
        ayam = new Ayam();
        Map m;
        ayam.render(m);
        assertEquals("Tes render",'C',m.getMapEl(ayam.getPosisiX(),ayam.getPosisiY()));
    }
}