package ru.netology.stats;

public class StatsService {

    public long sumOfSales(long[] sales) {
        long total = 0;

        for (long t : sales) {
            total = total + t; // суммирем
        }
        return total;
    }

    public long avgSales(long[] sales) {
        long total = sumOfSales(sales); // общая сумма продаж
        return total / sales.length;  // средняя сумма в месяц
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAvgSales(long[] sales) {
        long avgPerMonth = avgSales(sales);
        int belowAvgMonths = 0; // счетчик для месяцев продаж ниже среднего

        for (long t : sales) {
            if (t < avgPerMonth) { // значит, в рассматриваемом i-м месяце продажи были ниже среднего
                belowAvgMonths = belowAvgMonths + 1; // запомним его как минимальный
            }
        }

        return belowAvgMonths;
    }

    public int aboveAvgSales(long[] sales) {
        long avgPerMonth = avgSales(sales);
        int aboveAvgMonths = 0; // счетчик для месяцев продаж выше среднего

        for (long t : sales) {
            if (t > avgPerMonth) { // значит, в рассматриваемом i-м месяце продажи были выше среднего
                aboveAvgMonths = aboveAvgMonths + 1; // запомним его как минимальный
            }
        }

        return aboveAvgMonths;


    }
}