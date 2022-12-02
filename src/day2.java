import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input2.txt"));
            int result = 0;
            int win = 3;
            int lost = 0;
            int draw = 1;
            int myChoiceIsRockOrX = 1;       //opponentA - Rock
            int myChoiceIsPaperOrY = 2;      //opponentB - Paper
            int myChoiceIsScissorsOrZ = 3;   //opponentC - Scissors
            // shape you selected + outcome      0 lost; 3 draw; 6 won
            for (String line : allLines) {
                String[] arr = line.split(" ");
                String opponentChoice = arr[0];
                String myChoice = arr[1];
                if (opponentChoice.equals("C")) {
                    if (myChoice.equals("Z")) { //draw
                        result += myChoiceIsScissorsOrZ + 3;
                    } else if (myChoice.equals("Y")) { // lose
                        result += myChoiceIsPaperOrY;
                    } else {  // win
                        result += myChoiceIsRockOrX + 6;
                    }
                } else if (opponentChoice.equals("B")) {
                    if (myChoice.equals("Y")) { //draw
                        result += myChoiceIsPaperOrY + 3;
                    } else if (myChoice.equals("X")) { // lose
                        result += myChoiceIsRockOrX;
                    } else { // win
                        result += myChoiceIsScissorsOrZ + 6;
                    }
                } else {   // opponent is A
                    if (myChoice.equals("X")) { //draw
                        result += myChoiceIsRockOrX + 3;
                    } else if (myChoice.equals("Z")) { // lose
                        result += myChoiceIsScissorsOrZ;
                    } else {  // win
                        result += myChoiceIsPaperOrY + 6;
                    }
                }
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
