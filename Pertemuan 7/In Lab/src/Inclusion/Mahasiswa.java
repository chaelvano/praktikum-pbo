/*  Nama file: Mahasiswa.java
    Deskripsi: Class Mahasiswa yang merupakan subclass dari CivitasAkademika
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Mahasiswa extends CivitasAkademika {
    private int nim;
    private Dosen dosenWali;

    public Mahasiswa(String nama, int nim, Dosen dosenWali) {
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    @Override
    public int getNomor() {
        return this.nim;
    }

    public Dosen getWali() {
        return this.dosenWali;
    }

    public void setNomor(int nim) {
        this.nim = nim;
    }

    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.getNama());
        System.out.println("Dosen Wali: " + this.dosenWali.getNama());
    }
}