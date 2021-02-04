#include<stdio.h>
#include<stdlib.h>
void bubble_sort(int a[], int n)
{
	int i,j,temp;
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
void main()
{
	int i;
	int a[]={9,7,10,2,1};
	bubble_sort(a,5);
	for(i=0;i<5;i++)
		printf("%d ",a[i]);
}
