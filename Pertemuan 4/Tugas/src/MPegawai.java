public class MPegawai {
    public static void main(){
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548",
            "78647324",
            "Andi Baharuddin",
            "5 Mei 1990",
            "1 Januari 2015",
            "Fakultas Sains dan Matematika",
            5000000.00
        );
        DosenTamu dosenTamu = new DosenTamu(
            "9545647549",
            "78647325",
            "Cahyo Dwiputra",
            "1 Desember 1967",
            "1 Januari 2005",
            "Fakultas Sains dan Matematika",
            "31 Juli 2031",
            3000000.00
        );
        TenagaKependidikan tenagaKependidikan = new TenagaKependidikan(
            "9545647550",
            "Eko Firmansyah",
            "24 Januari 1999",
            "1 Januari 2020",
            "Akademik",
            2500000.00
        );

        System.out.println("Tanggal Hari Ini: " + Pegawai.TANGGAL_HARI_INI);
        System.out.println();
        dosenTetap.printInfo();
        System.out.println();
        dosenTamu.printInfo();
        System.out.println();
        tenagaKependidikan.printInfo();
    }
}
