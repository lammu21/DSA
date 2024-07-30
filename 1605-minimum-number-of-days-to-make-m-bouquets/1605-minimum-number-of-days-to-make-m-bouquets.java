class Solution {

    // so much confusing code watched and sloved need to throught it again
    public int minDays(int[] bloomDay, int m, int k) {
        long total_num_of_flowers = (long) m*k;
        int n=bloomDay.length;
        if(total_num_of_flowers>n){
            return -1;
        }
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            max=Integer.max(bloomDay[i],max);
            min =Integer.min(bloomDay[i],min);
        }

        int start =min,end=max;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(possible(bloomDay,mid,m,k)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    public static boolean possible(int [] bloomDay,int days,int number_of_bouquet_required, int number_of_adjacent_flowers){
        int count =0;
        int numberOfbouquetPossible=0;
        int n=bloomDay.length;

        for(int i=0;i<n;i++){
            if(bloomDay[i]<=days){
                count++;
            }
            else{
                numberOfbouquetPossible+=(count/number_of_adjacent_flowers);
                count=0;
            }
        
        }
        numberOfbouquetPossible+=(count/number_of_adjacent_flowers);

        return numberOfbouquetPossible>=number_of_bouquet_required;
    }
}