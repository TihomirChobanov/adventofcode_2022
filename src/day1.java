import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) throws FileNotFoundException {

            File myObj = new File("C:\\Users\\Tihomir\\Desktop\\input.txt");
            Scanner myReader = new Scanner(myObj);
            int sum = 0;
            ArrayList<Integer> integers = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (!data.isEmpty()) {
                    sum += Integer.parseInt(data);
                } else {
                    System.out.println(sum);
                    integers.add(sum);
                    sum = 0;
                    System.out.println("------------------------");
                }
            }

            System.out.println(integers);
            findMaxElementAndIndex(integers);
            findTop3AndPrintSum(integers);
            myReader.close();

    }

    private static void findTop3AndPrintSum(ArrayList<Integer> integers) {
        integers.sort(Collections.reverseOrder());
        System.out.println("Sorted: " + integers);
        int result = 0;
        for (int i = 0; i <= 2 ; i++) {
            result += integers.get(i);
        }
        System.out.println("Top 3 elfes: " + result);
    }

    private static void findMaxElementAndIndex(ArrayList<Integer> integers) {
        int max = integers.get(0);
        int index = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > max) {
                max = integers.get(i);
                index = i;
            }
        }
        System.out.println("Max is: " + max + " and index is " + index);
    }
}
