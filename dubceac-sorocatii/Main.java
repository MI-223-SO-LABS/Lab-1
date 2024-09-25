public class Main {
    public static void main(String[] args) {
        String inputText = "Пример текста для манипуляций с текстом, где много пробелов, переносов и слов!";

        // Используем AdvancedTextManipulator
        AdvancedTextManipulator manipulator = new AdvancedTextManipulator();
        String manipulatedText = manipulator.manipulate(inputText, true, true, true);
        System.out.println("Манипулированный текст: " + manipulatedText);
    }
}
