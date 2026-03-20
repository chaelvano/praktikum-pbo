public class Pegawai {
    // Protected fields dapat diakses langsung oleh subclass
    protected static String TANGGAL_HARI_INI = "11 Maret 2026"; // Tanggal yang digunakan untuk menghitung masa kerja dan tunjangan

    protected String nip;
    protected String nama;
    protected int angkaHariLahir;
    protected int angkaBulanLahir;
    protected int angkaTahunLahir;
    protected int angkaHariTmt;
    protected int angkaBulanTmt;
    protected int angkaTahunTmt;
    protected String jabatan;
    protected double gajiPokok;

    // Protected constructor hanya dapat dipanggil oleh subclass dan class lain dalam package yang sama
    protected Pegawai(String nip, String nama, String tanggalLahir, String tanggalTmt, String jabatan, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.setTanggalLahir(tanggalLahir);
        this.setTanggalTmt(tanggalTmt);
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        int[] angkaTanggalLahir = {angkaHariLahir, angkaBulanLahir, angkaTahunLahir};

        return this.parseTanggal(angkaTanggalLahir);
    }

    public void setTanggalLahir(String tanggalLahir) {
        int[] angkaTanggalLahir = this.parseTanggal(tanggalLahir);

        this.angkaHariLahir = angkaTanggalLahir[0];
        this.angkaBulanLahir = angkaTanggalLahir[1];
        this.angkaTahunLahir = angkaTanggalLahir[2];
    }

    public String getTanggalTmt() {
        int[] angkaTanggalTmt = {angkaHariTmt, angkaBulanTmt, angkaTahunTmt};

        return parseTanggal(angkaTanggalTmt);
    }

    public void setTanggalTmt(String tanggalTmt) {
        int[] angkaTanggalTmt = this.parseTanggal(tanggalTmt);

        this.angkaHariTmt = angkaTanggalTmt[0];
        this.angkaBulanTmt = angkaTanggalTmt[1];
        this.angkaTahunTmt = angkaTanggalTmt[2];
    }

    public String getJabatan() {
        return this.jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getMasaKerja() {
        int jumlahBulan = this.getJumlahBulanMasaKerja();

        return (jumlahBulan / 12) + " Tahun " + (jumlahBulan % 12) + " Bulan";
    }

    public double getGajiPokok() {
        return this.gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    protected int[] parseTanggal(String tanggal) {
        String[] strings = tanggal.split(" ");
        int[] angka = new int[3];
        
        angka[0] = Integer.parseInt(strings[0]);

        switch (strings[1].toLowerCase()) {
            case "januari" -> angka[1] = 1;
            case "februari" -> angka[1] = 2;
            case "maret" -> angka[1] = 3;
            case "april" -> angka[1] = 4;
            case "mei" -> angka[1] = 5;
            case "juni" -> angka[1] = 6;
            case "juli" -> angka[1] = 7;
            case "agustus" -> angka[1] = 8;
            case "september" -> angka[1] = 9;
            case "oktober" -> angka[1] = 10;
            case "november" -> angka[1] = 11;
            case "desember" -> angka[1] = 12;    
        }

        angka[2] = Integer.parseInt(strings[2]);

        return angka;
    }

    protected String parseTanggal(int[] tanggal) {
        String string = tanggal[0] + " ";

        switch (tanggal[1]) {
            case 1 -> string += "Januari";
            case 2 -> string += "Februari";
            case 3 -> string += "Maret";
            case 4 -> string += "April";
            case 5 -> string += "Mei";
            case 6 -> string += "Juni";
            case 7 -> string += "Juli";
            case 8 -> string += "Agustus";
            case 9 -> string += "September";
            case 10 -> string += "Oktober";
            case 11 -> string += "November";
            case 12 -> string += "Desember";    
        }

        string += " " + tanggal[2];

        return string;
    }

    protected int getJumlahBulanMasaKerja() {
        int[] angkaTanggalHariIni = this.parseTanggal(TANGGAL_HARI_INI);
        
        int jumlahBulan = ((12 * angkaTanggalHariIni[2]) + angkaTanggalHariIni[1]) - ((12 * this.angkaTahunTmt) + this.angkaBulanTmt);

        return jumlahBulan;
    }
}
