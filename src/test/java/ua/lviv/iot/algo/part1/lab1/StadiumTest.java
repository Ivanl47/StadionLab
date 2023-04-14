package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ToString

class StadiumTest {
    Stadium stadium;
    Stadium stadium2;
    @BeforeEach
    void setUp()
    {
        stadium = new Stadium(15, "Ukraine", 400, 200, 400, 200, "a", "b", List.of(SportTypes.FOOTBALL));
        stadium2 = new Stadium(124, "Arena Lviv", 2000, 1200, 2000, 1200, "d", "c", List.of(SportTypes.FOOTBALL));
    }

    @Test
    void testAddAttendies() {
        stadium.addAttendies(100);
        assertEquals(300, stadium.getCurrentAttadance());

        stadium2.addAttendies(30000);
        assertEquals(300, stadium.getCurrentAttadance());
    }

    @Test
    void testDecreaseAttendance() {
        stadium.decreaseAttendance(100);
        assertEquals(200, stadium.getCurrentAttandance());

        stadium2.decreaseAttendance(30000);
        assertEquals(1200, stadium2.getCurrentAttandance());
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