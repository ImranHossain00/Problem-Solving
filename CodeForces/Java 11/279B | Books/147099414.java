import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
    public static void main(String... args) {
        FastScanner input = new FastScanner();
        int n, m, max, tem;
        long count;
        n = input.nextInt();
        m = input.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) arr[i] = input.nextInt();
        count = arr[0];
        max = tem = 0;
        for (int i = 0, j = 0; j < n;) {
            if (count <= m) {
                i++;
                if (i == n+1) break;
                count += arr[i];
                tem++;
            }
            else {
                count -= arr[j++];
                tem--;
            }
            max = Math.max(max,tem);
        }
        System.out.println(max);
    }
 
 
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
 
        public String next() {
            while (!st.hasMoreElements())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
 
        public int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) {
                a[i]=nextInt();
            }
            return a;
        }
 
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public int[] sort(int[] arr) {
            int mid, len, i, j, k;
            len = arr.length;
            mid = len/2;
            if (len == 1) {
                return arr;
            }
 
            int[] a1 = sort(Arrays.copyOfRange(arr, 0, mid));
            int[] a2 = sort(Arrays.copyOfRange(arr, mid, len));
 
            i = j = k = 0;
            while (i < a1.length && j < a2.length) {
                if (a1[i] > a2[j]) arr[k] = a2[j++];
                else arr[k] = a1[i++];
                k++;
            }
            if (i < a1.length) while (k < len) arr[k++] = a1[i++];
            else while (k < len) arr[k++] = a2[j++];
            return arr;
 
        }
 
    }
}