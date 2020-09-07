class FindDuplicateNumber
{
    static int DuplicateNumber(int[] arr)
    {
        int slow = arr[0];
        int fast = arr[0];
        do{
           slow = arr[slow];
           fast = arr[arr[fast]];
        }while(fast!=slow);

        fast = arr[0];

        while(fast!=slow){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow; 
    }
    public static void main(String[] args) {
        int arr[] = {2,5,9,6,9,3,8,9,7,1};
        int result = DuplicateNumber(arr);
        System.out.println(result);
    }
}