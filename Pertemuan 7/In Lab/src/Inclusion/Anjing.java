/*  Nama file: Anjing.java
    Deskripsi: Class Anjing yang merupakan subclass dari Anabul
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Anjing extends Anabul {
    public Anjing() {
        super();
    }

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Guk-guk");
    }
}