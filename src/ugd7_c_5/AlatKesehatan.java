/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd7_c_5;

/**
 *
 * @author VICTUS
 */
public class AlatKesehatan <J,K> {
    private J namaAlatKesehatan;
    private K harga;

    public AlatKesehatan(J namaAlatKesehatan, K harga) {
        this.namaAlatKesehatan = namaAlatKesehatan;
        this.harga = harga;
    }
    public void showDataAlatKesehatan(){
        System.out.println("\tNama Alat Kesehatan : "+namaAlatKesehatan);
        System.out.println("\tHarga               : Rp."+harga);
    }
}
