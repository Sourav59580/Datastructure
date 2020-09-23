class HeapImpl
{
    int size;
    int arr[] = new int[20];

    public void insertNewValue(int value)
    {
        arr[size] = value;
        int index = size;
        int parent = (size-1)/2;

        while(parent>=0 && arr[index] <arr[parent])
        {
          int temp = arr[parent];
          arr[parent] = arr[index];
          arr[index] = temp;

          temp = parent;
          index = parent;
          parent = (temp-1)/2;
        }
        size++;
    }

    public void print(){
        int length = arr.length;
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Main {
  public static void main(String[] args) {
    HeapImpl heap = new HeapImpl();
    int a[] = {10,7,11,30,20,38,2,45};

    heap.insertNewValue(a[0]);
    heap.insertNewValue(a[1]);
    heap.insertNewValue(a[2]);
    heap.insertNewValue(a[3]);

    heap.insertNewValue(a[4]);
    heap.insertNewValue(a[5]);
    heap.insertNewValue(a[6]);
    heap.insertNewValue(a[7]);

    heap.print();
  }
}