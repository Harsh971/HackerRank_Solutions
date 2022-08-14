import java.io.*;
import java.util.*;

public class Solution {

   	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int x = Integer.valueOf(reader.readLine());
		HashSet<String> set = new HashSet<String>();
		while (x-- > 0) {
			set.add(reader.readLine());
			System.out.println(set.size());
		}
	}
}