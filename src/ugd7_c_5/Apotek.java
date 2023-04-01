/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd7_c_5;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author VICTUS
 */
public class Apotek<X> {
    private String namaApotek;
    private List<X> daftarX;

    public Apotek(String namaApotek) {
        this.namaApotek = namaApotek;
        this.daftarX = new ArrayList<>();
    }
    
    public void addX(X part){
        daftarX.add(part);
    }

    public String getNamaApotek() {
        return namaApotek;
    }

    public List<X> getDaftarX() {
        return daftarX;
    }
    
    
}
