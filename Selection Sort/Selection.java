import java.util.*;
public class Selection
{
	public static void selection_sort(int a[], int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int min=a[i];
			int pos=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					pos=j;
				}
			}
			int temp=min;
			a[pos]=a[i];
			a[i]=temp;
		}
	}
	public static void main(String args[])
	{
		int a[]={9,7,10,2,1};
		selection_sort(a,5);
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}