package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import game.Map;
import jdk.jfr.Timestamp;

import java.io.FileNotFoundException;

import animal.Kambing;

public class TestKambing {
    private Kambing kambing;

    @Test
    public void tesCtor() {
        kambing = new Kambing();
        assertEquals("Tes Name of Susu","susuKambing",kambing.getMilk().getProdName());
        assertEquals("Tes Price of Susu",4000,kambing.getMilk().getProdPrice());
        assertEquals("Tes amount of Susu",0,kambing.getMilk().getProdAmount());
        assertEquals("Tes Name of Daging","dagingKambing",kambing.getMeat().getProdName());
        assertEquals("Tes Price of Daging",5000,kambing.getMeat().getProdPrice());
        assertEquals("Tes amount of Daging",1,kambing.getMeat().getProdAmount());
        assertEquals("Tes posisi X",5,kambing.getPosisiX());
        assertEquals("Tes posisi Y",6,kambing.getPosisiY());
    }

    @Test
    public void tesTalk() {
        kambing = new Kambing();
        kambing.Talk();
        assertEquals("Tes amount of Susu",1,kambing.getMilk().getProdAmount());
    }

    @Test
    public void tesIsKambingDead() {
        kambing = new Kambing();
        assertEquals("Tes isKambingDead",false,kambing.isKambingDead());
    }

    @Test
    public void tesIsMilkAnimal() {
        kambing = new Kambing();
        assertEquals("Tes isMilkAnimal",true,kambing.isMilkAnimal());
    }

    @Test
    public void tesIsMeatAnimal() {
        kambing = new Kambing();
        assertEquals("Tes isMeatAnimal",true,kambing.isMeatAnimal());
    }

    @Test
    public void tesGetSusuKambing() {
        kambing = new Kambing();
        assertEquals("Tes Name of Susu","susuKambing",kambing.getMilk().getProdName());
        assertEquals("Tes Price of Susu",4000,kambing.getMilk().getProdPrice());
        assertEquals("Tes amount of Susu",0,kambing.getMilk().getProdAmount());
    }

    @Test
    public void tesGetDagingKambing() {
        kambing = new Kambing();
        assertEquals("Tes Name of Daging","dagingKambing",kambing.getMeat().getProdName());
        assertEquals("Tes Price of Daging",5000,kambing.getMeat().getProdPrice());
        assertEquals("Tes amount of Daging",1,kambing.getMeat().getProdAmount());
    }

    @Test
    public void tesGetPosisiX() {
        kambing = new Kambing();
        assertEquals("Tes posisi X",5,kambing.getPosisiX());
    }

    @Test
    public void tesGetPosisiY() {
        kambing = new Kambing();
        assertEquals("Tes posisi Y",6,kambing.getPosisiY());
    }

    @Test
    public void tesRender() {
        kambing = new Kambing();
        Map m = new Map("/Users/abiyyuismunandar/Documents/OOP/TUBES/Engi's Farm/Peta/peta.txt");
        bebek.render(m);
        assertEquals("Tes render",'G',m.getMapEl(kambing.getPosisiX(),kambing.getPosisiY()));
    }
}