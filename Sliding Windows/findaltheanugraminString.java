class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length(), m=p.length(); 
        List<Integer> result = new ArrayList<>();

        if(n<m) return result;
        int freq1[]=new int[26];
        int freq2[]=new int[26];

        for(int i=0;i<m;i++) {
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }
        int start=0,end=m;

        if(Arrays.equals(freq1,freq2)) result.add(start);

        while(end<n) {
            freq1[s.charAt(start)-'a']--;
            freq1[s.charAt(end)-'a']++;
            start++;end++;
            if(Arrays.equals(freq1,freq2)) result.add(start);
        }
        return result;
    }
}