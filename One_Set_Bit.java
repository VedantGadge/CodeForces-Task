import java.util.*;
public class One_Set_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i<T;i++)
        {
            int x = sc.nextInt();
            if((x & x-1) == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
