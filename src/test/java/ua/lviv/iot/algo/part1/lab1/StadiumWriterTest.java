package ua.lviv.iot.algo.part1.lab1;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StadiumWriterTest {
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";

    private StadiumManager manager;
    private StadiumWriter writer;

    @Before
    public void setUp() {
        manager = new StadiumManager();
        writer = new StadiumWriter();
    }
    @Test
    public void testEmptyWrite() throws IOException {
        assertNull(writer.writeToFile(manager.getStadiums(), RESULT_FILENAME));
    }

    @Test
    public void testWriteListOfStadiums() throws IOException {
        manager.addStadium(new Stadium());
        manager.addStadium(new PaintballStadium());
        manager.addStadium(new TenisCort());
        manager.addStadium(new SwimmingPool());

        Path expected = new File(RESULT_FILENAME).toPath();
        Path result = new File(EXPECTED_FILENAME).toPath();

        writer.writeToFile(manager.getStadiums(), RESULT_FILENAME);

        assertEquals(-1L, Files.mismatch(expected, result));
    }

    @Test
    public void testFileOverride() throws IOException {
        FileWriter sWriter = new FileWriter(RESULT_FILENAME);
        sWriter.write("Text for test");
        sWriter.close();
        testWriteListOfStadiums();
    }
}