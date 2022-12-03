import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class day3SecondPart {
    public static void main(String[] args) throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input3.txt"));
        ArrayList<String> firstLine = new ArrayList<>();
        ArrayList<String> secondLine = new ArrayList<>();
        ArrayList<String> thirdLine = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < allLines.size() - 2; i += 3) {
            firstLine.add(allLines.get(i));
            secondLine.add(allLines.get(i + 1));
            thirdLine.add(allLines.get(i + 2));
            System.out.println("First line is: " + firstLine);
            System.out.println("Second line is: " + secondLine);
            System.out.println("Third line is: " + thirdLine);
            String[] firstLineToArr = firstLine.get(0).split("");
            String[] secondLineToArr = secondLine.get(0).split("");
            String[] thirdLineToArr = thirdLine.get(0).split("");
            HashSet<String> setBetweenFirstAndSecond = new HashSet<>();
            HashSet<String> setBetweenFirstAndSecondAndThird = new HashSet<>();
            generateSetFromFirstLineArrAndSecondLineArr(firstLineToArr, secondLineToArr, setBetweenFirstAndSecond);
            System.out.println("--------Intersection between 1st and 2nd is: " + setBetweenFirstAndSecond);
            generateSetFromFirstSecondAndThirdArr(thirdLineToArr, setBetweenFirstAndSecond, setBetweenFirstAndSecondAndThird);
            System.out.println("--------Intersection between 1st 2nd and 3rd is: " + setBetweenFirstAndSecondAndThird);
            result = getResult(result, setBetweenFirstAndSecondAndThird);
            clearArrays(firstLine, secondLine, thirdLine);
        }
        System.out.println("Result is: " + result);
    }

    private static void clearArrays(ArrayList<String> firstLine, ArrayList<String> secondLine, ArrayList<String> thirdLine) {
        firstLine.clear();
        secondLine.clear();
        thirdLine.clear();
    }

    private static void generateSetFromFirstSecondAndThirdArr(String[] thirdLineToArr, HashSet<String> setBetweenFirstAndSecond, HashSet<String> setBetweenFirstAndSecondAndThird) {
        for (String s1 : setBetweenFirstAndSecond) {
            for (String s2 : thirdLineToArr) {
                if (s1.equals(s2)) {
                    setBetweenFirstAndSecondAndThird.add(s1);
                }
            }
        }
    }

    private static void generateSetFromFirstLineArrAndSecondLineArr(String[] firstLineToArr, String[] secondLineToArr, HashSet<String> setBetweenFirstAndSecond) {
        for (String s : firstLineToArr) {
            for (String value : secondLineToArr) {
                if (s.equals(value)) {
                    setBetweenFirstAndSecond.add(s);
                }
            }
        }
    }

    private static int getResult(int result, HashSet<String> setBetweenFirstAndSecondAndThird) {
        for (String s : setBetweenFirstAndSecondAndThird) {
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                if (Character.isLowerCase(c)) {
                    System.out.print("Char to Int is: ");
                    System.out.print(c - 'a' + 1);
                    System.out.println();
                    result += c - 'a' + 1;
                } else {
                    System.out.print("Char to Int is: ");
                    System.out.print(c - 'A' + 27);
                    System.out.println();
                    result += c - 'A' + 27;
                }
            }
        }
        return result;
    }
}

