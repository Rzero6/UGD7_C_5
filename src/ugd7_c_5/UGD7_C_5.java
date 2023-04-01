/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ugd7_c_5;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.ArrayList;
/**
  
 *
 * @author VICTUS
    Reynold Kunarto             210711015   C
    Febiola Ika Putri Wibowo    210711023   C
 */
public class UGD7_C_5 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaApotek;
        String namaObat, jenisObat;
        float harga;
        int idApoteker, tahunMasuk;
        String namaApoteker;
        
        try{
            System.out.println("Masukkan Nama Obat : ");namaObat = br.readLine();
            System.out.println("Masukkan Jenis Obat : ");jenisObat = br.readLine();
            System.out.println("Masukkan Harga Obat : ");harga = Float.parseFloat(br.readLine());
            
            System.out.println("Masukkan ID Apoteker : ");idApoteker = Integer.parseInt(br.readLine());
            System.out.println("Masukkan Nama APoteker : ");namaApoteker = br.readLine();
            System.out.println("Masukkan Tahun Masuk : ");tahunMasuk = Integer.parseInt(br.readLine());
        }catch(Exception e){}
    }

}
