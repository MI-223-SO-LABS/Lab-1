public class TextManipulator {

    public String insertLineBreaks(String text, int lineLength) {
        StringBuilder result = new StringBuilder();

        // Если длина переноса не задана или отрицательная, переносим по точкам
        if (lineLength <= 0) {
            String[] sentences = text.split("\\.");
            for (String sentence : sentences) {
                result.append(sentence.trim()).append(".\n");
            }
        } else {
            int start = 0;
            while (start < text.length()) {
                int end = Math.min(start + lineLength, text.length());
                result.append(text.substring(start, end)).append("\n");
                start = end;
            }
        }

        return result.toString();
    }

    // Метод для замены слова
    public String replaceWord(String text, String oldWord, String newWord) {
        return text.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    // Метод для перестановки слов в тексте
    public String swapWords(String text, String word1, String word2) {
        // Проверяем, что оба слова существуют в тексте
        if (!text.contains(word1) || !text.contains(word2)) {
            return "Одно или оба слова не найдены в тексте.";
        }

        // Используем регулярные выражения, чтобы заменить слова местами
        text = text.replaceAll("\\b" + word1 + "\\b", "TEMP_WORD");
        text = text.replaceAll("\\b" + word2 + "\\b", word1);
        text = text.replaceAll("TEMP_WORD", word2);

        return text;
    }

}
