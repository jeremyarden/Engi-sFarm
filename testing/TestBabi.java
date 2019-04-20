package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import game.Map;

import java.io.FileNotFoundException;

import animal.Babi;

public class TestBabi {
    private Babi babi;

    @Test
    public void tesCtor() {
        babi = new Babi();
        assertEquals("Tes Name of Daging","dagingBabi",babi.getDagingBabi().getProdName());
        assertEquals("Tes Price of Daging",5000,babi.getDagingBabi().getProdPrice());
        assertEquals("Tes amount of Daging",1,babi.getDagingBabi().getProdAmount());
        assertEquals("Tes posisi X",8,babi.getPosisiX());
        assertEquals("Tes posisi Y",2,babi.getPosisiY());
    }
    
    @Test
    public void tesIsBabiDead() {
        babi = new Babi();
        assertEquals("Tes isBabiDead",false,babi.isBabiDead());
    }

    @Test
    public void tesGetMeat() {
        babi = new Babi();
        assertEquals("Tes Name of Daging","dagingBabi",babi.getDagingBabi().getProdName());
        assertEquals("Tes Price of Daging",5000,babi.getDagingBabi().getProdPrice());
        assertEquals("Tes amount of Daging",1,babi.getDagingBabi().getProdAmount());
    }

    @Test
    public void tesIsMeatAnimal() {
        babi = new Babi();
        assertEquals("Tes isMeatAnimal",true,babi.isMeatAnimal());
    }

    @Test
    public void tesGetPosisiX() {
        babi = new Babi();
        assertEquals("Tes posisi X",8,babi.getPosisiX());
    }

    @Test
    public void tesGetPosisiY() {
        babi = new Babi();
        assertEquals("Tes posisi Y",2,babi.getPosisiY());
    }

    @Test
    public void tesRender() throws FileNotFoundException {
        babi = new Babi();
        Map m = new Map("/Users/abiyyuismunandar/Documents/OOP/TUBES/Engi's Farm/Peta/peta.txt");
        babi.render(m);
        assertEquals("Tes render",'P',m.getMapEl(babi.getPosisiX(),babi.getPosisiY()));
    }
}