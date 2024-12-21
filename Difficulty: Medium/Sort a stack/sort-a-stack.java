//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> stack) {
        // add code here.
                if (!stack.isEmpty()) {
            // Remove the top element
            int top = stack.pop();

            // Sort the remaining stack
            sort(stack);

            // Insert the top element back in sorted order
            sortedInsert(stack, top);
           
        }
         return stack;
    }

    
    
        private static void sortedInsert(Stack<Integer> stack, int element) {
        // Base case: If stack is empty or the top element is less than the element to be inserted
        if (stack.isEmpty() || stack.peek() < element) {
            stack.push(element);
        } else {
            // Remove the top element
            int top = stack.pop();

            // Recur for the remaining stack
            sortedInsert(stack, element);

            // Insert the top element back
            stack.push(top);
        }
    }
}
