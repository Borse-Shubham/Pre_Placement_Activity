#include<stdio.h>
#include<stdlib.h>

int main()
{
    int Arr[5];
    float fValue;
    double Brr[4];

    int iSize = 0;
    int *ptr = NULL;

    printf("Enter the size of array : \n");
    scanf("%d",&iSize);

    ptr = (int *)calloc(iSize , sizeof(int));
    ptr[0] = 10;
    ptr[1] = 20;
    ptr[3] = 30;
    free(ptr);

    return 0;
}