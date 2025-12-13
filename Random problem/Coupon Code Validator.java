class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> answer=new ArrayList<>();
        List<String> e,g,p,r;
        e=new ArrayList<>();
        g=new ArrayList<>();
        p=new ArrayList<>();
        r=new ArrayList<>();
        Set<String> map=Set.of("electronics", "grocery", "pharmacy", "restaurant");

        for(int i=0;i<isActive.length;i++) {
            String business=businessLine[i];
            if(isActive[i] && map.contains(business)) {
                if(code[i].equals("")) continue;
                boolean signal=true;;
                for(char c:code[i].toCharArray()) {
                    if(!(Character.isLetterOrDigit(c)||c=='_')) {
                        signal=false;
                        break;
                    }
                }
                if(signal) {
                    if(business.equals("electronics")) e.add(code[i]);
                    if(business.equals("grocery")) g.add(code[i]);
                    if(business.equals("pharmacy")) p.add(code[i]);
                    if(business.equals("restaurant")) r.add(code[i]);
                }
            }
        }
        Collections.sort(e);
        Collections.sort(g);
        Collections.sort(p);
        Collections.sort(r);
        answer.addAll(e);
        answer.addAll(g);
        answer.addAll(p);
        answer.addAll(r);
        return answer;
    }
}