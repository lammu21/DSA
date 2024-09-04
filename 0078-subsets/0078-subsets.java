class Solution {

    // understand code and comment line acc. on weekends 
    public List<List<Integer>> subsets(int[] nums) {

        int n=nums.length;
        
        List<List<Integer>> listOfLists = new ArrayList<>();

// number of subsets are 2pow(n)

        int subsets=1<<n;

        for(int num=0;num<subsets;num++){
            List<Integer> list1= new ArrayList<>();

            for(int i=0;i<n;i++){
                if((num&(1<<i))!=0){
                    list1.add(nums[i]);
                }
            }
            listOfLists.add(list1);
        }
        return listOfLists;

    }
}