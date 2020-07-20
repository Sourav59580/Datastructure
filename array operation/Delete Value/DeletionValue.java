import java.util.*;

class DeleteValue{
   public void delete(int a[],int index){
    // while(a[i]!=value){
    //     i++;
    // }
    // a[i]=a[i+1];
    // i++;
    // for(int j=i;j<a.length-1;j++){
    //     a[j]=a[j+1];
    // }

    for(int i=index;i<a.length-1;i++){
      a[i]=a[i+1];
    }

   for(int k=0;k<a.length;k++){
       System.out.println(a[k]);
   }

       

   }
}

public class DeletionValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int index = in.nextInt();
       int a[] ={1,2,3,4,5,6,7,8,9,0};
       DeleteValue obj = new DeleteValue();
       obj.delete(a,index);
    }

}