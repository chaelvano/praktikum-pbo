/*  Nama file: Overloading.java
    Deskripsi: Class Overloading untuk mengilustrasikan konsep overloading dalam polimorfisme
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Overloading {
    public static void main(String[] args) throws Exception {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa(002, "Citra Desiana", "Ilmu Komputer");
        Mahasiswa m3 = new Mahasiswa(m2);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        m1.setNim(001);
        m1.setNama("Andi Budianto");
        m1.setProgramStudi(m2);

        m2.setProgramStudi("Manajemen Bisnis");

        m3.setNim(003);
        m3.setNama("Edi Firmansyah");
        m3.setProgramStudi();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
