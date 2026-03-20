/*  Nama file: Garis.java
    Deskripsi: Kelas Garis untuk merepresentasikan sebuah garis yang dibentuk oleh dua buah objek Titik pada bidang 2D
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 25 Februari 2026
*/

public class Garis {
    private Titik awal;
    private Titik akhir;
    private static int counterGaris = 0;

    public Garis() {
        this.awal = new Titik();
        this.akhir = new Titik(1, 1);
        counterGaris += 1;
    }

    public Garis(double x1, double y1, double x2, double y2) { // overload constructor
        this.awal = new Titik(x1, y1);
        this.akhir = new Titik(x2, y2);
        counterGaris += 1;
    }

    public Garis(Titik awal, Titik akhir) { // overload constructor
        this.awal = awal;
        this.akhir = akhir;
        counterGaris += 1;
    }

    public Titik getAwal() {
        return this.awal;
    }

    public void setAwal(Titik awal) {
        this.awal = awal;
    }

    public void setAwal(double x, double y) {   // overload setAwal
        this.awal.setAbsis(x);
        this.awal.setOrdinat(y);
    }

    public Titik getAkhir() {
        return this.akhir;
    }

    public void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    public void setAkhir(double x, double y) {   // overload setAkhir
        this.akhir.setAbsis(x);
        this.akhir.setOrdinat(y);
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public double getPanjang() {
        // ((x1 - x2)^2 + (y1 - y2)^2)^(1/2)
        return Math.sqrt(Math.pow(this.awal.getAbsis() - this.akhir.getAbsis(), 2) + Math.pow(this.awal.getOrdinat() - this.akhir.getOrdinat(), 2));
    }

    public double getGradien() {
        double dx = this.akhir.getAbsis() - this.awal.getAbsis();
        double dy = this.akhir.getOrdinat() - this.awal.getOrdinat();

        if (dx == 0) {  // gradien dari garis vertikal tidak terdefinisi (dx = 0)
            throw new ArithmeticException("Gradien dari garis vertikal tidak terdefinisi");
        }

        return dy / dx;
    }

    public Titik getTitikTengah() {
        // (x1 + x2) / 2, (y1 + y2) / 2
        return new Titik((this.awal.getAbsis() + this.akhir.getAbsis()) / 2, (this.awal.getOrdinat() + this.akhir.getOrdinat()) / 2);
    }

    public boolean isSejajar(Garis garis) {
        double dx1 = this.akhir.getAbsis() - this.awal.getAbsis();
        double dy1 = this.akhir.getOrdinat() - this.awal.getOrdinat();
        double dx2 = garis.akhir.getAbsis() - garis.awal.getAbsis();
        double dy2 = garis.akhir.getOrdinat() - garis.awal.getOrdinat();

        // Jika membandingkan gradien secara langsung, terkadang perbandingan double dapat menghasilkan hasil yang tidak akurat
        return (dy1 * dx2) == (dy2 * dx1);
    }

    public boolean isTegakLurus(Garis garis) {
        double dx1 = this.akhir.getAbsis() - this.awal.getAbsis();
        double dy1 = this.akhir.getOrdinat() - this.awal.getOrdinat();
        double dx2 = garis.akhir.getAbsis() - garis.awal.getAbsis();
        double dy2 = garis.akhir.getOrdinat() - garis.awal.getOrdinat();

        return (dx1 * dx2) + (dy1 * dy2) == 0;
    }

    public void printGaris() {
        System.out.println("Garis (" + this.awal + " - (" + this.akhir + ")");  // pake Titik.toString() yang udah dioverload
    }

    @Override   // kali aja perlu
    public String toString() {
        return "Garis (" + this.awal + "-" + this.akhir + ")";  // pake Titik.toString() yang udah dioverload
    }
}