public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    public MataKuliah() {
    }

    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;

        if (sks > 0 && sks < 4) {
            this.sks = sks;
        }
    }

    public String getIdMatkul() {
        return this.idMatkul;
    }

    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return this.sks;
    }

    public void setSks(int sks) {
        if (sks > 0 && sks < 4) {
            this.sks = sks;
        }
    }
}
