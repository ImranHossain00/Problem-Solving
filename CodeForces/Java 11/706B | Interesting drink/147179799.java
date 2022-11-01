import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
    public static void main(String... args) {
        FastScanner input = new FastScanner();
        int n, q;
        n = input.nextInt();
        int[] arr = new int[100001];
        for (int i = 0; i < n; i++) arr[input.nextInt()] += 1;
        for (int i = 2; i < 100001; i++) arr[i] += arr[i-1];
 
        q = input.nextInt();
        while (q-- > 0) {
            int ele, ans;
            ele = input.nextInt();
            if (ele > 100000) ans = arr[100000];
            else ans = arr[ele];
            System.out.println(ans);
 
        }
 
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