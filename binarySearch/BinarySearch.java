package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {-1,12,25,38,49,53,61,77,80,99};
		int trgt=-1;
		int ans=binarySearch(arr,trgt);
		System.out.println("Index value is = "+ans);
	}

	static int binarySearch(int[] arr, int trgt) {
		int strt=0;
		int end=arr.length-1;
		
		while(strt<=end) {
			int mid=strt+(end-strt)/2;
			
			if(trgt<arr[mid]) {
				end=mid-1;
			}
			else if(trgt>arr[mid]) {
				strt=mid+1;
			}
			else if(trgt==arr[mid]) {
				return mid;
			}
		}
		return -1;
	}
	

}
