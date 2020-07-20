import java.util.*;

class Insertion{

    public void insertion(int b[],int n,int position,int x){
        int a[] = new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i==position-1)
            a[i] = x;
            else if(i<position-1)
            a[i]=b[i];
            else if(i>=position)
            a[i]=b[i-1];
        }
        

        for(int i=0;i<=n;i++){
            System.out.println(a[i]);
        }
    }
}

public class InsertionGivenPostion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int position = in.nextInt();
        int x = in.nextInt();
        int a[] = {1,2,4,5,7,9,0};
        int length = a.length;
        Insertion obj = new Insertion();
        obj.insertion(a,length,position,x);   
    }

}