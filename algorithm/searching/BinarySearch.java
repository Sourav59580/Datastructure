
public class BinarySearch
{
    static int search(int a[],int l,int r,int e){

        while(r>=l){
            int mid = (l+r)/2;
            if(a[mid]==e)
            return mid;
            else{
               if(e>a[mid]){
                   l= mid+1;
               }else{
                   r=mid-1;
               }
            }
        }
        return -1;

    }

   public static void main(String[] args) {
       int a[] = { 2, 3, 4, 10, 40 };
       int length = a.length;
       int result = search(a,0,length-1,2);
       if(result==-1)
       System.out.println("Not found");
       else
       System.out.println("Found at => "+result +" index");
   }
}