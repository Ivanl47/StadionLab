package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@NoArgsConstructor
@ToString(callSuper = true)
public class PaintballStadium extends AbstractStadium {
    public int numberOfCovers;

    public PaintballStadium(int numberOfShowers, String name, int capacity, int currentAttandance, int numberOfCovers) {
        super(numberOfShowers, name, capacity, currentAttandance);
        this.numberOfCovers = numberOfCovers;
    }

    @Override
    public String[] getSupportedSports() {
        return new String[0];
    }
}
