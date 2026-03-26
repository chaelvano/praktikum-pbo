/*  Nama file: Dosen.java
    Deskripsi: Class Dosen yang memiliki hubungan kepemilikan lemah dari Mahasiswa
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 11 Maret 2026
*/

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen() {
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
