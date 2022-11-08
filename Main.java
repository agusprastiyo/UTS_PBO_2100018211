public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Agus Prastiyo");
        System.out.println("NIM     : 2100018211");
        System.out.println("Kelas   : D");
        System.out.println("UTS(ujian Tengah Semester)");
        System.out.println("\n");
        Tendik tndk = new Tendik();
        tndk.setNama("Suwiji");
        tndk.setNip(1314151611);
        tndk.setTglLahir("17/10/1967");
        tndk.setAlamat("lampung");
        tndk.setJk("Laki-Laki");
        tndk.setTahunMasuk(2018);

        Dosen dsn = new Dosen();
        dsn.setJurusan("Informatika");
        dsn.setNidn(20181231);
        dsn.setNama("suprioanto S.Kom");
        dsn.setNip(1513245790);
        dsn.setTglLahir("11/02/1977");
        dsn.setJk("Laki-Laki");
        dsn.setAlamat("jogja");
        dsn.setTahunMasuk(2016);

        System.out.println("Nama Tendik         : "+ tndk.getNama());
        System.out.println("NIP  Tendik         : "+ tndk.getNip());
        System.out.println("Tanggal Lahir       : "+ tndk.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ tndk.getJk());
        System.out.println("Alamat              : "+ tndk.getAlamat());
        System.out.println("Tahun masuk         : "+ tndk.getTahunMasuk());
        System.out.println("Gaji pokok          : "+tndk.gajiTotal());
        System.out.println("Upah lembur(20 jam) : "+ tndk.lembur(20));
        System.out.println("Gaji total          : "+ tndk.gajiTotal(20));

        System.out.println("\n");
        System.out.println("Nama Dosen          : "+ dsn.getNama());
        System.out.println("NIDN                : " +dsn.getNidn());
        System.out.println("Jurusan             : " + dsn.getJurusan());
        System.out.println("NIP  Dosen          : "+ dsn.getNip());
        System.out.println("Tanggal Lahir       : "+ dsn.getTglLahir());
        System.out.println("Jenis Kelamin       : "+ dsn.getJk());
        System.out.println("Alamat              : "+ dsn.getAlamat());
        System.out.println("Tahun masuk         : "+ dsn.getTahunMasuk());
        System.out.println("Gaji pokok          : "+ dsn.gajiTotal());
        System.out.println("Kelas lebih (6 SKS) : "+ dsn.mengajarLebih(6));
        System.out.println("Gaji total          : "+ dsn.gajiTotal(6));

    }
}