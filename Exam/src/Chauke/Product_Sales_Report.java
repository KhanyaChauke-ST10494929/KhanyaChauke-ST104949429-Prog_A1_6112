// ...existing code...
package Chauke;

import java.util.stream.IntStream;
//ChatGPT was consulted for initial topic brainstorm only

public class Product_Sales_Report implements IProductSales {

    private int[][] productSales = {
        {300, 150, 700}, // Year 1
        {250, 200, 600}  // Year 2
    };

    public Product_Sales_Report() {
    }

    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int[] year : productSales) {
            for (int v : year) total += v;
        }
        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        int count = 0;
        int total = 0;
        for (int[] year : productSales) {
            for (int v : year) {
                total += v;
                count++;
            }
        }
        return count == 0 ? 0 : total / (double) count;
    }

    @Override
    public int MaxSale(int[][] productSales) {
        int max = Integer.MIN_VALUE;
        for (int[] year : productSales) {
            for (int v : year) if (v > max) max = v;
        }
        return max;
    }

    @Override
    public int MinSale(int[][] productSales) {
        int min = Integer.MAX_VALUE;
        for (int[] year : productSales) {
            for (int v : year) if (v < min) min = v;
        }
        return min;
    }

    /**
     * Convenience: produce the formatted report for the internal productSales array.
     */
    public String getReport() {
        int total = TotalSales(productSales);
        double avg = AverageSales(productSales);
        int max = MaxSale(productSales);
        int min = MinSale(productSales);

        return String.format(
            "PRODUCT SALES REPORT – 2025%n" +
            "----------------------------%n" +
            "Total sales: %d%n" +
            "Average sales: %.0f%n" +
            "Maximum sale: %d%n" +
            "Minimum sale: %d",
            total, avg, max, min
        );
    }

    // optional: expose the built-in data if needed
    public int[][] getProductSalesData() {
        return productSales;
    }
}
