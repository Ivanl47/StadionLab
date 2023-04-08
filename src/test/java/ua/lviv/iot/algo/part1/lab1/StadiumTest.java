package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ToString

class StadiumTest {

    Stadium stadium = new Stadium(15,
            "Ukraine", 400,
            200, 400,
            200, "a",
            "b", List.of(SportTypes.FOOTBALL));
    Stadium stadium2 = new Stadium(124,
            "Arena Lviv", 2000,
           1200, 2000,
            1200, "d", "c",
            List.of(SportTypes.FOOTBALL));

    @Test
    void testAddAttendies() {
        stadium.addAttendies(100);
        assertEquals(300, stadium.getCurrentAttadance());

        stadium2.addAttendies(30000);
        assertEquals(stadium2.getCapacity(), stadium.getCurrentAttadance());
    }

    @Test
    void testDecreaseAttendance() {
        stadium.decreaseAttendance(100);
        assertEquals(100, stadium.getCurrentAttandance());

        stadium2.decreaseAttendance(30000);
        assertEquals(0, stadium2.getCurrentAttandance());
    }
    @Test
    void testChangeHomeTeam() {
        stadium.changeHomeTeam("A");
        assertEquals("A", stadium.getHomeTeam());

    }

    @Test
    void changeAwayTeam() {
        stadium.changeAwayTeam("B");
        assertEquals("B", stadium.getAwayTeam());
    }
}