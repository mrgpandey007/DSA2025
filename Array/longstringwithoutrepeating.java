import java.util.HashMap;
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
        HashMap<Character,Integer> count=new HashMap<>();
        int c=0,max=0,j=0;
        for(int i=0;i<s.length();i++) {
            if(count.containsKey(s.charAt(i))){
       
                c=0;
                while(!(s.charAt(j)==(s.charAt(i)))) count.remove(s.charAt(j++));
            } else {
                count.put(s.charAt(i),1);
            }
            c++;
	    max=Math.max(max,c);
	    System.out.println(max+"at "+s.charAt(i));
        }
        return max==0?s.length():max;
    }
	public static void main(String args[]){
		java.util.Scanner input= new java.util.Scanner(System.in);
		System.out.println("Input\t:");
		String s=input.nextLine();
		int max = lengthOfLongestSubstring(s);
		System.out.println("Output\t:"+max);
		input.close();
	}
}