/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd7_c_5;

/**
 *
 * @author VICTUS
 */
public class Apoteker<T,U> {
    private T idApoteker,tahunMasuk;
    private U namaApoteker;

    public Apoteker(T idApoteker, T tahunMasuk, U namaApoteker) {
        this.idApoteker = idApoteker;
        this.tahunMasuk = tahunMasuk;
        this.namaApoteker = namaApoteker;
    }
    
    public void showApoteker(){
        System.out.println("\tID Apoteker       : "+idApoteker);
        System.out.println("\tNama Apoteker     : "+namaApoteker);
        System.out.println("\tTahun Masuk       :"+tahunMasuk);
    }
}
