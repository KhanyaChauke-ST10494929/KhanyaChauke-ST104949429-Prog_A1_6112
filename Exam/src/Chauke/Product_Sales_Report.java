/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chauke;

import java.util.stream.IntStream;

/**
 *
 * @author Khanya's
 */
public class Product_Sales_Report 
{
    public class property_Sales {

    private int[] Year_1 = {300, 150, 700};
    private int[] Year_2 = {250, 200, 600};

    public property_Sales() {
        int sum1 = IntStream.of(Year_1).sum();
        int sum2=IntStream.of(Year_2).sum();
        int total=sum1+sum2;
        double Avg=total/6;
        int max = 0;
for (int i = 0; i < Year_1.length; i++) {
    max = i;
    for (int j = i + 1; j < Year_1.length; j++) 
    {
 
        

    }
 int minYear1 = Year_1[0];
            int maxYear1 = Year_1[0];
            for (int v : Year_1) {
                if (v < minYear1) minYear1 = v;
                if (v > maxYear1) maxYear1 = v;
            }

            // compute min/max for Year_2
            int minYear2 = Year_2[0];
            int maxYear2 = Year_2[0];
            for (int v : Year_2) {
                if (v < minYear2) minYear2 = v;
                if (v > maxYear2) maxYear2 = v;
            }

    public static void main(String[] args) {
       
    }
}

}
