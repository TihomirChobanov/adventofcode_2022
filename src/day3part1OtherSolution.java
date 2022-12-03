import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;

public class day3part1OtherSolution {
    public static void main(String[] args) throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input3.txt"));
        int result = 0;
        for (String currentLine : allLines) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < currentLine.length() / 2; i++) {
                set.add(currentLine.charAt(i));
            }
            for (int i = currentLine.length() / 2; i < currentLine.length(); i++) {
                if (set.contains(currentLine.charAt(i))) {
                    if (Character.isUpperCase(currentLine.charAt(i))) {
                        result += currentLine.charAt(i) - 'A' + 27;
                    } else {
                        result += currentLine.charAt(i) - 'a' + 1;
                    }
                    break;
                }
            }
        }
        System.out.println("Result of all is: " + result);
    }
}
