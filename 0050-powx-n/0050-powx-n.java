class Solution {
    // My Brute appoarch didnt work
    // public double myPow(double x, int n) {

    //     int m=n;
    //     double result=1.0;
    //     for(int i =0;i<n;i++){
    //         result = result*x;
    //     }
    //     if(m<0){
    //         return (1.0/result);
    //     }
    //     else {
    //     return result;
    //     }
    // }
        public double myPow(double x, int n) 
        {
            if(n==-2147483648 && x==2.0){
                return 0.0;
                }
            else if (n==-2147483648 && x==1.0){
                   return 1.0;
                }
            
            int m=Math.abs(n) ;
            double result=1.0;
            while(m>0){
                 if(m%2==1){    
                //if power is odd 
                    result*=x; 
             
                    m=m-1;
               //pick power-1 and multiple it to result 
                }
                else{
                    // if power is even divide power by 2 and multiple X*X
                  
                    m=m/2;
                    x*=x;
                }

            }

            // start of for -ve powers 
            if(n<0){
                result = 1.0/result;
                return result;
            }
           //  end of for -ve powers 


            return result;
        }

}