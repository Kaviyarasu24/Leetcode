class Solution {
    public boolean isValid(String s) {
        Stack<Character> str=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ele=s.charAt(i);
            if (ele =='('|| ele=='{' || ele=='[')
                str.push(ele);
            else{
                if(str.isEmpty()) {return false;}
                else{
                    if(ele== '}'){
                        if (str.peek()=='{')
                            str.pop();
                        else return false;
                    }

                    if(ele==']'){
                        if(str.peek()=='[')
                            str.pop();
                        else return false;
                    }

                    if(ele==')'){
                        if (str.peek()=='(')
                            str.pop();
                        else return false;
                        }
                    }
                }

            }

            if(str.size()==0)return true;
            else return false;
        
    }
}