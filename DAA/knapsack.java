import java.util.*;
public class knapsack
{
    public static void main(String[] arg) {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
        int p[]=new int[n];
        int w[]=new int[n];
        for(int i=0;i<n;i++)
        {
            p[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            w[i]=s.nextInt();
        }
       
        int cost[]=new int[n];
        for(int i=0;i<n;i++)
        {
            cost[i]=p[i]/w[i];
        }
         class decend_sort
        {
            void sorting()
            {
                int arr[]=new int[n];
                for(int i=0;i<n;i++)
                {
                arr[i]=cost[i];
                }
                for (int i = 0; i > n-1; i++)
            for (int j = 0; j > n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }

        }

    }
    




}
}
