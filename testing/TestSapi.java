package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import game.Map;
import jdk.jfr.Timestamp;

import java.io.FileNotFoundException;

import animal.Sapi;

public class TestSapi {
    private Sapi sapi;

    @Test
    public void tesCtor() {
        sapi = new Sapi();
        assertEquals("Tes Name of Susu","susuSapi",sapi.getMilk().getProdName());
        assertEquals("Tes Price of Susu",4000,sapi.getMilk().getProdPrice());
        assertEquals("Tes amount of Susu",0,sapi.getMilk().getProdAmount());
        assertEquals("Tes Name of Daging","dagingSapi",sapi.getMeat().getProdName());
        assertEquals("Tes Price of Daging",6000,sapi.getMeat().getProdPrice());
        assertEquals("Tes amount of Daging",1,sapi.getMeat().getProdAmount());
        assertEquals("Tes posisi X",5,sapi.getPosisiX());
        assertEquals("Tes posisi Y",3,sapi.getPosisiY());
    }

    @Test
    public void tesTalk() {
        sapi = new Sapi();
        sapi.Talk();
        assertEquals("Tes amount of Susu",1,sapi.getSusuSapi().getProdAmount());
    }

    @Test
    public void tesIsSapiDead() {
        sapi = new Sapi();
        assertEquals("Tes isSapiDead",false,sapi.isSapiDead());
    }

    @Test
    public void tesIsMilkAnimal() {
        sapi = new Sapi();
        assertEquals("Tes isMilkAnimal",true,sapi.isMilkAnimal());
    }

    @Test
    public void tesIsMeatAnimal() {
        sapi = new Sapi();
        assertEquals("Tes isMeatAnimal",true,sapi.isMeatAnimal());
    }

    @Test
    public void tesGetSususapi() {
        sapi = new Sapi();
        assertEquals("Tes Name of Susu","susuSapi",sapi.getMilk().getProdName());
        assertEquals("Tes Price of Susu",4000,sapi.getMilk().getProdPrice());
        assertEquals("Tes amount of Susu",0,sapi.getMilk().getProdAmount());
    }

    @Test
    public void tesgetMeat() {
        sapi = new Sapi();
        assertEquals("Tes Name of Daging","dagingSapi",sapi.getMeat().getProdName());
        assertEquals("Tes Price of Daging",6000,sapi.getMeat().getProdPrice());
        assertEquals("Tes amount of Daging",1,sapi.getMeat().getProdAmount());
    }

    @Test
    public void tesGetPosisiX() {
        sapi = new Sapi();
        assertEquals("Tes posisi X",5,sapi.getPosisiX());
    }

    @Test
    public void tesGetPosisiY() {
        sapi = new Sapi();
        assertEquals("Tes posisi Y",6,sapi.getPosisiY());
    }

    @Test
    public void tesRender() {
        sapi = new Sapi();
        Map m = new Map("/Users/abiyyuismunandar/Documents/OOP/TUBES/Engi's Farm/Peta/peta.txt");
        bebek.render(m);
        assertEquals("Tes render",'S',m.getMapEl(sapi.getPosisiX(),sapi.getPosisiY()));
    }
}