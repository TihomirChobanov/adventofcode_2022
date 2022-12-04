import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day4 {
    public static void main(String[] args) throws FileNotFoundException {

        File myObj = new File("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input4.txt");
        Scanner myReader = new Scanner(myObj);
        ArrayList<Integer> firstArr = new ArrayList<>();
        ArrayList<Integer> secondArr = new ArrayList<>();
        int result = 0;
        while (myReader.hasNextLine()) {
            String[] currentLine = myReader.nextLine().split(",");
            System.out.println("CurrentLine is: " + Arrays.toString(currentLine));
            String[] first = currentLine[0].split("-");
            String[] second = currentLine[1].split("-");
            firstArr.add(Integer.valueOf(first[0]));
            firstArr.add(Integer.valueOf(first[1]));
            secondArr.add(Integer.valueOf(second[0]));
            secondArr.add(Integer.valueOf(second[1]));

            System.out.println("firstArr is: " + firstArr);
            System.out.println("secondArr is: " + secondArr);
            if (secondArr.get(0) >= firstArr.get(0) && secondArr.get(1) <= firstArr.get(1) ||
                    firstArr.get(0) >= secondArr.get(0) && firstArr.get(1) <= secondArr.get(1) ) {
                System.out.println("---------------Here we have a match!");
                result++;
            }
            firstArr.clear();
            secondArr.clear();
        }
        System.out.println(result);
        myReader.close();
    }
}
