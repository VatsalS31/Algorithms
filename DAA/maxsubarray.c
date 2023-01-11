
#include <stdio.h>
#include <limits.h>
 

int max(int a, int b) {
    return (a > b) ? a : b;
}
 

int max_sum(int nums[], int l, int h)
{
  
    if (h <= l) {
        return nums[l];
    }
 
   
    int mid = (l + h) / 2;
 
   
    int lm = INT_MIN;
    int sum = 0;
    for (int i = mid; i >= l; i--)
    {
        sum += nums[i];
        if (sum > lm) {
            lm = sum;
        }
    }
 
    
    int rm = INT_MIN;
    sum = 0;   
    for (int i = mid + 1; i <= h; i++)
    {
        sum += nums[i];
        if (sum > rm) {
            rm = sum;
        }
    }
 
    
    int mlr = max(max_sum(nums, l, mid),
                            max_sum(nums, mid + 1, h));
 
   
    return max(mlr, lm + rm);
}
 
int main(void)
{
    int j;
    int arr[j];
     
    printf("--------BY VATSAL SHAH 21BKT0131--------\n");
    printf("Enter the size of array\n");
    scanf("%d",&j);
    printf("Enter the array:\n");
    for(int i=0;i<j;i++)
    {
        scanf("%d",&arr[i]);

    }
 
 
    printf("The maximum sum of the subarray is %d",
            max_sum(arr, 0, j - 1));

    return 0;
 
   
}
