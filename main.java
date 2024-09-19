    import java.util.Scanner;

public class main {

    
    public static class TextManipulator {

        public String insertLineBreaks(String text, int lineLength) {
            StringBuilder result = new StringBuilder();

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

        public String replaceWord(String text, String oldWord, String newWord) {
            return text.replaceAll("\\b" + oldWord + "\\b", newWord);
        }

        public String swapWords(String text, String word1, String word2) {
            if (!text.contains(word1) || !text.contains(word2)) {
                return "Одно или оба слова не найдены в тексте.";
            }

            text = text.replaceAll("\\b" + word1 + "\\b", "TEMP_WORD");
            text = text.replaceAll("\\b" + word2 + "\\b", word1);
            text = text.replaceAll("TEMP_WORD", word2);

            return text;
        }
    }


    public static class TextManipulation {

        public String removeSpaces(String input) {
            return input.replaceAll("\\s+", "");
        }

        public String reverseText(String input) {
            return new StringBuilder(input).reverse().toString();
        }

        public String reverseEachWord(String input) {
            String[] words = input.split("\\s+");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                result.append(new StringBuilder(word).reverse()).append(" ");
            }

            return result.toString().trim();
        }
    }

    public static void main(String[] args) {
        TextManipulator manipulator = new TextManipulator();
        TextManipulation textManipulation = new TextManipulation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        // Вывод исходного текста
        System.out.println("Исходный текст: " + text);

        // Использование методов из TextManipulation
        System.out.println("Без пробелов: " + textManipulation.removeSpaces(text));
        System.out.println("Отзеркаливание текста: " + textManipulation.reverseText(text));
        System.out.println("Отзеркаливание слов: " + textManipulation.reverseEachWord(text));

        // Использование методов из TextManipulator
        System.out.println("Введите длину строки для переноса (или 0 для переноса по предложениям):");
        int lineLength = scanner.nextInt();
        scanner.nextLine(); // Считывание символа новой строки

        System.out.println("Текст с переносами строк:\n" + manipulator.insertLineBreaks(text, lineLength));

        System.out.println("Введите слово для замены:");
        String oldWord = scanner.nextLine();
        System.out.println("Введите новое слово:");
        String newWord = scanner.nextLine();
        System.out.println("Текст после замены слова: " + manipulator.replaceWord(text, oldWord, newWord));

        System.out.println("Введите первое слово для перестановки:");
        String word1 = scanner.nextLine();
        System.out.println("Введите второе слово для перестановки:");
        String word2 = scanner.nextLine();
        System.out.println("Текст после перестановки слов: " + manipulator.swapWords(text, word1, word2));

        scanner.close();
    }
}


