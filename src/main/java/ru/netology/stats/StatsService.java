package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long totalSales = 0;

        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];

        }

        return totalSales;
    }

    public long averageSales(long[] sales) {
        long totalSales = 0;

        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }

        return totalSales / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int countBelowAverageMonth(long[] sales) {
        int count = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }

        return count;
    }

    public int countAboveAverageMonth(long[] sales) {
        int count = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale >= averageSales) {
                count++;
            }
        }

        return count;
    }
}