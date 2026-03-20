public class TenagaKependidikan extends Pegawai {
    private String bidang;

    public TenagaKependidikan(String nip, String nama, String tanggalLahir, String tanggalTmt, String bidang, double gajiPokok) {
        super(nip, nama, tanggalLahir, tanggalTmt, "Tenaga Kependidikan", gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return this.bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getTanggalPensiun() {
        int[] angkaTanggalPensiun = {1, (this.angkaBulanLahir % 12) + 1, this.angkaTahunLahir + 55 + (this.angkaBulanLahir / 12)};

        return this.parseTanggal(angkaTanggalPensiun);
    }

    public double getTunjangan() {
        return 0.01 * (this.getJumlahBulanMasaKerja() / 12) * this.getGajiPokok();
    }

    public void printInfo() {
        System.out.println("NIP: " + this.getNip());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Tanggal Lahir: " + this.getTanggalLahir());
        System.out.println("TMT: " + this.getTanggalTmt());
        System.out.println("Jabatan: " + this.getJabatan());
        System.out.println("Bidang: " + this.getBidang());
        System.out.println("Masa Kerja: " + this.getMasaKerja());
        System.out.println("Tanggal Pensiun: " + this.getTanggalPensiun());
        System.out.println("Gaji Pokok: " + this.getGajiPokok());
        System.out.println("Tunjangan: " + this.getTunjangan());
    }
}
