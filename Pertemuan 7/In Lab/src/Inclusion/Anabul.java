/*  Nama file: Anabul.java
    Deskripsi: Class Anabul yang merupakan superclass dari Kucing, Anjing, dan Burung
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Anabul {
    private String nama;

    public Anabul() {
        this.nama = "Hewan";
    }

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println("Hewan bergerak");
    }

    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
}