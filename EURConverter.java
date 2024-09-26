// Импортируем интерфейс CurrencyConverter
public class EURConverter implements CurrencyConverter {
    private static final double EXCHANGE_RATE = 0.92; // Примерный курс к USD

    @Override
    public double convert(double amount) {
        return amount * EXCHANGE_RATE;
    }
}
