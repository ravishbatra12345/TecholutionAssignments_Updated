import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingGroups {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(in.nextInt());
		}
		findPairs(set, k);
	}
 
	private static void findPairs(Set<Integer> set, int k) {
		int pairs = 0;
		for(Integer i: set){
			pairs += set.contains(i+k) ? 1:0;
		}
		
		System.out.println(pairs);
		
	}
}
© 2017 GitHub, Inc.