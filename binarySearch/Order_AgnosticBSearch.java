package binarySearch;

public class Order_AgnosticBSearch 
{

	public static void main(String[] args) 
	{
		int arr[]= {5,3,2,1,-5,-6};
		int trgt=3;
		int ans=orderAgnosticbS(arr,trgt);
		System.out.println(ans);
	}
	static int orderAgnosticbS(int[] arr, int trgt) 
	{
		int strt=0;
		int end=arr.length-1;
		
		boolean isAsc=arr[strt]<arr[end];
		
		while(strt<=end) 
		{
			int mid=strt+(end-strt)/2;
			
				if(trgt==arr[mid]) 
				{
					return mid;
				}
				if(isAsc) 
				{
					if(trgt<arr[mid]) 
					{
						end=mid-1;
					}
					else if(trgt>arr[mid]) 
					{
						strt=mid+1;
					}
				}
				else 
				{
					if(trgt>arr[mid]) 
					{
						end=mid-1;
					}
					else if(trgt<arr[mid]) 
					{
						strt=mid+1;
					}
				}	
			}
		return -1;
	}
}
