/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo.lat52;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */


public class PBOLat52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input NIP Dosen
        System.out.print("NIP DOSEN: ");
        String nipDosen = input.nextLine();

        // Output informasi Dosen
        System.out.println("Saya Dosen");
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO");

        // Menampilkan NIP Dosen yang diinputkan
        System.out.println("NIP Dosen: " + nipDosen);

    }
}