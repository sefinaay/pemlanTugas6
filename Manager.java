package tugasEnam;

//kelas Manager merupakan subclass dari kelas Pekerja
//kelas ini juga merupakan subclass dari kelas Manusia
public class Manager extends Pekerja {

    //deklarasi atribut kelas
    private String departemen;

    //method konstruktor dengan parameter tambahan untuk atribut manager, yaitu departemen 
    public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);       //memanggil konstruktor dari kelas induk Pekerja
        this.departemen = departemen;
    }

    //method getter untuk departemen
    public String getDepartemen() {
        return departemen;
    }

    //method setter untuk departemen
    //method ini digunakan untuk mengubah nilai dari atribut departemen
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    //override method getPendapatan dari kelas induk Pekerja
    //method ini akan menambahkan tunjangan 10% dari gaji ke dalam pendapatan manager
    //method ini juga memanggil method getPendapatan() dari kelas induk Pekerja
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (getGaji() * 0.10);
    }

    //override method toString dari kelas induk Pekerja, method ini akan menampilkan informasi lengkap tentang manager
    @Override
    public String toString() {      
        //memanggil toString() dari kelas induk Pekerja, menambahkan informasi tentang informasi departemen
        return super.toString() + String.format("Departemen\t: %s\n", departemen);
    }
}