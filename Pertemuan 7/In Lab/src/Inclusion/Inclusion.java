/*  Nama file: Inclusion.java
    Deskripsi: Class Inclusion untuk mengilustrasikan konsep Inclusion dalam polimorfisme
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Inclusion {
    public static void main(String[] args) throws Exception {
        Anabul[] hewan = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };

        for (Anabul h : hewan) {
            h.gerak();
            h.bersuara();
        } 
    }
}