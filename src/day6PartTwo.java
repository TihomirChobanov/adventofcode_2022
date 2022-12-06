import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;

public class day6PartTwo {
    public static void main(String[] args) throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input6.txt"));

        for (String line : allLines) {
            String[] lineSplitted = line.split("");
            HashSet<String> set = new HashSet<>();
            int answer;
            for (int i = 0; i < lineSplitted.length - 13; i++) {
                set.add(lineSplitted[i]);
                set.add(lineSplitted[i + 1]);
                set.add(lineSplitted[i + 2]);
                set.add(lineSplitted[i + 3]);
                set.add(lineSplitted[i + 4]);
                set.add(lineSplitted[i + 5]);
                set.add(lineSplitted[i + 6]);
                set.add(lineSplitted[i + 7]);
                set.add(lineSplitted[i + 8]);
                set.add(lineSplitted[i + 9]);
                set.add(lineSplitted[i + 10]);
                set.add(lineSplitted[i + 11]);
                set.add(lineSplitted[i + 12]);
                set.add(lineSplitted[i + 13]);

                if (set.size() == 14) {
                    System.out.println("Index is " + i);
                    answer = i + 14;
                    System.out.println("Answer is: " + answer);
                    break;
                } else {
                    set.clear();
                }
            }
        }

    }

}

// a b c d e f - length - 6
//     1563  64 65 66