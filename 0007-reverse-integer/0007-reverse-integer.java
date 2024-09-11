class Solution {
    public int reverse(int x) {

        if(x>=Integer.MAX_VALUE|| x<=Integer.MIN_VALUE){
            return 0;
        }
        long reverseNumber=0;//using long to handle larger values 
        while(x!=0){
            int lastdigit =x%10;
            reverseNumber=(reverseNumber*10)+lastdigit;

            if(reverseNumber>Integer.MAX_VALUE|| reverseNumber<Integer.MIN_VALUE)
            {
                return 0;
            }

            x/=10;
        }
        return (int)reverseNumber;
        
    }
}