/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd7_c_5;

/**
 *
 * @author VICTUS
 */
public class Obat <X,Y> {
    private X namaObat,jenisObat;
    private Y harga;

    public Obat(X namaObat, X jenisObat, Y harga) {
        this.namaObat = namaObat;
        this.jenisObat = jenisObat;
        this.harga = harga;
    }
    
    public void showObat(){
        System.out.println("\tNama\t: "+namaObat);
        System.out.println("\tJenis\t: "+jenisObat);
        System.out.println("\tHarga\t: Rp "+harga);
    }
}
