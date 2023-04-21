package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StadiumManagerTest {
    StadiumManager manager;
    @BeforeEach
    void setUp() {
        System.out.println("Hello");
        StadiumManager manager = new StadiumManager();
        manager.addStadium(new Stadium());
        manager.addStadium(new PaintballStadium());
    }

    @Test
    void testAddStadium() {
        StadiumManager manager1 = new StadiumManager();
        manager1.addStadium(new Stadium());
        manager1.addStadium(new PaintballStadium());
        assertEquals(2, manager.getStadiums().size());
    }

    @Test
    public void testFindAllStadiumsWithShowers() {
        assertEquals(1, manager.findAllStadiumsWithShowers().size());
    }

    @Test
    public void findAllStadiumsWithCapacityMoreThan() {
        assertEquals(1, manager.findAllStadiumsWithCapacityMoreThan(1100).size());
    }
}