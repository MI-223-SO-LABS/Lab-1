import java.util.Scanner;

public class TextManipulation {

    public String removeSpaces(String input) {
        return input.replaceAll("\\s+", "");
    }

    
    public String reverseText(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Отзеркалирование каждого слова в тексте отдельно
    public String reverseEachWord(String input) {
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        // Удаление последнего лишнего пробела
        return result.toString().trim();
    }

    public static void main(String[] args) {
        TextManipulation manipulator = new TextManipulation();
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Исходный текст: " + text);

        String noSpaces = manipulator.removeSpaces(text);
        System.out.println("Без пробелов: " + noSpaces);

        String reversedText = manipulator.reverseText(text);
        System.out.println("Отзеркаливание текста: " + reversedText);

        String reversedWords = manipulator.reverseEachWord(text);
        System.out.println("Отзеркаливание слов: " + reversedWords);

        scanner.close(); 
    }
}
