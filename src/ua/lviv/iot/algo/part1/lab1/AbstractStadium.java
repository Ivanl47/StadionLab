package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AbstractStadium {
    protected int numberOfShowers;
    protected String name;
    protected int capacity;
    protected int currentAttandance;
    public abstract String[] getSupportedSports();
}
