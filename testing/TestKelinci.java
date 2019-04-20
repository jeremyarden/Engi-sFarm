package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import game.Map;

import java.io.FileNotFoundException;

import animal.Babi;
import animal.Kelinci;;

public class TestKelinci {
    private Kelinci kelinci;

    @Test
    public void tesCtor() {
        kelinci = new Kelinci();
        assertEquals("Tes Name of Daging","dagingKelinci",kelinci.getMeat().getProdName());
        assertEquals("Tes Price of Daging",4000,kelinci.getMeat().getProdPrice());
        assertEquals("Tes amount of Daging",1,kelinci.getMeat().getProdAmount());
        assertEquals("Tes posisi X",6,kelinci.getPosisiX());
        assertEquals("Tes posisi Y",6,kelinci.getPosisiY());
    }

    @Test
    public void tesIsKelinciDead() {
        kelinci = new Kelinci();
        assertEquals("Tes isBabiDead",false,kelinci.isKelinciDead());
    }

    @Test
    public void tesMeat() {
        kelinci = new Babi();
        assertEquals("Tes Name of Daging","dagingBabi",kelinci.getDagingBabi().getProdName());
        assertEquals("Tes Price of Daging",4000,kelinci.getDagingBabi().getProdPrice());
        assertEquals("Tes amount of Daging",1,kelinci.getDagingBabi().getProdAmount());
    }

    @Test
    public void tesIsMeatAnimal() {
        kelinci = new Kelinci();
        assertEquals("Tes isMeatAnimal",true,kelinci.isMeatAnimal());
    }

    @Test
    public void tesGetPosisiX() {
        kelinci = new Kelinci();
        assertEquals("Tes posisi X",6,kelinci.getPosisiX());
    }

    @Test
    public void tesGetPosisiY() {
        kelinci = new Kelinci();
        assertEquals("Tes posisi Y",6,kelinci.getPosisiY());
    }

    @Test
    public void tesRender() throws FileNotFoundException {
        kelinci = new Babi();
        Map m = new Map("/Users/abiyyuismunandar/Documents/OOP/TUBES/Engi's Farm/Peta/peta.txt");
        kelinci.render(m);
        assertEquals("Tes render",'P',m.getMapEl(kelinci.getPosisiX(),kelinci.getPosisiY()));
    }
}