import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AdvancedTextManipulator {
    // Метод для манипуляций с текстом
    public String manipulate(String text, boolean removeSpaces, boolean reverseText, boolean shuffleLetters) {
        if (removeSpaces) {
            text = text.replaceAll("\\s+", ""); // Удаляем пробелы
        }
        if (reverseText) {
            text = new StringBuilder(text).reverse().toString(); // Реверсируем текст
        }
        if (shuffleLetters) {
            text = shuffleLettersInWords(text); // Перемешиваем буквы в словах
        }
        return text; // Возвращаем манипулированный текст
    }

    // Метод для перемешивания букв в словах
    private String shuffleLettersInWords(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        
        for (String word : words) {
            List<Character> letters = new ArrayList<>();
            for (char letter : word.toCharArray()) {
                letters.add(letter);
            }
            Collections.shuffle(letters, random); // Перемешиваем буквы
            for (char letter : letters) {
                result.append(letter); // Собираем перемешанные буквы
            }
            result.append(" "); // Добавляем пробел между словами
        }
        return result.toString().trim(); // Убираем лишний пробел в конце
    }
}
