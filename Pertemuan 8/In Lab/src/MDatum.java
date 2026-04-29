/*  Nama file: MDatum.java
    Deskripsi: Main class untuk mengilustrasikan konsep generik pada kelas dalam polimorfisme
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 29 April 2026
*/

public class MDatum {
    public static void main(String[] args) {
        Kucing K = new Kucing();
        Datum<Anabul> D = new Datum<>();

        D.setIsi(K);
        D.getIsi().gerak();
        D.getIsi().bersuara();

        D.setIsi(new Anjing());
        D.getIsi().gerak();
        D.getIsi().bersuara();

        D.setIsi(new Burung());
        D.getIsi().gerak();
        D.getIsi().bersuara();
    }
}