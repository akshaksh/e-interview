package hackerearth.sortingalgorithms.mergesortprograms;

public class MergeSort {
	static int arr[]={45,23,11,89,77,98,4,28,65,43};
	static int tempMergArr[]=new int[arr.length];
	public static void main(String[] args) {
			/*for(int ar:arr)
			System.out.print(ar+" ");*/
		System.out.println("Later:\n");
		new MergeSort().mergesort(0, arr.length-1);
		/*for(int ar:arr)
			System.out.print(ar+" ");*/
		
	}
	public void mergesort(int start,int end){
		if(start<end){
			int mid=start+(end-start)/2;
			mergesort(start,mid);
			mergesort(mid+1,end);
			merging(start,mid,end);
		}
	}
	public void merging(int start,int mid, int end){
			int i=start; int j=mid+1;
			int t=start;
			for (int k = start; k <= end; k++) {
	            tempMergArr[k] = arr[k];
	        }
			while(i<=mid && j<=end){
				if(tempMergArr[i]<=tempMergArr[j]){
					arr[t]=tempMergArr[i];
					i++;
				}
				else{
					arr[t]=tempMergArr[j];
					j++;
				}
				t++;
			}
			while (i <= mid) {
	            arr[t] = tempMergArr[i];
	            t++;
	            i++;
	        }
			while (j <= end) {
	            arr[t] = tempMergArr[j];
	            t++;
	            j++;
	        }
			System.out.println("\n arr:");
			for(int ar:arr)
				System.out.print(ar+" ");
			System.out.println("\n tempMergArr:");
			for(int ar:tempMergArr)
				System.out.print(ar+" ");
	}
}
