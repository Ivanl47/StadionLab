package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.List;


@ToString(callSuper = true)
@Setter
@Getter
@NoArgsConstructor
public class Stadium extends AbstractStadium {
    private int capacity;

    private int currentAttadance;

    private String homeTeam;

    private String awayTeam;
    private List<SportTypes> supportedSports;
    public String getHeaders() {
        return super.getHeaders() + ", home team, away team";
    }

    public String toCSV() {
        return super.toCSV() + ", " + homeTeam + ", " + awayTeam;
    }


    public Stadium(int numberOfShowers, String name, int capacity, int currentAttandance,
                   int capacity1, int currentAttadance, String homeTeam, String awayTeam,
                   List<SportTypes> supportedSports) {
        super(numberOfShowers, name, capacity, currentAttandance);
        this.capacity = capacity1;
        this.currentAttadance = currentAttadance;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.supportedSports = supportedSports;
    }

    public void addAttendies(int count) {
        this.currentAttadance += count;
        if (currentAttadance > capacity) {
            currentAttadance = capacity;
        }
    }

    public void decreaseAttendance(int count) {
        this.currentAttadance -= 100;
        if (currentAttadance < 0) {
            currentAttadance = 0;
        }
    }


    @Override
    public List<SportTypes> getSupportedSports() {
        return List.of(SportTypes.FOOTBALL);
    }

    public void changeHomeTeam(String teamName) {
        this.homeTeam = teamName;
    }

    public void changeAwayTeam(String teamName) {
        this.awayTeam = teamName;
    }


}
