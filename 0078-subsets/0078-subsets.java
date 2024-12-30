class Solution {

    // Subset Recursive Solution

    public List<List<Integer>> subsets(int[] nums) {
        
        int n = nums.length;
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> listOfLists = new ArrayList<>();
        generateSubsets(0, ds, nums, n, listOfLists);
        return listOfLists;
    }
// Debug Method til understand 
    public static void generateSubsets(int ind, List<Integer> ds, int[] arr, int n, List<List<Integer>> listOfLists) {
        if (ind == n) {
            listOfLists.add(new ArrayList<>(ds));
            return;
        }

        // Include the current element
        ds.add(arr[ind]);
        generateSubsets(ind + 1, ds, arr, n, listOfLists);
        
        // Exclude the current element
        ds.remove(ds.size() - 1);
        generateSubsets(ind + 1, ds, arr, n, listOfLists);
    }

    
}
