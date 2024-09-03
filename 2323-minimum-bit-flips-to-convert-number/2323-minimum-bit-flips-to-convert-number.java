class Solution {
    public int minBitFlips(int start, int goal) {


        //  XOR of start and goal will give number of different bit in start and goal, 
        int numberOfDifferentBits=start^goal;

        // below for loop will count number bit to be flipped 
        int count=0;
        for(int i=0;i<31;i++){
            if((numberOfDifferentBits&(1<<i))!=0){
                count++;
            }
        }
        return count;
        
    }
}