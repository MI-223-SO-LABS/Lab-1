import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String inputText = "Пример текста для манипуляций с текстом, где много пробелов, переносов и слов!";

        // Используем AdvancedTextManipulator
        AdvancedTextManipulator manipulator = new AdvancedTextManipulator();
        String manipulatedText = manipulator.manipulate(inputText, true, true, true);
        System.out.println("Манипулированный текст: " + manipulatedText);

         // Используем WordAnalyzer
        WordAnalyzer analyzer = new WordAnalyzer();
        Map<String, Integer> wordAnalysis = analyzer.analyze(inputText);
        System.out.println("Анализ слов: " + wordAnalysis);

        String lengthAnalysis = analyzer.getLongestAndShortestWord(inputText);
        System.out.println(lengthAnalysis);
    }
}
