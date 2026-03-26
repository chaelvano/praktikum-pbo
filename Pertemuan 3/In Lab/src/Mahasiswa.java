/*  Nama file: Mahasiswa.java
    Deskripsi: Class Mahasiswa yang memiliki hubungan kepemilikan kuat ke Kendaraan dan hubungan kepemilikan rendah ke MataKuliah dan Dosen
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 11 Maret 2026
*/

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatkul = new MataKuliah[50];
    private Dosen dosenWali = new Dosen();
    private Kendaraan kendaraan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
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

    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        if (dosenWali != null) {
            this.dosenWali = dosenWali;
        }
    }

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah matkul) {
        int i = 0;

        while (i < this.listMatkul.length) {
            if (this.listMatkul[i] == null) {
                this.listMatkul[i] = matkul;
                
                return;
            } else {
                i++;
            }
        }

        System.out.println("Mahasiswa tidak dapat memiliki lebih dari 50 mata kuliah!");
    }

    public int getJumlahSks() {
        int jumlahSks = 0;
        int i = 0;

        while (i < this.listMatkul.length && this.listMatkul[i] != null) {
            jumlahSks += this.listMatkul[i].getSks();

            i++;
        }

        return jumlahSks;
    }

    public int getJumlahMatkul() {
        int jumlahMatkul = 0;
        int i = 0;

        while (i < this.listMatkul.length && this.listMatkul[i] != null) {
            jumlahMatkul++;

            i++;
        }

        return jumlahMatkul;
    }

    public void printMhs() {
        System.out.println("NIM: ");
        System.out.println("\t" + this.getNim());

        System.out.println("Nama: ");
        System.out.println("\t" + this.getNama());
        
        System.out.println("Prodi: ");
        System.out.println("\t" + this.getProdi());
    }

    public void printDetailMhs() {
        printMhs();

        System.out.println("Daftar mata kuliah yang diambil: ");
        if (this.getJumlahMatkul() > 0) {
            int i = 0;

            while (i < this.listMatkul.length && this.listMatkul[i] != null) {
                System.out.println("\t" + this.listMatkul[i].getNama());

                i++;
            }
        } else {
            System.out.println("\t-");
        }


        System.out.println("Dosen wali: ");
        System.out.println("\tNIP: ");
        System.out.println("\t\t" + this.dosenWali.getNip());
        System.out.println("\tNama: ");
        System.out.println("\t\t" + this.dosenWali.getNama());
        System.out.println("\tProgram pendidikan: ");
        System.out.println("\t\t" + this.dosenWali.getProdi());

        System.out.println("Kendaraan: ");

        if (this.kendaraan == null) {
            System.out.println("\t-");
        } else {
            System.out.println("\tNomor plat: ");
            System.out.println("\t\t" + this.kendaraan.getNoPlat());
            System.out.println("\tJenis: ");
            System.out.println("\t\t" + this.kendaraan.getJenis());
        }
    }
}
