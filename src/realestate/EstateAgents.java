/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestate;

/**
 *
 * @author Admin
 */
public class EstateAgents 
{
    
public class PropertySales {

    public static void main(String[] args) {

        // Store estate agent names
        String[] agents = {"Joe Bloggs", "Jane Doe"};

        // Two-dimensional array storing sales for Jan, Feb and March
        int[][] sales = {
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000}
        };

        // Variables to store totals
        int[] totalSales = new int[2];

        // Calculate total sales for each estate agent
        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {
                totalSales[i] += sales[i][j];
            }

            // Calculate 2% commission
            double commission = totalSales[i] * 0.02;

            // Display results
            System.out.println("Estate Agent: " + agents[i]);
            System.out.println("Total Sales: R" + totalSales[i]);
            System.out.println("Commission (2%): R" + commission);
            System.out.println();
        }

        // Determine the top-selling estate agent
        if (totalSales[0] > totalSales[1]) {
            System.out.println("Top Selling Agent: " + agents[0]);
        } else if (totalSales[1] > totalSales[0]) {
            System.out.println("Top Selling Agent: " + agents[1]);
        } else {
            System.out.println("Both agents have equal sales.");
        }
    }
}

}
