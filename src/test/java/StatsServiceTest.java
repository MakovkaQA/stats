import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test

    public void sumOfAllSales() {

        long expectedSum = 180;
        long actualSum = service.getSalesAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test

    public void averageSalesPerMonth() {

        long expected = 15;
        long actual = service.getAverageValue(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void numberOfTheMonthOfMaximumSales() {

        int expectedNumberOfMonth = 8;
        int actualNumberOfMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedNumberOfMonth, actualNumberOfMonth);
    }


    @Test

    public void numberOfTheMonthOfMinimumSales() {

        int expectedNumberOfMonth = 9;
        int actualNumberOfMonth = service.minSales(sales);

        Assertions.assertEquals(expectedNumberOfMonth, actualNumberOfMonth);
    }

    @Test

    public void sumOfMonthsWithBelowAverageSales() {

        int expectedSumOfMonths = 5;
        int actualSumOfMonths = service.sumOfMonthsWithBelowAverageSales(sales);

        Assertions.assertEquals(expectedSumOfMonths, actualSumOfMonths);
    }


    @Test

    public void sumOfMonthsWithAboveAverageSales() {

        int expectedSumOfMonths = 5;
        int actualSumOfMonths = service.sumOfMonthsWithAboveAverageSales(sales);

        Assertions.assertEquals(expectedSumOfMonths, actualSumOfMonths);
    }

}


