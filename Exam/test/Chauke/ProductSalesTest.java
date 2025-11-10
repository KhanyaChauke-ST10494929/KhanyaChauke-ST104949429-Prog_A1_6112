/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Chauke;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Khanya's
 */
public class ProductSalesTest {
    
    public ProductSalesTest() {
    }


public class ProductSalesUnitTest {

    private final int[][] SAMPLE = {
        {300, 150, 700}, // Year 1
        {250, 200, 600}  // Year 2
    };

    @Test
    void CalculateTotalSales() {
        ProductSales ps = new ProductSales();
        assertEquals(2200, ps.TotalSales(SAMPLE), "Total sales should be 2200");
    }

    @Test
    void AverageSales() {
        ProductSales ps = new ProductSales();
        assertEquals(2200 / 6.0, ps.AverageSales(SAMPLE), 1e-9, "Average sales should be total/6");
    }
}
    
}
