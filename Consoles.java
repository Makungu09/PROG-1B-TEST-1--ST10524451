/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iconsole;

/**
 *
 * @author Student
 */
public abstract class Consoles implements IConsoles { 

    protected String consoleType; 

    protected String storeName; 

    protected int totalSales; 

  

    // Constructor as per brief 

    public Consoles(String consoleType, String storeName, int totalSales) { 

        this.consoleType = consoleType; 

        this.storeName = storeName; 

        this.totalSales = totalSales; 

    } 

  

    @Override 

    public String getConsoleType() { 

        return consoleType; 

    } 

  

    @Override 

    public String getStore() { 

        return storeName; 

    } 

  

    @Override 

    public int getTotalSales() { 

        return totalSales; 

    } 

}  
