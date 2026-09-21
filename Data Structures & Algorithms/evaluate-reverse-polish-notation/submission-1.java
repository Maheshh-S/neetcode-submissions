class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();

        for(String s : tokens){

            if(s.equals("+") ||s.equals("-") ||s.equals("/") ||s.equals("*")){

                int sec = st.pop();
                int first = st.pop();

                if(s.equals("+")) st.push(first + sec);
                else if(s.equals("-")) st.push(first - sec);

                else if(s.equals("*")) st.push(first * sec);
                else if(s.equals("/")) st.push(first / sec);

            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
