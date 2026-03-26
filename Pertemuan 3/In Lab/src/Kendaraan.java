/*  Nama file: Kendaraan.java
    Deskripsi: Class Kendaraan yang memiliki hubungan kepemilikan kuat dari Mahasiswa
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 11 Maret 2026
*/

public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan() {
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        
        if (jenis.equalsIgnoreCase("motor")) {
            this.jenis = "Motor";
        } else if (jenis.equalsIgnoreCase("mobil")) {
            this.jenis = "Mobil";
        }
    }

    public String getNoPlat() {
        return this.noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        if (jenis.equalsIgnoreCase("Motor")) {
            this.jenis = "Motor";
        } else if (jenis.equalsIgnoreCase("Mobil")) {
            this.jenis = "Mobil";
        }
    }
}
