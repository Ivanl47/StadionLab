package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Stadium {
    private String name;

    private int capacity;

    private int currentAttadance;

    private String homeTeam;

    private String awayTeam;

    private static Stadium defaultStadium = new Stadium();

    public void addAttendies(int count) {
        this.currentAttadance += count;
        if (currentAttadance > capacity) {
            currentAttadance = capacity;
        }
    }

    public void decreaseAttendance() {
        this.currentAttadance -= 100;
        if (currentAttadance < 0) {
            currentAttadance = 0;
        }
    }

    public void changeHomeTeam(String teamName) {
        this.homeTeam = teamName;
    }

    public void changeAwayTeam(String teamName) {
        this.awayTeam = teamName;
    }


    public static Stadium getInstance() {
        return defaultStadium;
    }

    

    public static void main(String... Args) {
        Stadium[] stadiums = { new Stadium(),
                new Stadium("Ukraine", 788, 42, "dreamTeam", "notDreamTeam"),
                getInstance(),
                getInstance()};
        
        for (Stadium i : stadiums) {
            System.out.println(stadiums);
        }
    }
}
