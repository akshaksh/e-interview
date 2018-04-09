package heapsort;

public class MaxHeap {
	public static int[] Heap;
    public int size;
    public int maxsize;
    int parent(int position) {
    	return (position-1)/2;
    }
    public void swap(int a,int b) {
    	int temp=Heap[a];
    	Heap[a]=Heap[b];
    	Heap[b]=temp;
    }
	public MaxHeap(int maxsize) {
		this.maxsize=maxsize;
		this.size=0;
		Heap=new int[this.maxsize];
	}
	public void insert(int element) {
		Heap[size]=element;
		int current=size++;
		while(Heap[current]>Heap[parent(current)]) {
			swap(current,parent(current));
			current=parent(current);
		}
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
        /*See If elements are even then number of leaf will be size/2 and if odd then siz/2+1 so as per this index will always be greater
        than equals to size/2 for the leaf.*/
    }
	public int leftChild(int pos) {
		return (2*pos+1);//Give left part of tree node
	}
	public int rightchild(int pos) {
		return (2*pos+2);//Give right part of tree node
	}
	public void maxHeapify(int pos) {
		 if (!isLeaf(pos))
	        { 
	            if ( Heap[pos] < Heap[leftChild(pos)]  || Heap[pos] < Heap[rightchild(pos)])
	            {
	                if (Heap[leftChild(pos)] > Heap[rightchild(pos)])
	                {
	                    swap(pos, leftChild(pos));
	                    maxHeapify(leftChild(pos));
	                }else
	                {
	                    swap(pos, rightchild(pos));
	                    maxHeapify(rightchild(pos));
	                }
	            }
	        }
	}
	public void maxHeap()
    {
        for (int pos = (size / 2); pos >0; pos--)
        {
            maxHeapify(pos);
        }
    }
	public static void main(String strs[]) {
		System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(9);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(7);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        maxHeap.maxHeap();
        maxHeap.print();
        System.out.println("After");
        for(int ar:Heap)
        	System.out.print(ar+" ");
        /*for(int i=0;i<maxHeap.size;i++)
        	System.out.println(maxHeap.Heap[i]+" is Leaf: "+maxHeap.isLeaf(i));*/
	}}

/*In this example during insertion time we were replacing the value of leaf with the main node.*/