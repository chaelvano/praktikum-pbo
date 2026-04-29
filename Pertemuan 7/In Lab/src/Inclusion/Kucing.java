/*  Nama file: Kucing.java
    Deskripsi: Class Kucing yang merupakan subclass dari Anabul
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Kucing extends Anabul {
    public Kucing() {
        super();
    }

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Meong");
    }
}