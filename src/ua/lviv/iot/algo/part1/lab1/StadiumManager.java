package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class StadiumManager  {
    private final List<AbstractStadium> stadiums = new LinkedList<>();

    public void addStadium(final AbstractStadium stadium) {
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


    public static void main(String[] args) {
        StadiumManager manager = new StadiumManager();
        manager.addStadium(new Stadium());
        manager.addStadium(new TenisCort());
        manager.addStadium(new SwimmingPool());
        manager.addStadium(new PaintballStadium());
        manager.addStadium(new Stadium(20, "Mirolea", 12, 4, 3, 1, "what", "why", new LinkedList<String>()));
        manager.addStadium(new TenisCort(5, "sport", 250, 200, 24.5));
        manager.addStadium(new SwimmingPool(5, "dynamo", 250, 200, 24, 24.5, 24));
        manager.addStadium(new PaintballStadium(0, "arena", 24, 12, 56));

        System.out.println("All stadiums:");
        for (AbstractStadium stadium : manager.getStadiums()) {
            System.out.println(stadium);
        }

        System.out.println("Find all stadiums with showers:");
        for (AbstractStadium stadium : manager.findAllStadiumsWithShowers()) {
            System.out.println(stadium);
        }

        System.out.println("Find all stadiums with capacity more than:");
        for (AbstractStadium stadium : manager.findAllStadiumsWithCapacityMoreThan(7)) {
            System.out.println(stadium);
        }
    }
}
