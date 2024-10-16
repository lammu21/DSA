class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>(); // To store the next greater element for each num in nums2
        Stack<Integer> stack = new Stack<>(); // To help find the next greater elements

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // If there's no next greater element for remaining elements in stack, it
        // defaults to -1
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;

    }

}