/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iconsole;

/**
 *
 * @author Student
 */
import java.util.Scanner; 

  

public class RunApplication { 

    public static void main(String[] args) { 

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Select console device type:");
            
            System.out.println("1. PlayStation 5");
            
            System.out.println("2. Xbox Series X");
            
            System.out.println("3. Nintendo Switch");
            
            System.out.print("Enter choice (1-3): ");
            
            int choice = scanner.nextInt();
            
            scanner.nextLine(); // consume newline
            
            
            
            String consoleType = "";
            
            switch (choice) {
                
                case 1: consoleType = "PlayStation 5"; break;
                
                case 2: consoleType = "Xbox Series X"; break;
                
                case 3: consoleType = "Nintendo Switch"; break;
                
                default: consoleType = "Unknown Console"; break;
                
            }
            
            
            
            System.out.print("Enter store name: ");
            
            String storeName = scanner.nextLine();
            
            
            
            System.out.print("Enter total amount of sales: ");
            
            int totalSales = scanner.nextInt();
            
            
            
            // Instantiate ConsoleSales
            
            ConsoleSales sales = new ConsoleSales(consoleType, storeName, totalSales);
            
            sales.printReport();
        } 

    } 

} 