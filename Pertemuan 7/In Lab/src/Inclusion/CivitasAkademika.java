/*  Nama file: CivitasAkademika.java
    Deskripsi: Abstract class CivitasAkademika yang merupakan superclass dari Dosen dan Mahasiswa
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public abstract class CivitasAkademika {
    private String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    abstract int getNomor();
}
