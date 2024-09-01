import java.util.Scanner;

public class MaxRarenessScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int k = sc.nextInt();  
        int[] r = new int[n]; 
         
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        
        int max = 0;  
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += r[i + j];  
            }
            
            if (sum > max) {
                max = sum;
            }
        }
        
        System.out.println(max); 
}
}
