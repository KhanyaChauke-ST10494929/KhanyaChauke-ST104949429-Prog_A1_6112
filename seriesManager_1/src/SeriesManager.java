/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khanya's
 */
import java.util.Scanner;
public class SeriesManager 
{
  



    private Series[] sArr = new Series[2];  
    private int count = 0;  

    public void addSeries(Series newSeries) {
        if (count == sArr.length) {
            Series[] temp = new Series[sArr.length * 2];
            for (int i = 0; i < sArr.length; i++) {
                temp[i] = sArr[i];
            }
            sArr = temp;
        }
        sArr[count] = newSeries;
        count++;
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("No series stored.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(sArr[i]);
            }
        }
    }

    // Delete a series by code or title
    public boolean deleteSeries(String keyword) {
        int index = searchSeries(keyword);
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                sArr[i] = sArr[i + 1]; // shift elements left
            }
            sArr[count - 1] = null; // clear last element
            count--;
            System.out.println("Series deleted successfully!");
            return true;
        } else {
            System.out.println("No series found with: " + keyword);
            return false;
        }
    }

    public int getCount() {
        return count;
    }

    public Series getSeries(int index) {
        if (index >= 0 && index < count) {
            return sArr[index];
        }
        return null;
    }

    public int searchSeries(String keyword) {
        for (int i = 0; i < count; i++) {
            if (sArr[i].getCode().equalsIgnoreCase(keyword) ||
                sArr[i].getTitle().equalsIgnoreCase(keyword)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Capture capture = new Capture(); 
        SeriesManager manager = new SeriesManager();
        int choice;

        do {
            System.out.println("\n=== TV Series Manager ===");
            System.out.println("1. Capture new TV series");
            System.out.println("2. Display all series");
            System.out.println("3. Search for a series");
            System.out.println("4. Delete a series");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    Series newSeries = capture.captureSeries();
                    manager.addSeries(newSeries);
                    System.out.println("Series successfully captured!");
                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    System.out.print("Enter Series Code or Title to search: ");
                    String keyword = input.nextLine();
                    int index = manager.searchSeries(keyword);
                    if (index != -1) {
                        System.out.println("Found: " + manager.getSeries(index));
                    } else {
                        System.out.println("No series found with: " + keyword);
                    }
                    break;

                case 4:
                    System.out.print("Enter Series Code or Title to delete: ");
                    String deleteKey = input.nextLine();
                    manager.deleteSeries(deleteKey);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        input.close();
    }
}
  

