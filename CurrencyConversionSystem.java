import java.util.Scanner;

public class CurrencyConversionSystem {
    private CurrencyConverter fromConverter;
    private CurrencyConverter toConverter;

    public CurrencyConversionSystem(CurrencyConverter fromConverter, CurrencyConverter toConverter) {
        this.fromConverter = fromConverter;
        this.toConverter = toConverter;
    }

    public double convert(double amount) {
        // Сначала конвертируем в базовую валюту (USD), затем в целевую валюту
        double amountInBaseCurrency = fromConverter.convert(amount);
        return toConverter.convert(amountInBaseCurrency);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выбор исходной валюты
        System.out.println("Выберите исходную валюту (1 - USD, 2 - EUR): ");
        int fromChoice = scanner.nextInt();
        CurrencyConverter fromConverter;

        switch (fromChoice) {
            case 1:
                fromConverter = new USDConverter();
                break;
            case 2:
                fromConverter = new EURConverter();
                break;
            default:
                System.out.println("Неправильный выбор. Используется USD по умолчанию.");
                fromConverter = new USDConverter();
        }

        // Выбор целевой валюты
        System.out.println("Выберите целевую валюту (1 - USD, 2 - EUR): ");
        int toChoice = scanner.nextInt();
        CurrencyConverter toConverter;

        switch (toChoice) {
            case 1:
                toConverter = new USDConverter();
                break;
            case 2:
                toConverter = new EURConverter();
                break;
            default:
                System.out.println("Неправильный выбор. Используется USD по умолчанию.");
                toConverter = new USDConverter();
        }

        // Ввод суммы для конвертации
        System.out.println("Введите сумму для конвертации: ");
        double amount = scanner.nextDouble();

        // Создаем систему конвертации и выполняем конвертацию
        CurrencyConversionSystem conversionSystem = new CurrencyConversionSystem(fromConverter, toConverter);
        double convertedAmount = conversionSystem.convert(amount);
        System.out.printf("Конвертированная сумма: %.2f\n", convertedAmount);
    }
}
