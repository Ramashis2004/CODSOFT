//Currency Converter

import java.util.Scanner;



public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base currency: ");
        String baseCurrency = input.nextLine();

        System.out.println("Enter the target currencyyy: ");
        String targetCurrency = input.nextLine();

        System.out.println("Enter the amount to convert: ");
        double amount = input.nextDouble();

        // Fetch exchange rate from a reliable API
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        // Convert the amount to target currency
        double convertedAmount = amount * exchangeRate;

        System.out.printf("Converted amount: %.2f %s", convertedAmount, targetCurrency);
    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        // Fetch exchange rate from a reliable API
        return 1.0;
    }
}
