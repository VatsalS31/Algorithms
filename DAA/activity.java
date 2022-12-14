import java.util.*;
 class activity {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("------BY VATSAL SHAH -------\n");
        System.out.println("Enter the no. of activites");
        int n = s.nextInt();
        
        int start[]=new int[n];
        int finish[]=new int[n];
        String activity[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter activitiy");
            activity[i]=s.next();
            System.out.println("Enter Start time");
            start[i]=s.nextInt();
            System.out.println("Enter Finish time");
            finish[i]=s.nextInt();
        }
        System.out.println("-------Activity selection chart before sorting-------");
        System.out.println("-------------------");
       
        for(int i=0;i<n;i++)
        {
            System.out.print(activity[i]+"|");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(start[i]+"|");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(finish[i]+"|");
        }
        System.out.println();
        System.out.println("-----------------");
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(finish[i]>finish[j])
                {
                    int temp=finish[i];
                    finish[i]=finish[j];
                    finish[j]=temp;

                    int temp1=start[i];
                    start[i]=start[j];
                    start[j]=temp1;

                    String temp2=activity[i];
                    activity[i]=activity[j];
                    activity[j]=temp2;
                    
                }

            }
        }
        System.out.println();
        System.out.println("---------Activity selection chart after sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(activity[i]+"|");
        }
            System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(start[i]+"|");
        }
            System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(finish[i]+"|");
        }
        System.out.println();
        System.out.println("----------------");
        System.out.println("Final output");
        System.out.print(activity[0]);
        int x=0;
        for(int i=1;i<n;i++)
        {
            if(start[i]>=finish[x])
            {
                System.out.print("---->"+activity[i]);
                x=i;
            }
        }

    }
}

