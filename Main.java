import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Математические операции");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel label1 = new JLabel("Число 1:");
        label1.setBounds(10, 20, 80, 25);
        panel.add(label1);

        JTextField number1 = new JTextField(10);
        number1.setBounds(100, 20, 165, 25);
        panel.add(number1);

        JLabel label2 = new JLabel("Число 2:");
        label2.setBounds(10, 50, 80, 25);
        panel.add(label2);

        JTextField number2 = new JTextField(10);
        number2.setBounds(100, 50, 165, 25);
        panel.add(number2);

        JLabel resultLabel = new JLabel("Результат:");
        resultLabel.setBounds(10, 160, 300, 25);
        panel.add(resultLabel);

        String[] operations = { "Сложить", "Вычесть", "Умножить", "Делить" };
        JButton[] buttons = new JButton[operations.length];

        for (int i = 0; i < operations.length; i++) {
            buttons[i] = new JButton(operations[i]);
            buttons[i].setBounds(10 + (i % 2) * 130, 90 + (i / 2) * 30, 120, 25);
            panel.add(buttons[i]);

            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        double num1 = Double.parseDouble(number1.getText());
                        double num2 = Double.parseDouble(number2.getText());
                        double result = 0;

                        switch (operations[i]) {
                            case "Сложить": result = num1 + num2; break;
                            case "Вычесть": result = num1 - num2; break;
                            case "Умножить": result = num1 * num2; break;
                            case "Делить":
                                if (num2 != 0) result = num1 / num2;
                                else { resultLabel.setText("Ошибка: Деление на ноль."); return; }
                                break;
                        }
                        resultLabel.setText("Результат: " + result);
                    } catch (NumberFormatException ex) {
                        resultLabel.setText("Ошибка: Введите корректные числа.");
                    }
                }
            });
        }
    }
