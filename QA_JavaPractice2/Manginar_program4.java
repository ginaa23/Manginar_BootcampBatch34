import java.util.HashMap;
import java.util.Map;

public class Manginar_program4 {
    public static void main(String[] args){
        String text = "work hard party hard";
        Map<String, Integer> wordcount = countword(text);

        for (Map.Entry<String, Integer> entry: wordcount.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countword(String text){
        Map<String, Integer> wordcountMap = new HashMap<>();
        String[] words = text.split("\\s+");

        for (String word : words){
            word = word.toLowerCase();
            if (wordcountMap.containsKey(word)){
                wordcountMap.put(word, wordcountMap.get(word) + 1);
            }else{
                wordcountMap.put(word, 1);
            }
        }
        return wordcountMap;

    }
}
