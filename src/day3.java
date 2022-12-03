import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class day3 {
    public static void main(String[] args) throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input3.txt"));
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        int result = 0;
        for (String line : allLines) {
            String[] lineSplitted = line.split("");
            first.addAll(Arrays.asList(lineSplitted).subList(0, lineSplitted.length / 2));
            second.addAll(Arrays.asList(lineSplitted).subList(lineSplitted.length / 2, lineSplitted.length));
//            System.out.println("First is :" + first);
//            System.out.println("Second is :" + second);

            List<String> intersection = first.stream()
                    .filter(second::contains)
                    .distinct()
                    .collect(Collectors.toList());

            for (String s : intersection) {
                System.out.println("String is: " + s);
                char[] charArray = s.toCharArray();
                for (char c : charArray) {
                    if (Character.isLowerCase(c)) {
                        System.out.println(c - 'a' + 1);
                        result += c - 'a' + 1;
                    } else {
                        System.out.println(c - 'A' + 27);
                        result += c - 'A' + 27;
                    }
                }
            }
            first.clear();
            second.clear();
        }
        System.out.println("Result of all is: " + result);
    }

}
