class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            // arr[mid]-(mid+1) gives number of missing number until mid, ideally index+1(mid+1) should be present at arr[Mid] i.e., dont understand ignore it 
            int missing =arr[mid]-(mid+1);

            if(missing<k){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return start+k;

        
    }
}