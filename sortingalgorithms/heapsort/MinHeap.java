package heapsort;

public class MinHeap {
	private static int[] Heap;
    private int size;
    private int maxsize;
    int parent(int position) {
    	return (position-1)/2;
    }
    public void swap(int a,int b) {
    	int temp=Heap[a];
    	Heap[a]=Heap[b];
    	Heap[b]=temp;
    }
    public void print()
    {
        for(int i=0;i<size/2;i++) {
        	System.out.println("Parent :"+Heap[i]+", Left Child:"+Heap[2*i+1]+", Right Child: "+Heap[2*i+2]);
        	
        }
    }
	public boolean isLeaf(int pos)
    {
        if (pos >=  (size / 2)  &&  pos < size)
        {
            return true;
        }
        return false;
    }
	public int leftChild(int pos) {
		return (2*pos+1);
	}
	public int rightchild(int pos) {
		return (2*pos+2);
	}
	public void minHeapify(int pos) {
		 if (!isLeaf(pos))
	        { 
	            if ( Heap[pos] > Heap[leftChild(pos)]  || Heap[pos] > Heap[rightchild(pos)])
	            {
	                if (Heap[leftChild(pos)] < Heap[rightchild(pos)])
	                {
	                    swap(pos, leftChild(pos));
	                    minHeapify(leftChild(pos));
	                }else
	                {
	                    swap(pos, rightchild(pos));
	                    minHeapify(rightchild(pos));
	                }
	            }
	        }
	}
	public void minHeap()
   {
       for (int pos = (size / 2); pos >0; pos--)
       {
       	minHeapify(pos);
       }
   }
	public void insert(int element) {
		Heap[size]=element;
		int current=size++;
		while(Heap[current]<Heap[parent(current)]) {
			swap(current,parent(current));
			current=parent(current);
		}
	}
	public MinHeap(int maxsize) {
		this.maxsize=maxsize;
		this.size=0;
		Heap=new int[this.maxsize];
	}
	
	public static void main(String[] args) {
		System.out.println("The Min Heap is ");
		MinHeap minHeap = new MinHeap(9);
		minHeap.insert(5);
		minHeap.insert(3);
		minHeap.insert(17);
		minHeap.insert(10);
		minHeap.insert(84);
		minHeap.insert(19);
		minHeap.insert(6);
		minHeap.insert(22);
		minHeap.insert(9);
		minHeap.print();
		minHeap.minHeap();
        System.out.println("Done");
        //minHeap.print();
        MaxHeap max=new MaxHeap(9);
        max.Heap=minHeap.Heap;
        max.size=minHeap.size;
        max.maxHeap();
        max.print();
        /*for(int i=0;i<maxHeap.size;i++)
        	System.out.println(maxHeap.Heap[i]+" is Leaf: "+maxHeap.isLeaf(i));*/
	}
}
