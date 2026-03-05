//Alexzander Oates
//3/5/26

import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Car> cars = new ArrayList<Car>();

    public static void main(String[] args) {
        readCarsFromCSV("Car.csv");

        static void readCarsFromCSV(String filename) {
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                int lineNumber = 0;
            
            
            //goes through the CSV file line by line
            while ((line = br.readLine()) != null) {
                lineNumber++;
                //skips the header
                if (lineNumber <= 1) {
                    continue;
                }
                //stops reading at 2000 cars (I think i don't know cause it still won't run)
                if (lineNumber == 2001) {
                    break;
                }
                //ignores the commas
                String[] values = Line.split(",");
            }
            //catches errors and reports them
            catch (IOException e) {
                System.err.println("Error" + e.getMessage());
            }
            }
        }

    }
}