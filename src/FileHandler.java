import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    File file = new File("covid19data.csv");

    public ArrayList<Covid19Data> loadData(){
        ArrayList<Covid19Data> loadedData = new ArrayList<>();
        Scanner read = null;
        try{
            read = new Scanner(file, StandardCharsets.ISO_8859_1);

        } catch (IOException ioe){
            System.out.println("FILE NOT FOUND!");
        }
        Covid19Data cd = null;
        while (read.hasNextLine()) {
            String line = read.nextLine();
            String[] attributes = line.split(";");

            cd = new Covid19Data(attributes[0], attributes[1], Integer.parseInt(attributes[2]),
                    Integer.parseInt(attributes[3]), Integer.parseInt(attributes[4]), Integer.parseInt(attributes[5]),
                    attributes[6]);

            loadedData.add(cd);
        }
        read.close();
        return loadedData;
    }
}
