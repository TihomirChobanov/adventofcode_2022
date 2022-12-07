import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class day5SecondPart {
    public static void main(String[] args) throws FileNotFoundException {

        Stack<Character> first = new Stack<>();
        Stack<Character> second = new Stack<>();
        Stack<Character> third = new Stack<>();
        Stack<Character> forth = new Stack<>();
        Stack<Character> fifth = new Stack<>();
        Stack<Character> sixth = new Stack<>();
        Stack<Character> seventh = new Stack<>();
        Stack<Character> eight = new Stack<>();
        Stack<Character> nineth = new Stack<>();
        generateStacks(first, second, third, forth, fifth, sixth, seventh, eight, nineth);
        printStacks(first, second, third, forth, fifth, sixth, seventh, eight, nineth);
        int counter = 1;
        File myObj = new File("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input5.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            System.out.println(counter++);
            String[] currentLine = myReader.nextLine().split(" ");
            System.out.println(Arrays.toString(currentLine));
            int numberOfElements = Integer.parseInt(currentLine[1]);
            int fromStack = Integer.parseInt(currentLine[3]);
            int toStack = Integer.parseInt(currentLine[5]);
            ArrayList<Character> tenth = new ArrayList<>();
            for (int i = 0; i < numberOfElements; i++) {
                char temp = 0;
                if (fromStack == 1) {
                    temp = first.peek();
                    first.pop();
                    tenth.add(temp);
                } else if (fromStack == 2) {
                    temp = second.peek();
                    second.pop();
                    tenth.add(temp);
                } else if (fromStack == 3) {
                    temp = third.peek();
                    third.pop();
                    tenth.add(temp);
                } else if (fromStack == 4) {
                    temp = forth.peek();
                    forth.pop();
                    tenth.add(temp);
                } else if (fromStack == 5) {
                    temp = fifth.peek();
                    fifth.pop();
                    tenth.add(temp);
                } else if (fromStack == 6) {
                    temp = sixth.peek();
                    sixth.pop();
                    tenth.add(temp);
                } else if (fromStack == 7) {
                    temp = seventh.peek();
                    seventh.pop();
                    tenth.add(temp);
                } else if (fromStack == 8) {
                    temp = eight.peek();
                    tenth.add(temp);
                    eight.pop();
                } else if (fromStack == 9) {
                    temp = nineth.peek();
                    nineth.pop();
                    tenth.add(temp);
                }
            }

            System.out.println("Tenth is : " + tenth);
            Collections.reverse(tenth);
            System.out.println("Reversed Tenth is : " + tenth);

            if (toStack == 1) {
                first.addAll(tenth);
            } else if (toStack == 2) {
                second.addAll(tenth);
            } else if (toStack == 3) {
                third.addAll(tenth);
            } else if (toStack == 4) {
                forth.addAll(tenth);
            } else if (toStack == 5) {
                fifth.addAll(tenth);
            } else if (toStack == 6) {
                sixth.addAll(tenth);
            } else if (toStack == 7) {
                seventh.addAll(tenth);
            } else if (toStack == 8) {
                eight.addAll(tenth);
            } else if (toStack == 9) {
                nineth.addAll(tenth);
            }

            tenth.clear();
            System.out.println("----------After changing: ");
            printStacks(first, second, third, forth, fifth, sixth, seventh, eight, nineth);
        }
        System.out.println("----------FINAL: ");
        printStacks(first, second, third, forth, fifth, sixth, seventh, eight, nineth);
        myReader.close();
    }

    private static void printStacks(Stack<Character> first, Stack<Character> second, Stack<Character> third, Stack<Character> forth, Stack<Character> fifth, Stack<Character> sixth, Stack<Character> seventh, Stack<Character> eight, Stack<Character> nineth) {
        System.out.println("1." + first);
        System.out.println("2." + second);
        System.out.println("3." + third);
        System.out.println("4." + forth);
        System.out.println("5." + fifth);
        System.out.println("6." + sixth);
        System.out.println("7." + seventh);
        System.out.println("8." + eight);
        System.out.println("9." + nineth);
    }

    private static void generateStacks(Stack<Character> first, Stack<Character> second, Stack<Character> third, Stack<Character> forth, Stack<Character> fifth, Stack<Character> sixth, Stack<Character> seventh, Stack<Character> eight, Stack<Character> nineth) {
        first.push('H');
        first.push('B');
        first.push('V');
        first.push('W');
        first.push('N');
        first.push('M');
        first.push('L');
        first.push('P');
        second.push('M');
        second.push('Q');
        second.push('H');
        third.push('N');
        third.push('D');
        third.push('B');
        third.push('G');
        third.push('F');
        third.push('Q');
        third.push('M');
        third.push('L');
        forth.push('Z');
        forth.push('T');
        forth.push('F');
        forth.push('Q');
        forth.push('M');
        forth.push('W');
        forth.push('G');
        fifth.push('M');
        fifth.push('T');
        fifth.push('H');
        fifth.push('P');
        sixth.push('C');
        sixth.push('B');
        sixth.push('M');
        sixth.push('J');
        sixth.push('D');
        sixth.push('H');
        sixth.push('G');
        sixth.push('T');
        seventh.push('M');
        seventh.push('N');
        seventh.push('B');
        seventh.push('F');
        seventh.push('V');
        seventh.push('R');
        eight.push('P');
        eight.push('L');
        eight.push('H');
        eight.push('M');
        eight.push('R');
        eight.push('G');
        eight.push('S');
        nineth.push('P');
        nineth.push('D');
        nineth.push('B');
        nineth.push('C');
        nineth.push('N');
    }
}