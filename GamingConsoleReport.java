/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport { 

    public static void main(String[] args) { 

  

        // Single dimensional array - cities 

        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"}; 

  

        // Two dimensional array - sales [city][console] - PS5, XBOX, SWITCH 

        int[][] sales = { 

            {1000, 2000, 3000}, // Cape Town 

            {2000, 3000, 4000}, // Port Elizabeth 

            {1500, 1100, 1200} // Pretoria 

        }; 

  

        // Variables for most sales 

        int maxSales = 0; 

        String cityWithMostSales = ""; 

  

        System.out.println("---------------------------------------------------------------"); 

        System.out.println("GAMING CONSOLE REPORT"); 

        System.out.println("---------------------------------------------------------------"); 

        System.out.printf("%-20s %-10s %-10s %-10s\n", "", "PS5", "XBOX", "SWITCH"); 

        System.out.println(); 

  

        for (int i = 0; i < cities.length; i++) { 

            System.out.printf("%-20s %-10d %-10d %-10d\n", 

                cities[i], sales[i][0], sales[i][1], sales[i][2]); 

        } 

  

        System.out.println("\n---------------------------------------------------------------"); 

        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY"); 

        System.out.println("---------------------------------------------------------------"); 

  

        for (int i = 0; i < cities.length; i++) { 

            int total = sales[i][0] + sales[i][1] + sales[i][2]; 

            System.out.println(cities[i] + "\t " + total); 

  

            if (total > maxSales) { 

                maxSales = total; 

                cityWithMostSales = cities[i]; 

            } 

        } 

  

        System.out.println("\nCITY WITH THE MOST SALES: " + cityWithMostSales); 

        System.out.println("\n---------------------------------------------------------------"); 

    } 

} 