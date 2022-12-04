import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class day4SecondPart {
    public static void main(String[] args) throws FileNotFoundException {

        File myObj = new File("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input4.txt");
        Scanner myReader = new Scanner(myObj);
        int answer = 0;
        while (myReader.hasNextLine()) {
            String[] currentLine = myReader.nextLine().split(",");
            System.out.println("CurrentLine is: " + Arrays.toString(currentLine));
            String[] first = currentLine[0].split("-");
            String[] second = currentLine[1].split("-");
            int f1 = Integer.parseInt(first[0]);
            int f2 = Integer.parseInt(first[1]);
            int s1 = Integer.parseInt(second[0]);
            int s2 = Integer.parseInt(second[1]);
            HashSet<Integer> setOfFirstArr = new HashSet<>();
            HashSet<Integer> setOfSecondArr = new HashSet<>();
            HashSet<Integer> dublicates = new HashSet<>();

            for (int i = f1; i <= f2; i++) {
                setOfFirstArr.add(i);
            }
            System.out.println("setOfFirstArr is " + setOfFirstArr);

            for (int i = s1; i <= s2; i++) {
                setOfSecondArr.add(i);
            }
            System.out.println("setOfSecondArr is " + setOfSecondArr);

            for (int i = s1; i <= s2; i++) {
                if (setOfFirstArr.contains(i)) {
                    dublicates.add(i);
                }
            }

            for (int j = f1; j <= f2; j++) {
                if (setOfSecondArr.contains(j)) {
                    dublicates.add(j);
                }
            }

            System.out.println("-------------" + dublicates);
            if (dublicates.size() > 0) {
                answer++;
            }
        }
        System.out.println(answer);
        myReader.close();
    }
}

