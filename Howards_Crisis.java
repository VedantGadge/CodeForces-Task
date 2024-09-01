import java.util.*;
public class Howards_Crisis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] result = new int[t];
        for(int i = 0;i<t;i++){

            int x= sc.nextInt();
            int y= sc.nextInt();

            int m= sc.nextInt();
            int n= sc.nextInt();

            int daysleft_food = x/m;
            int daysleft_water = y/n;
            result[i] = Math.min(daysleft_food,daysleft_water);
        }

        for(int i = 0;i<t;i++)
        {
            System.out.println(result[i]);
        }
    }
}
