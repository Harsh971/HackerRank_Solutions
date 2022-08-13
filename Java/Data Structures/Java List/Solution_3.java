import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int size = in.nextInt();
        final List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        final int commandCount = in.nextInt();
        for (int i = 0; i < commandCount; i++) {
            in.nextLine();
            String command = in.nextLine();
//            System.out.println("command: " + command);
            if (command.equals("Insert")) {
                int index = in.nextInt();
//                System.out.println("index: " + index);
                int value = in.nextInt();
//                System.out.println("value: " + value);
                list.add(index, value);
            } else {
                int index = in.nextInt();
                list.remove(index);
            }
        }
        int count = 0;
        for (Integer number : list) {
            System.out.print(number);
            if (count != list.size() - 1) {
                System.out.print(" ");
            }
            count++;
        }
    }
}