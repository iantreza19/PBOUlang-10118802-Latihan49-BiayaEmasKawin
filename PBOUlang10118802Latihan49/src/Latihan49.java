/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas objE = new Emas();
        objE.setHarga(570000);
        objE.setTotalBerat(15.7);
        System.out.println("Hendi Akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total seberat 15,7 gram. jika harga 1 gram emas");
        System.out.println("per bulan oktober ini adalah Rp.570.000. Berapa total");
        System.out.println("harus dikeluarkan oleh hendi ?");
        System.out.println("");
        System.out.println("Jadi Biaya Yang Harus Dikeluarkan Oleh Hendi Adalah "
                + "Rp."+objE.perhitungan());
    }
    
}
