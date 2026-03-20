public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        setJmlSisi(1);  // kata kak Taqi sisi lingkaran diisi 1
    }

    public Lingkaran(double diameter, String warna, String border) {    // di diagram parameternya diameter bukan jari-jari
        super(1, warna, border);    // kata kak Taqi sisi lingkaran diisi 1
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public double getDiameter() {
        return 2 * jari;
    }   

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    @Override   // kali aja perlu
    public String toString() {  
        return super.toString() + "\nJari-jari: " + jari;
    }
}
