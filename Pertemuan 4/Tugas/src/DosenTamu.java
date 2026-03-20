public class DosenTamu extends Dosen {
    private String nidk;
    private String tbk;
    
    public DosenTamu(String nip, String nidk, String nama, String tanggalLahir, String tanggalTmt, String fakultas, String tbk, double gajiPokok) {
        super(nip, nama, tanggalLahir, tanggalTmt, "Dosen Tamu", fakultas, gajiPokok);
        this.nidk = nidk;
        this.tbk = tbk;
    }

    public String getNidk() {
        return this.nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public String getTbk() {
        return this.tbk;
    }

    public void setTbk(String tbk) {
        this.tbk = tbk;
    }

    public double getTunjangan() {
        return 0.025 * this.getGajiPokok();
    }

    public void printInfo() {
        System.out.println("NIP: " + this.getNip());
        System.out.println("NIDK: " + this.getNidk());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Tanggal Lahir: " + this.getTanggalLahir());
        System.out.println("TMT: " + this.getTanggalTmt());
        System.out.println("Jabatan: " + this.getJabatan());
        System.out.println("Fakultas: " + this.getFakultas());
        System.out.println("Masa Kerja: " + this.getMasaKerja());
        System.out.println("Tanggal Berakhir Kontrak: " + this.getTbk());
        System.out.println("Gaji Pokok: " + this.getGajiPokok());
        System.out.println("Tunjangan: " + this.getTunjangan());
    }
}
