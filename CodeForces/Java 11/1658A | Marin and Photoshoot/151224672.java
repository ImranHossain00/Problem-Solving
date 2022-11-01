import java.util.*;
import java.io.*;
public class Main {
 public static void main(String... args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  
  while (t-- > 0) {
   int n, count = 0;
   n = input.nextInt();
   String str = input.next();
   for (int i = 0; i < n-1; i++) if (str.charAt(i) == '0' && str.charAt(i+1) == '0') count++;
   count *=2;
   for (int i = 0; i < n-2; i++) if (str.charAt(i) == '0' && str.charAt(i+1) == '1' && str.charAt(i+2) == '0') count++;
   System.out.println(count);
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
 
 }
}