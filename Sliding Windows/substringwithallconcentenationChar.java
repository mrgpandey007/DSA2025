    class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            final List<Integer> result = new ArrayList<>();
            if(s==null || words==null || words.length==0) return result;

            int size = words.length, num = words[0].length();

            if(s.length()<(size*num)) return result;

            final HashMap<String, Integer> counts = new HashMap<>();
            for (final String str : words) {
                counts.put(str, counts.getOrDefault(str, 0) + 1);
            }

            for (int i = 0; i < num ; i++) {
                final HashMap<String, Integer> visit = new HashMap<>();
                int left = i;
                int count=0;

                for(int j=i;j+num <= s.length();j+=num) {
                     String word = s.substring(j , j +num);

                    if (counts.containsKey(word)) {
                        visit.put(word, visit.getOrDefault(word, 0) + 1);
                        count++;

                        while (visit.get(word) > counts.get(word)) {
                             String del=s.substring(left,left+num);
                            visit.put(del, visit.get(del) - 1);

                            count--;
                            left+=num;
                        }

                        if(count==size) {
                            result.add(left);
                            String del=s.substring(left,left+num);
                            visit.put(del, visit.get(del) - 1);
                            count--;
                            left+=num;
                        } 
                    }else {
                        visit.clear();
                        left=j+num;
                        count=0;
                    }
                }
            }
            return result;
        }
    }