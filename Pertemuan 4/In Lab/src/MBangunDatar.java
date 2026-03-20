public class MBangunDatar {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(2, "Hijau", "Hitam");
        Lingkaran lingkaran = new Lingkaran(14, "Biru", "Putih");

        System.out.println("Persegi");
        System.out.println("Sisi: " + persegi.getSisi());
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());
        persegi.printInfo();
        
        System.out.println();

        System.out.println("Lingkaran");
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.println("Diameter: " + lingkaran.getDiameter());
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
        lingkaran.printInfo();
        
        System.out.println();

        BangunDatar.printCounterBangunDatar();
    }
}
