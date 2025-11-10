// ...existing code...
package Chauke;

public interface IProductSales {
   
    int[][] getProductSales();
    int getTotalSales();
    
    int getSalesOverLimit(int limit);

    int TotalSales(int[][] productSales);
    double AverageSales(int[][] productSales);
    int MaxSale(int[][] productSales);
    int MinSale(int[][] productSales);
}

class ProductSales implements IProductSales {

 
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int[] year : productSales) {
            for (int q : year) {
                total += q;
            }
        }
        return total;
    }

   
    public double AverageSales(int[][] productSales) {
        int count = 0;
        int total = 0;
        for (int[] year : productSales) {
            for (int q : year) {
                total += q;
                count++;
            }
        }
        return total / (double) count;
    }

  
    public int MaxSale(int[][] productSales) {
        int max = Integer.MIN_VALUE;
        for (int[] year : productSales) {
            for (int q : year) {
                if (q > max) {
                    max = q;
                }
            }
        }
        return max;
    }


    public int MinSale(int[][] productSales) {
        int min = Integer.MAX_VALUE;
        for (int[] year : productSales) {
            for (int q : year) {
                if (q < min) {
                    min = q;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] sales = {
            {300, 150, 700}, // Year 1
            {250, 200, 600}  // Year 2
        };

        ProductSales ps = new ProductSales();

        int total = ps.TotalSales(sales);
        double avg = ps.AverageSales(sales);
        int max = ps.MaxSale(sales);
        int min = ps.MinSale(sales);

        System.out.println("PRODUCT SALES REPORT – 2025");
        System.out.println("----------------------------");
        System.out.printf("Total sales: %d%n", total);
        System.out.printf("Average sales: %.0f%n", avg);
        System.out.printf("Maximum sale: %d%n", max);
        System.out.printf("Minimum sale: %d%n", min);
    }

    
    public int[][] getProductSales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public int getTotalSales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public int getSalesOverLimit(int limit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
