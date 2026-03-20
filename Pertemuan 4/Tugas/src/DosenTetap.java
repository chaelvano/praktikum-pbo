public class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap(String nip, String nidn, String nama, String tanggalLahir, String tanggalTmt, String fakultas, double gajiPokok) {
        super(nip, nama, tanggalLahir, tanggalTmt, "Dosen Tetap", fakultas, gajiPokok);
        this.nidn = nidn;
    }

    public String getNidn() {
        return this.nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getTanggalPensiun() {
        int[] angkaTanggalPensiun = {1, (this.angkaBulanLahir % 12) + 1, this.angkaTahunLahir + 65 + (this.angkaBulanLahir / 12)};

        return this.parseTanggal(angkaTanggalPensiun);
    }

    public double getTunjangan() {
        return 0.02 * (this.getJumlahBulanMasaKerja() / 12) * this.getGajiPokok();
    }

    public void printInfo() {
        System.out.println("NIP: " + this.getNip());
        System.out.println("NIDN: " + this.getNidn());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Tanggal Lahir: " + this.getTanggalLahir());
        System.out.println("TMT: " + this.getTanggalTmt());
        System.out.println("Jabatan: " + this.getJabatan());
        System.out.println("Fakultas: " + this.getFakultas());
        System.out.println("Masa Kerja: " + this.getMasaKerja());
        System.out.println("Tanggal Pensiun: " + this.getTanggalPensiun());
        System.out.println("Gaji Pokok: " + this.getGajiPokok());
        System.out.println("Tunjangan: " + this.getTunjangan());
    }
}
