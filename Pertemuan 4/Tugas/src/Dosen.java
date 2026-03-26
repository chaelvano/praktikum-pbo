/*  Nama file: Dosen.java
    Deskripsi: Class Dosen yang merupakan subclass dari Pegawai dan superclass dari DosenTetap dan DosenTamu
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 11 Maret 2026
*/

public class Dosen extends Pegawai {
    // Protected fields dapat diakses langsung oleh subclass
    protected String fakultas;

    // Protected constructor hanya dapat dipanggil oleh subclass
    protected Dosen(String nip, String nama, String tanggalLahir, String tanggalTmt, String jabatan, String fakultas, double gajiPokok) {
        super(nip, nama, tanggalLahir, tanggalTmt, jabatan, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
