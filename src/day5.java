
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class day5 {
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

        File myObj = new File("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input5.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String[] currentLine = myReader.nextLine().split(" ");
            System.out.println(Arrays.toString(currentLine));
            int numberOfElements = Integer.parseInt(currentLine[1]);
            int fromStack = Integer.parseInt(currentLine[3]);
            int toStack = Integer.parseInt(currentLine[5]);

            for (int i = 0; i < numberOfElements; i++) {
                char temp = 0;
                if (fromStack == 1) {
                    temp = first.peek();
                    first.pop();
                } else if (fromStack == 2) {
                    temp = second.peek();
                    second.pop();
                } else if (fromStack == 3) {
                    temp = third.peek();
                    third.pop();
                } else if (fromStack == 4) {
                    temp = forth.peek();
                    forth.pop();
                } else if (fromStack == 5) {
                    temp = fifth.peek();
                    fifth.pop();
                } else if (fromStack == 6) {
                    temp = sixth.peek();
                    sixth.pop();
                } else if (fromStack == 7) {
                    temp = seventh.peek();
                    seventh.pop();
                } else if (fromStack == 8) {
                    temp = eight.peek();
                    eight.pop();
                } else if (fromStack == 9) {
                    temp = nineth.peek();
                    nineth.pop();
                }

                if (toStack == 1) {
                    first.push(temp);
                } else if (toStack == 2) {
                    second.push(temp);
                } else if (toStack == 3) {
                    third.push(temp);
                } else if (toStack == 4) {
                    forth.push(temp);
                } else if (toStack == 5) {
                    fifth.push(temp);
                } else if (toStack == 6) {
                    sixth.push(temp);
                } else if (toStack == 7) {
                    seventh.push(temp);
                } else if (toStack == 8) {
                    eight.push(temp);
                } else if (toStack == 9) {
                    nineth.push(temp);
                }

            }
            System.out.println("----------After changing: ");
            printStacks(first, second, third, forth, fifth, sixth, seventh, eight, nineth);
        }
        System.out.println("----------FINAL: ");
        printStacks(first, second, third, forth, fifth, sixth, seventh, eight, nineth);
        myReader.close();
    }

    private static void printStacks(Stack<Character> first, Stack<Character> second, Stack<Character> third, Stack<Character> forth, Stack<Character> fifth, Stack<Character> sixth, Stack<Character> seventh, Stack<Character> eight, Stack<Character> nineth) {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(forth);
        System.out.println(fifth);
        System.out.println(sixth);
        System.out.println(seventh);
        System.out.println(eight);
        System.out.println(nineth);
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