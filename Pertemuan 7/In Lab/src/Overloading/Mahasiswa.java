/*  Nama file: Mahasiswa.java
    Deskripsi: Class Mahasiswa yang memiliki field nim, nama, dan programStudi
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Mahasiswa {
    private int nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = -999;
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(int nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa mahasiswa) {
        this.nim = mahasiswa.getNim();
        this.nama = mahasiswa.getNama();
        this.programStudi = mahasiswa.getProgramStudi();
    }

    public int getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProgramStudi() {
        return this.programStudi;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa mahasiswa) {
        this.programStudi = mahasiswa.getProgramStudi();
    }

    @Override
    public String toString() {
        return "[Mahasiswa]\nNIM: " + this.nim + "\nNama: " + this.nama + "\nProgram Studi: " + this.programStudi;
    }
}
