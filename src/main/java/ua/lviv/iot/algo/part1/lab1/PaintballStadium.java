package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString(callSuper = true)
public class PaintballStadium extends AbstractStadium {
    public int numberOfCovers;

    public PaintballStadium(int numberOfShowers, String name, int capacity, int currentAttandance, int numberOfCovers) {
        super(numberOfShowers, name, capacity, currentAttandance);
        this.numberOfCovers = numberOfCovers;
    }
    public String getHeaders() {
        return super.getHeaders() + ", number oj covers";
    }

    public String toCSV() {
        return super.toCSV() + ", " + numberOfCovers;
    }

    @Override
    public List<SportTypes> getSupportedSports() {
        return List.of(SportTypes.PAINTBALL);
    }
}
