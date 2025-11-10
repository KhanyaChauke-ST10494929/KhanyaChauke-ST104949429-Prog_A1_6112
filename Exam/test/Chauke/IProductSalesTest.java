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
public class IProductSalesTest {
    
    public IProductSalesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of TotalSales method, of class IProductSales.
     */
    @Test
    public void testTotalSales() {
        System.out.println("TotalSales");
        int[][] productSales = null;
        IProductSales instance = new IProductSalesImpl();
        int expResult = 0;
        int result = instance.TotalSales(productSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AverageSales method, of class IProductSales.
     */
    @Test
    public void testAverageSales() {
        System.out.println("AverageSales");
        int[][] productSales = null;
        IProductSales instance = new IProductSalesImpl();
        double expResult = 0.0;
        double result = instance.AverageSales(productSales);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MaxSale method, of class IProductSales.
     */
    @Test
    public void testMaxSale() {
        System.out.println("MaxSale");
        int[][] productSales = null;
        IProductSales instance = new IProductSales();
        int expResult = 0;
        int result = instance.MaxSale(productSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MinSale method, of class IProductSales.
     */
    @Test
    public void testMinSale() {
        System.out.println("MinSale");
        int[][] productSales = null;
        IProductSales instance = new IProductSales();
        int expResult = 0;
        int result = instance.MinSale(productSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    
}
