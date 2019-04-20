package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import game.Map;
import jdk.jfr.Timestamp;

import java.io.FileNotFoundException;

import animal.FarmAnimal;

public class TestFarmAnimal {
    private FarmAnimal FA;

    @Test
    public void TesCtor() {
        FA = new FarmAnimal();
        assertEquals("Tes hungry countdown",5,FA.getHungryCountdown());
        assertEquals("Tes letak X",0,letak.getX());
        assertEquals("Tes letak Y",0,letak.getY());
    }

    @Test
    public void TesIsHungry() {
        FA = new FarmAnimal();
        assertEquals("Tes isHungry",false,FA.isHungry());
    }

    @Test
    public void TesGetHungryCountDown() {
        FA = new FarmAnimal();
        assertEquals("Tes getHungryCountdown",5,FA.getHungryCountdown());
    }
}