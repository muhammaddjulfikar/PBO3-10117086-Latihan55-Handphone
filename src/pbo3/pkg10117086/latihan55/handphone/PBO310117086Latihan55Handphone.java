/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan55.handphone;

/**
 *
 * @author Lenovo
 * NAMA : RD Muhammad Djulfikar BU 
 * KELAS : IF3 
 * NIM : 10117086
 * DESKRIPSI PROGRAM :
 */
public class PBO310117086Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.displayProduct();
        android.setKeyStore("234ibfd3840fo");
        System.out.println("Andriod Key Store : " + android.getKeyStore());

        BlackBerry blackBerry = new BlackBerry
        ("BlackB", "RIM", "Curve", 2000000);
        blackBerry.displayProduct();
        blackBerry.setPinBB("BHS249");
        System.out.println("PIN : " + blackBerry.getPinBB());

        WindowsPhone windowsPhone = new WindowsPhone
        ("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.displayProduct();
        windowsPhone.setWpKeyStore("UUUQIJWORJ");
        System.out.println("WP Key Store : " + windowsPhone.getWpKeyStore());
    }
    
}
