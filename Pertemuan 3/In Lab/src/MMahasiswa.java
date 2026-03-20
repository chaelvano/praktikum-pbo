public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah pbo = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MataKuliah mbd = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa m1 = new Mahasiswa("123", "Andi Budianto", "Informatika");
        Dosen d1 = new Dosen("345", "Citra Dewi", "Informatika");
        Kendaraan k1 = new Kendaraan("H1234AB", "Mobil");

        m1.setDosenWali(d1);
        m1.setKendaraan(k1);
        m1.addMatkul(pbo);
        m1.addMatkul(mbd);
        m1.printDetailMhs();
        System.out.println("Jumlah mata kuliah = " + m1.getJumlahMatkul());
        System.out.println("Jumlah SKS mata kuliah = " + m1.getJumlahSks());
    }
}
