package service;

import model.Result;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alec on 24/10/15.
 */
public class FileWriterServiceTest {

    @Test
    public void writeToAFileHappyPath(){
        FileWriterService fileWriterService = new FileWriterService();
        Result result = new Result("Driver name", "car number", "layout", "1.5", "10.00");
        fileWriterService.appendStringToFile(result);
        //if we get here everthing is ok....shonky
    }
}