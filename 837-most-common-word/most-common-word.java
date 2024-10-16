class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        paragraph = paragraph.replace(","," ").replace("  "," ");
        String [] words = paragraph.split(" ");

        for(String word: words){
            word = word.replace("'","").replace("?","").replace("?","").replace(".","").replace("!","").replace(";","").toLowerCase();
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        int max = 0;
        String out = "";
        for (String word : map.keySet()){
            if(! isItInBanned(word, banned)){
                if (map.get(word) >= max){
                    max = map.get(word);
                    out = word;
                }
            }
        }

        return out;
    }
    public boolean isItInBanned(String word, String [] banned){
        for(String ban: banned){
            //ban = ban.replace(",","").replace(".","").toLowerCase();
            if(ban.equals(word)){
                return true;
            }
        }
        return false;
    }
}