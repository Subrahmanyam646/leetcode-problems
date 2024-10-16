class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        String normalizedStr = paragraph.replaceAll("[!?',;\\.]", " ").toLowerCase();
        
        // Step 2: Split the normalized string into words.
        String[] words = normalizedStr.split("\\s+");

        for(String word: words){
            //word = word.replace("'","").replace("?","").replace(".","").replace("!","").replace(";","").toLowerCase();
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
            if(ban.equals(word)){
                return true;
            }
        }
        return false;
    }
}