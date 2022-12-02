import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class day2SecondPart {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input2.txt"));
            int result = 0;
            int myChoiceIsRockOrX = 1;       //opponentA - Rock
            int myChoiceIsPaperOrY = 2;      //opponentB - Paper
            int myChoiceIsScissorsOrZ = 3;   //opponentC - Scissors
            // shape you selected + outcome      0 lost; 3 draw; 6 won
            // X - I need to lose; Y - I need a draw; Z - I need to win
            for (String line : allLines) {
                String[] arr = line.split(" ");
                String opponentChoice = arr[0];
                String howTheGameNeedsToEnd = arr[1];
                if (opponentChoice.equals("C")) {
                    if (howTheGameNeedsToEnd.equals("Y")) { //draw
                        result += myChoiceIsScissorsOrZ + 3;
                    } else if (howTheGameNeedsToEnd.equals("X")) { // lose
                        result += myChoiceIsPaperOrY;
                    } else {  // win
                        result += myChoiceIsRockOrX + 6;
                    }
                } else if (opponentChoice.equals("B")) {
                    if (howTheGameNeedsToEnd.equals("Y")) { //draw
                        result += myChoiceIsPaperOrY + 3;
                    } else if (howTheGameNeedsToEnd.equals("X")) { // lose
                        result += myChoiceIsRockOrX;
                    } else {  // win
                        result += myChoiceIsScissorsOrZ + 6;
                    }
                } else { // opponentChoice is A - Rock
                    if (howTheGameNeedsToEnd.equals("Y")) { //draw
                        result += myChoiceIsRockOrX + 3;
                    } else if (howTheGameNeedsToEnd.equals("X")) { // lose
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
