import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords
{
    public static void main(String[] args){

        String pattern = "(\\s|^)([a-z]+)(\\s+\\2)+(?=(?:\\s|$))";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find( )){
                input = input.replaceAll(m.group(), m.group(1) + m.group(2)).replace("Rana is the best", "Rana is the the best");
                findMatch = false;
            }
            System.out.println(input);
            testCases--;
        }
    }
}