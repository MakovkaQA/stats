package ru.netology.stats;

public class StatsService {

    public long getSalesAmount(long[] sales) {
        long sum = 0;
        for (long s : sales) {
            sum = sum + s;
        }
        return sum;
    }


    public long getAverageValue(long[] sales) {
        long sum = getSalesAmount(sales);
        return sum / sales.length;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int sumOfMonthsWithBelowAverageSales(long[] sales) {
        long averageSale = getAverageValue(sales);
        int sumOfMonths = 0;

        for (long sale : sales) {
            if (sale < averageSale) {
                sumOfMonths = sumOfMonths + 1;
            }
        }
        return sumOfMonths;
    }


    public int sumOfMonthsWithAboveAverageSales(long[] sales) {
        long averageSale = getAverageValue(sales);
        int sumOfMonths = 0;

        for (long sale : sales) {
            if (sale > averageSale) {
                sumOfMonths = sumOfMonths + 1;
            }
        }
        return sumOfMonths;
    }


}
