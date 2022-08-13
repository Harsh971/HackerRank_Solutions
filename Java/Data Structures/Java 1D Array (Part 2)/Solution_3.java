import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int caseCount = scanner.nextInt();
        for(int ii=0; ii<caseCount; ++ii)
        {
            int arraySize = scanner.nextInt();
            int jumpSize = scanner.nextInt();
            int[] array = new int[arraySize];
            for(int jj=0; jj<arraySize; ++jj) array[jj] = scanner.nextInt();
            // --
            boolean solvableGame = solveGame(array, jumpSize, 0, new boolean[array.length]);
            System.out.println(solvableGame?"YES":"NO");
        }
    }
    public static boolean solveGame(int[] array, int jumpSize, int position, boolean[] testedPositions)
    {
        // System.out.println("solveGame:"+position);
        if(position < 0) return false;
        if(position >= array.length) return true;
        if(testedPositions[position]) return false;
        if(array[position]==1) return false;
        // --
        // -- test jump back case is pointless
        // -- which just repeat the last position
        // --
        testedPositions[position]=true;
        return solveGame(array, jumpSize, position+jumpSize, testedPositions)
            || solveGame(array, jumpSize, position+1, testedPositions) 
            || solveGame(array, jumpSize, position-1, testedPositions);
        
    }
}