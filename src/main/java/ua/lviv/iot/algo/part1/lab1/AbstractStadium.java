package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AbstractStadium {
    private int numberOfShowers;
    private String name;
    private int capacity;
    private int currentAttandance;

    public abstract List<SportTypes> getSupportedSports();

    public String getHeaders() {
        return "number of showers, name, capacity, current attandance";
    }

    public String toCSV() {
        return numberOfShowers + ", " + name + ", " + capacity + ", "
                + currentAttandance;
    }
}
