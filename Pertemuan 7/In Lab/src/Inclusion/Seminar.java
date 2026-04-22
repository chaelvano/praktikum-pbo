/*  Nama file: Seminar.java
    Deskripsi: Class Seminar yang memiliki hubungan kepemilikan lemah ke CivitasAkademika
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Seminar {
    private CivitasAkademika[] peserta = new CivitasAkademika[100];
    private int banyakPeserta;

    public Seminar() {
        this.banyakPeserta = 0;
    }

    public int countPeserta() {
        return this.banyakPeserta;
    }

    public void registrasi(CivitasAkademika peserta) {
        if (this.banyakPeserta < this.peserta.length) {
            this.peserta[this.banyakPeserta] = peserta;

            this.banyakPeserta++;
        } else {
            System.out.println("Seminar sudah penuh");
        }
    }

    public void tampilPeserta() {
        for (int i = 0; i < this.banyakPeserta; i++) {
            System.out.println("Nama: " + this.peserta[i].getNama());
            System.out.println("Nomor: " + this.peserta[i].getNomor());
            System.out.println();
        }
    }

    public int countMahasiswa() {
        int count = 0;

        for (int i = 0; i < this.banyakPeserta; i++) {
            if (this.peserta[i] instanceof Mahasiswa) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        Dosen d1 = new Dosen("Andi", 001);
        Dosen d2 = new Dosen("Budi", 002);
        Mahasiswa m1 = new Mahasiswa("Citra", 001, d1);
        Mahasiswa m2 = new Mahasiswa("Dani", 002, d1);
        Mahasiswa m3 = new Mahasiswa("Edi", 003, d2);
        Mahasiswa m4 = new Mahasiswa("Firman", 004, d2);
        Mahasiswa m5 = new Mahasiswa("Gisel", 005, d2);

        Seminar S = new Seminar();

        S.registrasi(d1);
        S.registrasi(d2);
        S.registrasi(m1);
        S.registrasi(m2);
        S.registrasi(m3);
        S.registrasi(m4);
        S.registrasi(m5);

        System.out.println("Jumlah peserta: " + S.countPeserta());

        S.tampilPeserta();

        System.out.println("Jumlah peserta mahasiswa: " + S.countMahasiswa());

        for (int i = 0; i < S.countPeserta(); i++) {
            if (S.peserta[i] instanceof Mahasiswa mahasiswa) {
                mahasiswa.tampilDataMahasiswa();
            }
        }

        m5.setWali(d1);
        m5.tampilDataMahasiswa();
    }
}
