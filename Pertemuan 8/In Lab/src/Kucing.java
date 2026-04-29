/*  Nama file: Kucing.java
    Deskripsi: Class Kucing yang merupakan subclass dari Anabul
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 29 April 2026
*/

public class Kucing extends Anabul {
    private Double bobot;

    public Kucing() {
        super();
    }

    public Kucing(String nama) {
        super(nama);
    }

    public Kucing(Double bobot) {
        super();
        this.bobot = bobot;
    }

    public Kucing(String nama, Double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public void setBobot(Double bobot) {
        this.bobot = bobot;
    }

    public Double getBobot() {
        return this.bobot;
    }

    public void gerak() {
        System.out.println("Melata");
    }

    public void bersuara() {
        System.out.println("Meong");
    }
}