/*  Nama file: Dosen.java
    Deskripsi: Class Dosen yang merupakan subclass dari CivitasAkademika
    Pembuat: Michael Stevano (24060124140187)
    Tanggal: 22 April 2026
*/

public class Dosen extends CivitasAkademika {
    private int nip;

    public Dosen(String nama, int nip) {
        super(nama);
        this.nip = nip;
    }

    @Override
    public int getNomor() {
        return this.nip;
    }

    public void setNomor(int nip) {
        this.nip = nip;
    }
}