class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) 
        {
            if(ch=='(' || ch=='{' ||ch=='[')
            {
                // if opening brackets should be stored in st 
               st.push(ch);
            }
            else
            {
                // if closing brackets we should check in stack and first we have to if stack is empty if yes return flase
              if(st.isEmpty()){
                return false;
              }

            //   if stack is not empty pick top bracket and compare it with ch (closing brackt ) if open and closing matches continue 
              char cha=st.pop();
              if((ch==')' && cha=='(')||
                (ch=='}' && cha=='{')||
                (ch==']'&&cha=='[')){
                    continue;
                }
                else{
                    // else return flase
                    return false;
                }
            }

        }
        // at last if stack is empty, return true
        return st.isEmpty();

    }
}