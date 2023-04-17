package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class SwimmingPool extends AbstractStadium {
    private int numberOfShowers;
    private double poolVolumeInLiters;
    private int numberOfMembers;

    public SwimmingPool(int numberOfShowers, String name, int capacity, int currentAttandance, int numberOfShowers1, double poolVolumeInLitersInLiters, int numberOfMembers) {
        super(numberOfShowers, name, capacity, currentAttandance);
        this.numberOfShowers = numberOfShowers1;
        this.poolVolumeInLiters = poolVolumeInLiters;
        this.numberOfMembers = numberOfMembers;
    }
    public String getHeaders() {
        return super.getHeaders() + ", pool volume in liters, number of members";
    }

    public String toCSV() {
        return super.toCSV() + ", " + poolVolumeInLiters + "," + numberOfMembers;
    }

    @Override
    public List<SportTypes> getSupportedSports() {

        return List.of(SportTypes.SWIMMING, SportTypes.WATER_POLO);
    }
}
