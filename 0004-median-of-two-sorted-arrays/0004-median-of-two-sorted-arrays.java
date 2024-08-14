class Solution {

    // BRUTE FORCE
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int index1=n/2;
        int index2=index1-1;
        int element1=-1;
        int element2=-1;
        int i=0,j=0;
        int count=0;

        while(i<n1&&j<n2){
            if(nums1[i]<nums2[j]){
                if(index1==count){
                    element1=nums1[i];
                }
                if(index2==count){
                    element2=nums1[i];
                }
                count++;
                i++;
            }
            else {
                 if(index1==count){
                    element1=nums2[j];
                }
                if(index2==count){
                    element2=nums2[j];
                }
                count++;
                j++;

            }
            
        }
        while(i<n1){
           if(index1==count){
                    element1=nums1[i];
                }
                if(index2==count){
                    element2=nums1[i];
                }
                count++;
                i++;
            }
    
            while(j<n2){
                  if(index1==count){
                    element1=nums2[j];
                }
                if(index2==count){
                    element2=nums2[j];
                }
                count++;
                j++;

            }

            if(n%2==1){
                return (double)(element1);
            }

            return (double)((double)(element1+element2))/2.0;

        

    }
}