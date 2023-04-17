package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString(callSuper = true)
public class TenisCort extends AbstractStadium {
    public double lengthOfNetInSantimeaters;

    public TenisCort(int numberOfShowers, String name, int capacity, int currentAttandance, double lengthOfNet) {
        super(numberOfShowers, name, capacity, currentAttandance);
        this.lengthOfNetInSantimeaters = lengthOfNet;
    }
    public String getHeaders() {
        return super.getHeaders() + ", length of net in santimeaters";
    }

    public String toCSV() {
        return super.toCSV() + ", " + lengthOfNetInSantimeaters;
    }

    @Override
    public List<SportTypes> getSupportedSports() {
        return List.of(SportTypes.TENNIS);
    }
}
