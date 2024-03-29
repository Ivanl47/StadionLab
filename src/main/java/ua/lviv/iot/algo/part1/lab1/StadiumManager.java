package ua.lviv.iot.algo.part1.lab1;

import lombok.Setter;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Setter
public class StadiumManager  {
    private final List<AbstractStadium> stadiums = new LinkedList<>();

    public StadiumManager() {
    }

    public List<AbstractStadium> getStadiums() {
        return stadiums;
    }

    public void addStadium(AbstractStadium stadium){
        this.stadiums.add(stadium);
    }

    public List<AbstractStadium> findAllStadiumsWithShowers(){
        return stadiums.stream().
                filter(stadium -> stadium.getNumberOfShowers() > 0).
                collect(Collectors.toList());
    }

    public List<AbstractStadium> findAllStadiumsWithCapacityMoreThan(int capacity){
        return stadiums.stream().
                filter(stadium -> stadium.getCapacity() > capacity).
                collect(Collectors.toList());
    }
}
