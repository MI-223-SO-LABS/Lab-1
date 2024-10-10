import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {
    public static void main(String[] args) {
        // Создаем основное окно
        JFrame frame = new JFrame("Математические операции");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Создаем панель
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Отображаем окно
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Метка для первого числа
        JLabel label1 = new JLabel("Число 1:");
        label1.setBounds(10, 20, 80, 25);
        panel.add(label1);

        // Поле ввода для первого числа
        JTextField number1 = new JTextField(10);
        number1.setBounds(100, 20, 165, 25);
        panel.add(number1);

        // Метка для второго числа
        JLabel label2 = new JLabel("Число 2:");
        label2.setBounds(10, 50, 80, 25);
        panel.add(label2);

        // Поле ввода для второго числа
        JTextField number2 = new JTextField(10);
        number2.setBounds(100, 50, 165, 25);
        panel.add(number2);

        // Кнопка для сложения
        JButton addButton = new JButton("Сложить");
        addButton.setBounds(10, 90, 120, 25);
        panel.add(addButton);

        // Кнопка для вычитания
        JButton subtractButton = new JButton("Вычесть");
        subtractButton.setBounds(140, 90, 120, 25);
        panel.add(subtractButton);

        // Кнопка для умножения
        JButton multiplyButton = new JButton("Умножить");
        multiplyButton.setBounds(10, 120, 120, 25);
        panel.add(multiplyButton);

        // Кнопка для деления
        JButton divideButton = new JButton("Делить");
        divideButton.setBounds(140, 120, 120, 25);
        panel.add(divideButton);

        // Поле для вывода результата
        JLabel resultLabel = new JLabel("Результат:");
        resultLabel.setBounds(10, 160, 300, 25);
        panel.add(resultLabel);

        // Обработка событий нажатий на кнопки
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(number1.getText());
                    double num2 = Double.parseDouble(number2.getText());
                    double result = num1 + num2;
                    resultLabel.setText("Результат: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Ошибка: Введите корректные числа.");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(number1.getText());
                    double num2 = Double.parseDouble(number2.getText());
                    double result = num1 - num2;
                    resultLabel.setText("Результат: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Ошибка: Введите корректные числа.");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(number1.getText());
                    double num2 = Double.parseDouble(number2.getText());
                    double result = num1 * num2;
                    resultLabel.setText("Результат: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Ошибка: Введите корректные числа.");
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(number1.getText());
                    double num2 = Double.parseDouble(number2.getText());
                    if (num2 != 0) {
                        double result = num1 / num2;
                        resultLabel.setText("Результат: " + result);
                    } else {
                        resultLabel.setText("Ошибка: Деление на ноль.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Ошибка: Введите корректные числа.");
                }
            }
        });
    }
}
