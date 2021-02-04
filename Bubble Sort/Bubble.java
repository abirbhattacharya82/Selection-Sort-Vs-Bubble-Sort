import java.util.*;
public class Bubble
{
	public static void bubble_sort(int a[], int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		int a[]={9,7,10,2,1};
		bubble_sort(a,5);
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}