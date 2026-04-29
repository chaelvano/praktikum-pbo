/*  Nama file: Data.java
    Deskripsi: Class Data yang memiliki field berupa larik dengan tipe generik dan jumlah isi dari larik tersebut
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 29 April 2026
*/

public class Data<T> {
    private T[] ruang = (T[]) new Object[100];
    private int banyak = 0;

    public void setIsi(int i, T isiBaru) {
        if (i < 1 || i > 100) {
            throw new IndexOutOfBoundsException("Indeks yang dimasukkan berada di luar batas indeks larik (1 .. 100)");
        }

        i = i - 1;

        if (ruang[i] == null && isiBaru != null) {
            this.banyak++;
        } else if (ruang[i] != null && isiBaru == null) {
            this.banyak--;
        } 

        this.ruang[i] = isiBaru;
    }

    public T getIsi(int i) {
        if (i < 1 || i > 100) {
            throw new IndexOutOfBoundsException("Indeks yang dimasukkan berada di luar batas indeks larik (1 .. 100)");
        }

        return ruang[i - 1];
    }

    public int getSize() {
        return this.banyak;
    }
}