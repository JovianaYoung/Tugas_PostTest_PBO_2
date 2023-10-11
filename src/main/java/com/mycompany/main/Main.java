/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Asus
 */
import model.Abstraction;
import model.Category;
import model.Souvenir;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {


    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<Abstraction> souvenirs = new ArrayList<>();

        while (true) {
            System.out.println("Toko Souvenir Immanuel");
            System.out.println("1. Tambahkan Souvenir");
            System.out.println("2. Edit Souvenir");
            System.out.println("3. Delete Souvenir");
            System.out.println("4. Tampilkan Semua Souvenir");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Tambah Souvenir
                    System.out.print("Nama Souvenir: ");
                    input.nextLine(); // Clear the newline character
                    String name = input.nextLine();
                    System.out.print("Harga Souvenir: ");
                    double price = input.nextDouble();
                    System.out.print("Kategori Souvenir: ");
                    input.nextLine(); // Clear the newline character
                    String categoryName = input.nextLine();
                    Category category = new Category(categoryName);
                    Souvenir souvenir = new Souvenir(name, price, category);
                    souvenirs.add(souvenir);
                    System.out.println("----Souvenir berhasil ditambahkan.----");
                    break;
                case 2:
                    // Edit Souvenir
                    System.out.print("Masukkan ID Souvenir yang akan diedit: ");
                    int editID = input.nextInt();
                    if (editID >= 0 && editID < souvenirs.size()) {
                        Souvenir souvenirToEdit = (Souvenir) souvenirs.get(editID);
                        System.out.print("Nama Baru: ");
                        input.nextLine(); // Clear the newline character
                        String newName = input.nextLine();
                        System.out.print("Harga Baru: ");
                        double newPrice = input.nextDouble();
                        souvenirToEdit.setName(newName);
                        souvenirToEdit.setPrice(newPrice);
                        System.out.println("----Souvenir berhasil diubah----.");
                    } else {
                        System.out.println("ID Souvenir tidak valid.");
                    }
                    break;
                case 3:
                    // Delete Souvenir
                    System.out.print("Masukkan ID Souvenir yang akan didelete: ");
                    int deleteID = input.nextInt();
                    if (deleteID >= 0 && deleteID < souvenirs.size()) {
                        Abstraction souvenirToDelete = souvenirs.remove(deleteID);
                        System.out.println("Souvenir '" + ((Souvenir) souvenirToDelete).getName() + "' berhasil didelete.");
                    } else {
                        System.out.println("ID Souvenir tidak valid.");
                    }
                    break;
                case 4:
                    // Tampilkan Semua Souvenir
                    System.out.println("Daftar Souvenir:");
                    for (int i = 0; i < souvenirs.size(); i++) {
                        Abstraction souvenirItem = souvenirs.get(i);
                        System.out.print(i + ". ");
                        souvenirItem.displayInfo();
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih! Program telah selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan dicoba lagi.");
            }
        }
    }
}
