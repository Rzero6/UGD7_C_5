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
            Obat<String,Float> O1 = new Obat<>("Migrain","Pill",10000f);
            System.out.println("Masukkan Nama Obat : ");namaObat = br.readLine();
            System.out.println("Masukkan Jenis Obat : ");jenisObat = br.readLine();
            System.out.println("Masukkan Harga Obat : ");harga = Float.parseFloat(br.readLine());
            Obat<String,Float> O2 = new Obat<>(namaObat,jenisObat,harga);
            
            Apoteker<Integer,String> A1 = new Apoteker<>(1234,2025,"Lala");
            System.out.println("\nMasukkan ID Apoteker : ");idApoteker = Integer.parseInt(br.readLine());
            System.out.println("Masukkan Nama Apoteker : ");namaApoteker = br.readLine();
            System.out.println("Masukkan Tahun Masuk : ");tahunMasuk = Integer.parseInt(br.readLine());
            Apoteker<Integer,String> A2 = new Apoteker<>(idApoteker,tahunMasuk,namaApoteker);
            
            Apotek AP1 = new Apotek("Apotek 1 - 5");
            AP1.addX(O1);
            AP1.addX(O2);
            
            Apotek AP2 = new Apotek("Apotek 2 - 5");
            AP2.addX(A1);
            AP2.addX(A2);
            
            System.out.println("========================================");
            System.out.println("\t"+AP1.getNamaApotek());
            System.out.println("\t\t[Data Obat]");
            for(int i=0 ; i<AP1.getDaftarX().size();i++){
                System.out.println("\n\t\t==Obat "+(i+1)+"==");
                Obat obat = (Obat) AP1.getDaftarX().get(i);
                obat.showObat();
            }
            System.out.println("========================================");
            System.out.println("\t"+AP2.getNamaApotek());
            System.out.println("\t\t[Data Apoteker]");
            for(int i=0 ; i<AP2.getDaftarX().size();i++){
                System.out.println("\n\t\t==Apoteker "+(i+1)+"==");
                Apoteker apoteker = (Apoteker) AP2.getDaftarX().get(i);
                apoteker.showApoteker();
            }
            System.out.println("========================================");
            
        }catch(Exception e){}
    }

}
