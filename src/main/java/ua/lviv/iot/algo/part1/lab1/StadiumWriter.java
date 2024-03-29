package ua.lviv.iot.algo.part1.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
public class StadiumWriter {
    public String writeToFile(List<AbstractStadium> stadiumList, String fileName) throws FileNotFoundException {
        if (stadiumList.isEmpty()){
            return null;
        }
        File file = new File(fileName);
        try (PrintWriter stadiumWriter= new PrintWriter(file)){
            AbstractStadium stadiumType = stadiumList.get(0);
            stadiumWriter.println(stadiumList.get(0).getHeaders());
            for (var stadium : stadiumList) {
                if (stadiumType.getClass() != stadium.getClass()) {
                    stadiumType = stadium;
                    stadiumWriter.println(stadium.getHeaders());
                }
                stadiumWriter.println(stadium.toCSV());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return fileName;
    };

};
