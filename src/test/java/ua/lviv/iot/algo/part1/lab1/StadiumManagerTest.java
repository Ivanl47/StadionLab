package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

class StadiumManagerTest {
    Stadium stadium;
    Stadium stadium2;
    StadiumManager manager;
    @BeforeEach
    void setUp(){
        stadium = new Stadium(0 ,"A", 1000, 200, 1000, 200, "team a", "team b", List.of(SportTypes.FOOTBALL));
        stadium2 = new Stadium(244 ,"B", 1200, 200, 1200, 200, "team c", "team d", List.of(SportTypes.FOOTBALL));
        StadiumManager manager = new StadiumManager();
    }

    @Test
    void testAddStadium() {
        manager.addStadium(stadium);
        manager.addStadium(stadium2);
        assertEquals(2, manager.getStadiums().size());
    }

    @Test
    public void testFindAllStadiumsWithShowers() {
        manager.addStadium(stadium);
        manager.addStadium(stadium2);
        assertEquals(1, manager.findAllStadiumsWithShowers().size());
    }

    @Test
    void findAllStadiumsWithCapacityMoreThan() {
        manager.addStadium(stadium);
        manager.addStadium(stadium2);
        assertEquals(1, manager.findAllStadiumsWithCapacityMoreThan(1100).size());
    }
}