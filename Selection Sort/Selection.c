#include<stdio.h>
#include<stdlib.h>
void selection_sort(int a[], int n)
{
	int i,j,min,pos;
	for(i=0;i<n-1;i++)
	{
		min=a[i];
		pos=i;
		for(j=i+1;j<n;j++)
		{
			if(min>a[j])
			{
				min=a[j];
				pos=j;
			}
		}
		a[pos]=a[i];
		a[i]=min;
	}
}
void main()
{
	int i;
	int a[]={9,7,10,2,1};
	selection_sort(a,5);
	for(i=0;i<5;i++)
		printf("%d ",a[i]);
}
