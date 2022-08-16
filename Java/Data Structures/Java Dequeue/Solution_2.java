  import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            HashMap<Integer, Integer> freqs = new HashMap<Integer, Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            int ans = 0, countDistinct = 0;
            
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.addLast(num);
                if (freqs.get(num) == null) freqs.put(num,0);
                
                freqs.put(num,freqs.get(num)+1);
                if (freqs.get(num)==1) countDistinct++;
                
                if (deque.size()==m+1){
                    int rem = deque.removeFirst();
                    freqs.put(rem,freqs.get(rem)-1);
                    if (freqs.get(rem) == 0) countDistinct--;
                }
                if (deque.size()==m){
                    if (countDistinct > ans) ans = countDistinct;
                }
               
            }
            System.out.println(ans);
        }
    }
