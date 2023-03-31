package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@NoArgsConstructor
@ToString(callSuper = true)
public class TenisCort extends AbstractStadium {
    public double lengthOfNetInSantimeaters;

    public TenisCort(int numberOfShowers, String name, int capacity, int currentAttandance, double lengthOfNet) {
        super(numberOfShowers, name, capacity, currentAttandance);
        this.lengthOfNetInSantimeaters = lengthOfNet;
    }

    @Override
    public String[] getSupportedSports() {
        return new String[0];
    }
}
