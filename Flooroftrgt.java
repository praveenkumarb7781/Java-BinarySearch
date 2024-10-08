package binarySearch;

public class Flooroftrgt {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7,9,14,16,18};
		int trgt=7;
		int ans=ceiloftrgt(arr,trgt);
		System.out.println(ans);
	}

	public static int ceiloftrgt(int[] arr, int trgt) {
		int strt=0;
		int end=arr.length-1;
		
		while(strt<=end) {
			int mid=strt+(end-strt)/2;
			if(trgt==arr[mid]) return mid;
			if(trgt>arr[mid]) strt=mid+1;
			if(trgt<arr[mid])end=mid-1;
		}
		return end;
	}
	}

