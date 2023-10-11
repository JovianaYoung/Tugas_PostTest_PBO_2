/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class Souvenir implements Abstraction {
    private String name;
    private double price;
    private Category category;

    public Souvenir(String name, double price, Category category) {
        
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama: " + name + ", Harga: " + price);
        category.displayInfo();
    }

    @Override
    public String toString() {
        return "Nama: " + name + ", Harga: " + price + ", Kategori: " + category;
    }
}