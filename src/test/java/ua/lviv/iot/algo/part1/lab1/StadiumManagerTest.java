package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

class StadiumManagerTest {
    @Test
    void testAddStadium() {
        StadiumManager manager = new StadiumManager();
        Stadium stadium = new Stadium(333, "A", 2000, 1000, 2000, 1000, "team A", "team B", List.of(SportTypes.FOOTBALL) );
        Stadium stadium2 = new Stadium(444, "B", 3000, 1000, 3000, 1000, "team C", "team D", List.of(SportTypes.FOOTBALL));
        manager.addStadium(stadium);
        manager.addStadium(stadium2);
        assertEquals(2, manager.getStadiums().size());

    }

    @Test
    public void testFindAllStadiumsWithShowers() {
        StadiumManager manager = new StadiumManager();
        AbstractStadium stadium = new Stadium(0 ,"A", 1000, 200, 1000, 200, "team a", "team b", List.of(SportTypes.FOOTBALL));
        AbstractStadium stadium2 = new Stadium(244 ,"B", 1000, 200, 1000, 200, "team c", "team d", List.of(SportTypes.FOOTBALL));
        manager.addStadium(stadium);
        manager.addStadium(stadium2);
        assertEquals(1, manager.findAllStadiumsWithShowers().size());


    }


    @Test
    void findAllStadiumsWithCapacityMoreThan() {
        StadiumManager manager = new StadiumManager();
        AbstractStadium stadium = new Stadium(0 ,"A", 1000, 200, 1000, 200, "team a", "team b", List.of(SportTypes.FOOTBALL));
        AbstractStadium stadium2 = new Stadium(244 ,"B", 1200, 200, 1200, 200, "team c", "team d", List.of(SportTypes.FOOTBALL));
        manager.addStadium(stadium);
        manager.addStadium(stadium2);
        assertEquals(1, manager.findAllStadiumsWithCapacityMoreThan(1100).size());

    }
}