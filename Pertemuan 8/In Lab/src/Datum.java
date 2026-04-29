/*  Nama file: Datum.java
    Deskripsi: Class Datum yang merupakan sebuah kontainer yang berisi tipe data generik
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 29 April 2026
*/

public class Datum<T> {
    private T isi;

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }

    public T getIsi() {
        return this.isi;
    }
}