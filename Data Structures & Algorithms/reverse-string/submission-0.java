class Solution {
    public void reverseString(char[] s) {
        int l = s.length;
        int i = 0;
        int j = l-1;
        while(i<=j){
            Character temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return;
    }
}