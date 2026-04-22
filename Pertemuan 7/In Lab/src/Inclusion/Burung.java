/*  Nama file: Burung.java
    Deskripsi: Class Burung yang merupakan subclass dari Anabul
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Burung extends Anabul {
    private String nama;

    public Burung() {
        super("Burung");
    }

    public void gerak() {
        System.out.println("Terbang");
    }

    public void bersuara() {
        System.out.println("Cuit");
    }
}