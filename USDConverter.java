// Импортируем интерфейс CurrencyConverter
public class USDConverter implements CurrencyConverter {
    private static final double EXCHANGE_RATE = 1.0; // Базовая валюта

    @Override
    public double convert(double amount) {
        return amount * EXCHANGE_RATE;
    }
}
