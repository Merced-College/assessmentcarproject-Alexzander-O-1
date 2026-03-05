//Alexzander Oates
//3/5/26

import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Car> car = new ArrayList<>();
    public static void main(String[] args) {
        //readCarFromCSV("car.csv");
        //for (Car car : car) {
        //System.out.println(car);
        //}

        static void readCarFromCSV(String filename) {
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                int lineNumber = 0;
            }
        }
        while ((line = br.readLine()) != null) {
            lineNumber++;
            if (lineNumber <= 1) {

                
            }
        }
    }
}