import java.util.*;

class Insertion
{
    public void insertion(int a[],int x,int givenNumber){
        int length = a.length;
        int b[] = new int[length+1];
        int i=0;
        while(a[i]!=givenNumber){
            b[i]=a[i];
            i++;
        }
        b[i]=a[i];
        i++;
        b[i]= x;
        i++;
        for(int j=i;j<length+1;j++){
            b[j]=a[j-1];
        }

        for(int k=0;k<length+1;k++)
        System.out.println(b[k]);
    }
}

public class InsertionAfterNumber {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int x = in.nextInt();
       int givenNumber = in.nextInt();

       int a[] ={1,2,3,5,6,7,8,9,0};
       Insertion obj = new Insertion();
       obj.insertion(a, x, givenNumber);
  }
}