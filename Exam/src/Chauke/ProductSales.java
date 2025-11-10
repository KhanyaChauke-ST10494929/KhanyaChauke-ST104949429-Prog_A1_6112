/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chauke;

import java.util.Arrays;

/**
 *
 * @author Khanya's
*/
public class ProductSales implements IProductSales {

    private final int[][] productSales;

    public ProductSales() {
        this(new int[][]{
            {300, 150, 700}, // Year 1
            {250, 200, 600}  // Year 2
        });
    }

    public ProductSales(int[][] productSales) {
        // defensive copy
        this.productSales = new int[productSales.length][];
        for (int i = 0; i < productSales.length; i++) {
            this.productSales[i] = Arrays.copyOf(productSales[i], productSales[i].length);
        }
    }

    
    public int[][] getProductSales() {
        int[][] copy = new int[productSales.length][];
        for (int i = 0; i < productSales.length; i++) {
            copy[i] = Arrays.copyOf(productSales[i], productSales[i].length);
        }
        return copy;
    }

    
    public int getTotalSales() {
        int total = 0;
        for (int[] year : productSales) {
            for (int v : year) total += v;
        }
        return total;
    }

    /**
     * Average of all individual sales values.
     */
    public double getAverageSales() {
        int total = 0;
        int count = 0;
        for (int[] year : productSales) {
            for (int v : year) {
                total += v;
                count++;
            }
        }
        return  total / (double) count;
    }

    
    public int getSalesOverLimit(int limit) {
        int count = 0;
        for (int[] year : productSales) {
            for (int v : year) {
                if (v > limit) count++;
            }
        }
        return count;
    }

   
    public static boolean isSaleOverLimit(int sale, int limit) {
        return sale > limit;
    }

    @Override
    public int TotalSales(int[][] productSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double AverageSales(int[][] productSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int MaxSale(int[][] productSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int MinSale(int[][] productSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
  