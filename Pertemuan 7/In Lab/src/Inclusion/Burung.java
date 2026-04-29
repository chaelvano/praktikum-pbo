/*  Nama file: Burung.java
    Deskripsi: Class Burung yang merupakan subclass dari Anabul
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Burung extends Anabul {
    public Burung() {
        super();
    }

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("Cuit");
    }
}