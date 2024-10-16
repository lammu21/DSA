class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // if (nums2.length == 0 || nums1.length == 0) {
        //     return new int[0];
        // }

        // Stack<Integer> numStack = new Stack<>();
        // int[] nextGreater = new int[nums2.length];

        // // Initialize the nextGreater array to -1
        // for (int i = 0; i < nums2.length; i++) {
        //     nextGreater[i] = -1;
        // }

        // // Traverse nums2 from right to left
        // for (int i = nums2.length - 1; i >= 0; i--) {
        //     while (!numStack.isEmpty() && numStack.peek() <= nums2[i]) {
        //         numStack.pop();
        //     }
        //     if (!numStack.isEmpty()) {
        //         nextGreater[i] = numStack.peek();
        //     }
        //     numStack.push(nums2[i]);
        // }

        // int[] result = new int[nums1.length];
        // for (int i = 0; i < nums1.length; i++) {
        //     for (int j = 0; j < nums2.length; j++) {
        //         if (nums1[i] == nums2[j]) {
        //             result[i] = nextGreater[j];
        //             break;

        //         }
        //     }

        // }

        //     return result;
           Stack<Integer> stack = new Stack<>();
        int[] nextGreater = new int[nums2.length];
        
        // Initialize nextGreater array with -1
        for (int i = 0; i < nextGreater.length; i++) {
            nextGreater[i] = -1;
        }
        
        // Find the next greater elements
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nextGreater[i] = stack.peek();
            }
            stack.push(nums2[i]);
        }
        
        // Prepare the result for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = nextGreater[j];
                    break;
                }
            }
        }
        
        return result;
    }
}