// array : 12 345 123 98 104 32 78 56 87 49 57 63

public class redixSort
{
    public static void main(String args[])
    {
      int a[] ={12,345,123,98,104,32,78,56,87,49,57,63};
      for(int i =0;i<a.length;i++)
      {
          System.out.print(a[i]+" ");
      }

      int max = a[0];
      for(int i=1;i<a.length;i++)
      if(a[i]>max)
      max=a[i];

      int b[][] = new int[10][a.length];
      

    }
}
