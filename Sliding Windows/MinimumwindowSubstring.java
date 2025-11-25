class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int hash[]= new int[123];

        for(char c: t.toCharArray()) hash[c]++;

        int n=s.length(),m=t.length();
        int s_index=-1,min=n+1,count=0;

        for(int l=0 , r = 0 ; r < n ; r++) {
            if(hash[s.charAt(r)]>0) count++;
            hash[s.charAt(r)]--;
            
            while(count==m) {
                if(r-l+1 < min) {
                    min = r-l+1;
                    s_index = l;
                }

                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0) count--;
                l++;
            }    
        }
        return s_index==-1?"":s.substring(s_index,s_index+min);
    }
}