package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import game.Map;

import java.io.FileNotFoundException;

import animal.Bebek;

public class TestBebek {
    private Bebek bebek;

    @Test
    public void tesCtor() {
        bebek = new Bebek();
        assertEquals("Tes Name of Telur","telurBebek",bebek.getEgg().getProdName());
        assertEquals("Tes Price of Telur",2000,bebek.getEgg().getProdPrice());
        assertEquals("Tes amount of Telur",0,bebek.getEgg().getProdAmount());
        assertEquals("Tes Name of Daging","dagingBebek",bebek.getMeat().getProdName());
        assertEquals("Tes Price of Daging",3000,bebek.getMeat().getProdPrice());
        assertEquals("Tes amount of Daging",1,bebek.getMeat().getProdAmount());
        assertEquals("Tes posisi X",2,bebek.getPosisiX());
        assertEquals("Tes posisi Y",2,bebek.getPosisiY());
    }

    @Test
    public void tesTalk() {
        bebek = new Bebek();
        bebek.Talk();
        assertEquals("Tes amount of Telur",1,bebek.getEgg().getProdAmount());
    }

    @Test
    public void tesIsBebekDead() {
        bebek = new Bebek();
        assertEquals("Tes isAyamDead",false,bebek.isBebekDead());
    }

    @Test
    public void tesIsEggAnimal() {
        bebek = new Bebek();
        assertEquals("Tes isEggAnimal",true,bebek.isEggAnimal());
    }

    @Test
    public void tesIsMeatAnimal() {
        bebek = new Bebek();
        assertEquals("Tes isMeatAnimal",true,bebek.isMeatAnimal());
    }


    @Test
    public void tesGetEgg() {
        bebek = new Bebek();
        assertEquals("Tes Name of Telur","telurBebek",bebek.GetEgg().getProdName());
        assertEquals("Tes Price of Telur",2000,bebek.GetEgg().getProdPrice());
        assertEquals("Tes amount of Telur",0,bebek.GetEgg().getProdAmount());
    }

    @Test
    public void tesGetMeat() {
        bebek = new Bebek();
        assertEquals("Tes Name of Daging","dagingBebek",bebek.getMeat().getProdName());
        assertEquals("Tes Price of Daging",3000,bebek.getMeat().getProdPrice());
        assertEquals("Tes amount of Daging",1,bebek.getMeat().getProdAmount());
    }

    @Test
    public void tesGetPosisiX() {
        bebek = new Bebek();
        assertEquals("Tes posisi X",2,bebek.getPosisiX());
    }

    @Test
    public void tesGetPosisiY() {
        bebek = new Bebek();
        assertEquals("Tes posisi Y",2,bebek.getPosisiY());
    }

    @Test
    public void tesRender() {
        bebek = new Bebek();
        Map m = new Map("/Users/abiyyuismunandar/Documents/OOP/TUBES/Engi's Farm/Peta/peta.txt");
        bebek.render(m);
        assertEquals("Tes render",'D',m.getMapEl(bebek.getPosisiX(),bebek.getPosisiY()));
    }
}