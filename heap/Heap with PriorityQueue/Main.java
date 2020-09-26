import java.util.*;
// array : 10,7,11,30,20,38,2,45

// min heap : 2 10 7 30 20 38 11 45 
// max heap : 45 38 30 20 11 10 2 7

public class Main {
    public static void minHeap(int a[]){
      PriorityQueue p = new PriorityQueue<>();

      for(int i=0;i<a.length;i++)
      {
          p.add(a[i]);
      }

      Iterator iterator = p.iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.print(iterator.next() + " "); 
        } 

      System.out.println();
    }
    public static void maxHeap(int a[]){
        PriorityQueue p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++)
        {
          p.add(a[i]);
        }
         Iterator iterator = p.iterator();
         while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");  
         }
      }
   public static void main(String[] args) {

      int a[] = {10,7,11,30,20,38,2,45};
      minHeap(a);
      maxHeap(a);
   }
}