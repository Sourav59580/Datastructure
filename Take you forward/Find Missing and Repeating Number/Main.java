public class Main {
    public static void solution(int a[]){
        int n = a.length;
        int sum_N = (n*(n+1))/2;
        int sum_Nsq = (n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++)
        {
            sum_N -= a[i];
            sum_Nsq -= a[i]*a[i];
        }
        int missing_num = (sum_N+(sum_Nsq/sum_N))/2;
        System.out.println("Missing Number : "+missing_num);

        int repeating_num = missing_num-sum_N;
        System.out.println("Repeating Number : "+repeating_num);
    }
    public static void main(String[] args) {
        int a [] = {1,1,2,3,4,6};
        solution(a);
        
    }
    
}