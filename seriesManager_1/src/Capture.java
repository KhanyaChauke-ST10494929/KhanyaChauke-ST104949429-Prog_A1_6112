
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khanya's
 */
import java.util.Scanner;
public class Capture 
{


    private Scanner input = new Scanner(System.in);

    public Series captureSeries() {
        System.out.println("\n=== Capture New TV Series ===");

        System.out.print("Enter Series Code: ");
        String code = input.nextLine();

        System.out.print("Enter Series Title: ");
        String title = input.nextLine();

        System.out.print("Enter Series Genre: ");
        String genre = input.nextLine();

        
       
        

        System.out.print("Enter Rating (0.0 - 10.0): ");
        double rating = input.nextDouble();
        input.nextLine(); // consume newline
        int year = 0;

        return new Series(code, title, genre, year, rating);
    }
    

}
