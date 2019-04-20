package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import game.Map;

import java.io.FileNotFoundException;

import animal.Ayam;

public class TestAyam  {
    private Ayam ayam;
    
    @Test
    public void tesCtor() {
        ayam = new Ayam();
        assertEquals("Tes Name of Telur","telurAyam",ayam.getTelurAyam().getProdName());
        assertEquals("Tes Price of Telur",2000,ayam.getTelurAyam().getProdPrice());
        assertEquals("Tes amount of Telur",0,ayam.getTelurAyam().getProdAmount());
        assertEquals("Tes Name of Daging","dagingAyam",ayam.getDagingAyam().getProdName());
        assertEquals("Tes Price of Daging",3000,ayam.getDagingAyam().getProdPrice());
        assertEquals("Tes amount of Daging",1,ayam.getDagingAyam().getProdAmount());
        assertEquals("Tes posisi X",0,ayam.getPosisiX());
        assertEquals("Tes posisi Y",0,ayam.getPosisiY());
    }
    
    @Test
    public void tesTalk() {
        ayam = new Ayam();
        ayam.Talk();
        assertEquals("Tes amount of Telur",1,ayam.getTelurAyam().getProdAmount());
    }
    
    @Test
    public void tesIsEggAnimal() {
        ayam = new Ayam();
        assertEquals("Tes isEggAnimal",true,ayam.isEggAnimal());
    }

    @Test
    public void tesIsMeatAnimal() {
        ayam = new Ayam();
        assertEquals("Tes isMeatAnimal",true,ayam.isMeatAnimal());
    }

    @Test
    public void tesIsAyamDead() {
        ayam = new Ayam();
        assertEquals("Tes isAyamDead",false,ayam.isAyamDead());
    }

    @Test
    public void tesGetEgg() {
        ayam = new Ayam();
        assertEquals("Tes Name of Telur","telurAyam",ayam.getTelurAyam().getProdName());
        assertEquals("Tes Price of Telur",2000,ayam.getTelurAyam().getProdPrice());
        assertEquals("Tes amount of Telur",0,ayam.getTelurAyam().getProdAmount());
    }

    @Test
    public void tesGetMeat() {
        ayam = new Ayam();
        assertEquals("Tes Name of Daging","dagingAyam",ayam.getDagingAyam().getProdName());
        assertEquals("Tes Price of Daging",3000,ayam.getDagingAyam().getProdPrice());
        assertEquals("Tes amount of Daging",1,ayam.getDagingAyam().getProdAmount());
    }

    @Test
    public void tesGetPosisiX() {
        ayam = new Ayam();
        assertEquals("Tes posisi X",0,ayam.getPosisiX());
    }

    @Test
    public void tesGetPosisiY() {
        ayam = new Ayam();
        assertEquals("Tes posisi Y",0,ayam.getPosisiY());
    }

    @Test
    public void tesRender() throws FileNotFoundException {
        ayam = new Ayam();
        Map m = new Map("/Users/abiyyuismunandar/Documents/OOP/TUBES/Engi's Farm/Peta/peta.txt");
        ayam.render(m);
        assertEquals("Tes render",'C',m.getMapEl(ayam.getPosisiX(),ayam.getPosisiY()));
    }
}