import java.util.*;

public class WordAnalyzer {
    // Метод для анализа текста: подсчет повторений каждого слова
    public Map<String, Integer> analyze(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    // Метод для нахождения самого длинного и самого короткого слова
    public String getLongestAndShortestWord(String text) {
        String[] words = text.split("\\s+");
        String longest = "", shortest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return "Самое длинное слово: " + longest + ", самое короткое слово: " + shortest;
    }
}