import java.util.*;
public class knapsack
{
    public static void main(String[] arg) {
    Scanner s = new Scanner(System.in);
    System.out.println(("enter size:\n"));
    
    int n=s.nextInt();
    System.out.println("enter capacity:\n");
    int m=s.nextInt();
    int total=0;

        int p[]=new int[n];
        int w[]=new int[n];

        System.out.println("enter the profit\n");
        for(int i=0;i<n;i++)
        {
            
            p[i]=s.nextInt();
        }
        System.out.println("enter the weight\n");
        for(int i=0;i<n;i++)
        {
           
            w[i]=s.nextInt();
        }
       
        int cost[]=new int[n];
        System.out.println("cost:");
        for(int i=0;i<n;i++)
        {
            cost[i]=p[i]/w[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(cost[i]);
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
    for(int i=0;i<n;i++)
    {
        if(m>0 && w[i]<=m)
        {
            m=m-w[i];
            total=total+p[i];


        }
        else
        break;
        if(m>0)
    {
        total=total+p[i]*(m/w[i]);
    }

    }
    
    System.out.println("total profit:\n");
    System.out.println(total);

    
    




}
}
