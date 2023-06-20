package testing;

import menuMakanan.Mie;
import menuMakanan.Soto;
import menuMinuman.Dingin;
import menuMinuman.Panas;
import restaurant.Makanan;
import restaurant.Minuman;

public class testAbstract {
    public static void main(String[] args) {
        // Buat objek Mie
        Makanan mie = new Mie("Mie Ayam", "Mie", 15000);
        System.out.println("Makanan: " + mie.getNama());
        System.out.println("Jenis: " + mie.getJenis());
        System.out.println("Harga: " + mie.getHarga());

        // Buat objek Soto
        Makanan soto = new Soto("Soto Betawi", "Soto", 18000);
        System.out.println("Makanan: " + soto.getNama());
        System.out.println("Jenis: " + soto.getJenis());
        System.out.println("Harga: " + soto.getHarga());

        // Buat objek Dingin
        Minuman dingin = new Dingin("Es Teh Manis", "Dingin", 5000);
        System.out.println("Minuman: " + dingin.getNama());
        System.out.println("Jenis: " + dingin.getJenis());
        System.out.println("Harga: " + dingin.getHarga());

        // Buat objek Panas
        Minuman panas = new Panas("Kopi Tubruk", "Panas", 8000);
        System.out.println("Minuman: " + panas.getNama());
        System.out.println("Jenis: " + panas.getJenis());
        System.out.println("Harga: " + panas.getHarga());
    }
}
