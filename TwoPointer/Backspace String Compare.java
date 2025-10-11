class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1,j=t.length()-1,t_back=0,s_back=0;
        while(i>=0 || j>=0) {
            while(i>=0) {
                if(s.charAt(i)=='#') {
                    s_back++;
                    i--;
                } else if(s_back>0) {
                    i--;
                    s_back--;
                } else break;
            }
            while(j>=0) {
                if(t.charAt(j)=='#') {
                    t_back++;
                    j--;
                } else if(t_back>0) {
                    j--;
                    t_back--;
                } else break;
            }
            if(i>=0 && j>=0) {
                if(s.charAt(i)!=t.charAt(j)) return false;
            }else if(i>=0 || j>=0){
                 return false;}
            i--;
            j--;
        }
        return true;
    }
}