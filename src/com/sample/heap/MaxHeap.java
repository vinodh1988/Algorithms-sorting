package com.sample.heap;

public class MaxHeap {
    int[] heap;
    int size=0;

    public MaxHeap(int size){
        heap = new int[size];
    }

    public int[] currentHeap() {
        return heap;
    }

    public void insert(int element){
        if(size!=heap.length){
            heap[size]=element;
            heapifyup(size);
            size++;
        }

    }

    public int delete(){
          int data=heap[0];
          size=size-1;
          heap[0]=heap[size];
          heap[size]=0;
          heapifydown(0);
          return data;

    }

    public void heapifyup(int index){

         while(index>0){
             int parent_index= (index-1)/2;
             if(heap[index]<=heap[parent_index])
               break;
             swap(index,parent_index);
             index=parent_index;
         }
    }

    public void swap(int a,int b){
        heap[a]=heap[a]+heap[b];
        heap[b]=heap[a]-heap[b];
        heap[a]=heap[a]-heap[b];
    }

    public void heapifydown(int index){
        int largest,leftchild,rightchild;
        if(index>=0) {


            while (true) {
                largest = index;
                leftchild = (2 * index) + 1;
                rightchild = (2 * index) + 2;
                if (leftchild < size && heap[leftchild] > heap[largest])
                    largest = leftchild;
                if (rightchild<size && heap[rightchild] > heap[largest])
                    largest = rightchild;

                if(largest==index)
                    break;
                swap(index,largest);
                index=largest;


            }

        }
    }

}
