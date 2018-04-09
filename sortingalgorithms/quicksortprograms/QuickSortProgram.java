package hackerearth.sortingalgorithms.quicksortprograms;

public class QuickSortProgram {
	private int array[];
	private int length;
	public static void main(String[] args) {
		QuickSortProgram sorter=new QuickSortProgram();
		int input[]={24,2,77,20,56,75,2,56,99,53,12};
		sorter.sort(input);
		for(int ar:input)
			System.out.print(ar+" ");
	}
	public void sort(int arr[]){
		if(arr == null || arr.length ==0)
			return;
		this.array=arr;
		length=arr.length;
		quicksort(0,length-1);
	}
	public void quicksort(int start,int end){
		int i=start; int j=end; int pivot=array[start+(end-start)/2];
		while(i<=j){
			while(array[i]<pivot)
				i++;
			while(array[j]>pivot)
				j--;
			if(i<=j){
				exchange(i,j);
				i++;
				j--;
			}
		}
		if(start<j)
			quicksort(start,j);
		if(i<end)
			quicksort(i,end);
		
	}
	public void exchange(int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
