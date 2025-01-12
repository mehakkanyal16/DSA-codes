class Solution {
    public boolean canBeValid(String s, String locked) {
        // if(s.length()%2!=0){
        //     return false;
        // }
        // int left_count=0;
        // int right_count=0;
        // int zero_count=0;
        // for(int i=0;i<locked.length();i++){
        //     char c=locked.charAt(i);
        //     if(c=='0'){
        //         zero_count++;
        //     }
        // }
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(c=='('){
        //         left_count++;
        //     }else{
        //         right_count++;
        //     }
        // }
        // if(left_count>right_count){
        //    int res=left_count-zero_count;
        //    if(res!=right_count){
        //     return false;
        //    }
        // }
        // else if(left_count==right_count){
        //     return true;
        // }
        // else if(right_count>left_count){
        //     int res=right_count-zero_count;
        //     if(res!=left_count){
        //         return false;
        //     }

        // }
        // return true;
        int length = s.length();

        // If length of string is odd, return false.
        if (length % 2 == 1) {
            return false;
        }

        Stack<Integer> openBrackets = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();

        // Iterate through the string to handle '(' and ')'
        for (int i = 0; i < length; i++) {
            if (locked.charAt(i) == '0') {
                unlocked.push(i);
            } else if (s.charAt(i) == '(') {
                openBrackets.push(i);
            } else if (s.charAt(i) == ')') {
                if (!openBrackets.empty()) {
                    openBrackets.pop();
                } else if (!unlocked.empty()) {
                    unlocked.pop();
                } else {
                    return false;
                }
            }
        }

        // Match remaining open brackets with unlocked characters
        while (
            !openBrackets.empty() &&
            !unlocked.empty() &&
            openBrackets.peek() < unlocked.peek()
        ) {
            openBrackets.pop();
            unlocked.pop();
        }

        if (!openBrackets.empty()) {
            return false;
        }

        return true;

    }
}