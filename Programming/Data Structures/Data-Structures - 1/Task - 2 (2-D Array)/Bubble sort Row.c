#include<stdio.h>
void main()
{
    int num,arr[10][10],n,i,j,k;
    int temp;
    printf("1.Row-wise\n");
    printf("Enter size of array : \n");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
            for (i = 0; i < n; i++)
{
            for (j = 0; j < n; j++)
    {
                if(arr[i][j] > arr[i][j+1])
        {
            temp = arr[i][j];
            arr[i][j] = arr[i][j+1];
            arr[i][j+1] = temp;
        }
    }
}
    for (i = 0; i < n; ++i)
    {
    for(j=0;j<n;j++)
    {
        printf("%d\n",arr[i][j]);
    }
    }
}